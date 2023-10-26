package org.example.patterns.observer;

public class Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendOffer(String companyName, int salary, Vacancy vacancy);


}
