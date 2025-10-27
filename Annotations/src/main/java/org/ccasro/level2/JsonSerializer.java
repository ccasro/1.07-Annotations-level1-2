package org.ccasro.level2;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class JsonSerializer {
    public static void serializeToJson(Object obj) throws IOException {
        Class<?> clazz = obj.getClass();

        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new IllegalArgumentException("Class annotation is not equal to @JsonSerializable");
        }

        JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);
        String directory = annotation.directory();
        String fileName = clazz.getSimpleName() + ".json";

        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n");

        Method[] methods = clazz.getDeclaredMethods();
        boolean first = true;
        for(Method method : methods){
            if (method.getName().startsWith("get") && method.getParameterCount() == 0) {
                try {
                    Object value = method.invoke(obj);
                    String key = method.getName().substring(3);
                    if (!first) jsonBuilder.append(",\n");
                    jsonBuilder.append(String.format("  \"%s\": \"%s\"", key, value));
                    first = false;
                } catch (Exception e) {
                    throw new RuntimeException("Cant serialize method " + method.getName() + ": " + e.getMessage());
                }
            }
        }

        jsonBuilder.append("\n}");

        FileWriter writer = new FileWriter(directory + fileName);
        writer.write(jsonBuilder.toString());
        writer.close();
        System.out.println("JSON File created at: " + directory + fileName);
    }

}
