package org.ccasro.level1.exercise1;

public class OnSiteWorker extends Worker {

    private static double gasoline = 50.0;

    public OnSiteWorker(String name, String surname, int priceHour){
        super(name,surname,priceHour);
    }

    @Override
    public double calculateSalary(int hoursWorkedMonth) {
        return (hoursWorkedMonth * getPriceHour()) + gasoline;
    }
}
