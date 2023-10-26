package org.example.patterns.observer;

public class Master {

    private String name;
    private int salary = 80000;
    private String searchingJob;

    public Master(String name, String searchingJob) {
        this.name = name;
        this.searchingJob = searchingJob;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= salary && searchingJob == vacancy.getName()) {
            System.out.printf("Specialist %s: I need this job! (company: %s; salary: %d, vacancy: %s)\n", name, nameCompany, salary, vacancy);
            this.salary = salary;
        }
        else  {
            System.out.printf("Specialist %s: I'll find a better job! (company: %s; salary: %d)\n", name, nameCompany, salary);
        }
    }

}
