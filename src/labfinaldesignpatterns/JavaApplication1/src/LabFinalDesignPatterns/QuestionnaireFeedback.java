/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabFinalDesignPatterns;

public class QuestionnaireFeedback implements FeedbackStrategy {
    @Override
    public void giveFeedback() {
        System.out.println("Student's feedback questionnaire: How satisfied are you with the university?");
    }
}