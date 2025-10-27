package org.ccasro.level3;

import org.ccasro.level2.Person;
import org.ccasro.level2.JsonSerializable;

public class Main {
    public static void main(String[] args) {

        Class<Person> clazz = Person.class;

        if(clazz.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);

            System.out.println("@JsonSerializable annotation is present.");
            System.out.println("Configured Directory: " + annotation.directory());
        } else {
            System.out.println("The Person class doesn't have @JsonSerializable annotation");
        }
    }
}
