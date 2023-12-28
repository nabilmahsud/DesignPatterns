/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabFinalDesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementSystem {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    void sendAnnouncement(String announcement) {
        System.out.println("Sending announcement: " + announcement);
        notifyObservers(announcement);
    }
}