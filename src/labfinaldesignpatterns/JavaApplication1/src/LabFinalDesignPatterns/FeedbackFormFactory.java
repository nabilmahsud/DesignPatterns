/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabFinalDesignPatterns;

public class FeedbackFormFactory {
    FeedbackStrategy createFeedbackForm(String userType) {
        if ("student".equalsIgnoreCase(userType)) {
            return new QuestionnaireFeedback();
        } else if ("teacher".equalsIgnoreCase(userType) || "parent".equalsIgnoreCase(userType)) {
            return new SurveyFeedback();
        } else {
            throw new IllegalArgumentException("Invalid user type: " + userType);
        }
    }
}