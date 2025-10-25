package org.ccasro.level1.exercise1;

public class Main {

    public static void main(String[] args) {

        Worker w = new Worker("Jonan","Ribas",15);

        OnSiteWorker osw = new OnSiteWorker("Carol","Ribas", 20);
        OnlineWorker olw = new OnlineWorker("Javi","Castellano",25);

        int hoursWorked = 160;

        System.out.println("Worker salary: " + w.calculateSalary(hoursWorked));
        System.out.println("OnSite Worker Salary: " + osw.calculateSalary(hoursWorked));
        System.out.println("Online Worker Salary: " + olw.calculateSalary(hoursWorked));

        executeDeprecatedMethods(osw,olw);
    }
    @SuppressWarnings("deprecation")
    private static void executeDeprecatedMethods(OnSiteWorker osw, OnlineWorker olw){
        osw.showGasoline();
        olw.calculateHours();
    }
}