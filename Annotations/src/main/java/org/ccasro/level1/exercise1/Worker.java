package org.ccasro.level1.exercise1;

public class Worker {
    private String name;
    private String surname;
    private double priceHour;

    public Worker(String name, String surname, double priceHour){
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public double calculateSalary(int hoursWorked){
        return hoursWorked * priceHour;
   }
}
