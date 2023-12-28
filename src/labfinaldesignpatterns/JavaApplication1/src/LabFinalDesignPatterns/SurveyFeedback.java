/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabFinalDesignPatterns;

public class SurveyFeedback implements FeedbackStrategy {
    @Override
    public void giveFeedback() {
        System.out.println("Teacher/Parent survey: Rate your satisfaction with the university.");
    }
}