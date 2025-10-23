package org.ccasro.level1.exercise1;

public class OnlineWorker extends Worker {

    private static final double FLAT_RATE_INTERNET = 100.35;

    public OnlineWorker(String name, String surname, double priceHour){
        super(name,surname,priceHour);
    }

    @Override
    public double calculateSalary(int hoursWorkedMonth) {
        return (hoursWorkedMonth * getPriceHour()) + FLAT_RATE_INTERNET;
    }
}
