package org.ccasro.level2;

public class Main {

    public static void main(String[] args){
        Person p1 = new Person("James","Harris",21);

        try{
            JsonSerializer.serializeToJson(p1);
        } catch (Exception e) {
            System.err.println("Error serializing:  " + e.getMessage());
          }
    }
}
