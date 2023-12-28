/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabFinalDesignPatterns;

class Student implements Observer {
    private FeedbackStrategy feedbackStrategy;

    Student(FeedbackStrategy feedbackStrategy) {
        this.feedbackStrategy = feedbackStrategy;
    }

    @Override
    public void update(String message) {
        System.out.println("Student received announcement: " + message);
        feedbackStrategy.giveFeedback();
    }
}