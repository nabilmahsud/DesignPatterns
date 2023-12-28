/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabFinalDesignPatterns;

class Teacher implements Observer {
    private FeedbackStrategy feedbackStrategy;

    Teacher(FeedbackStrategy feedbackStrategy) {
        this.feedbackStrategy = feedbackStrategy;
    }

    @Override
    public void update(String message) {
        System.out.println("Teacher received announcement: " + message);
        feedbackStrategy.giveFeedback();
    }
}