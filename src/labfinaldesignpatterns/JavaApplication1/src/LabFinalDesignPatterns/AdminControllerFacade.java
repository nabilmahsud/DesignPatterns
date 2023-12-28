/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabFinalDesignPatterns;

public class AdminControllerFacade {
    public void makeAnnouncementAndFeedback(String announcementMessage) {
        AnnouncementSystem announcementSystem = new AnnouncementSystem();
        
        // lets assum here that the data is being fetched by the database
        // and we are using this facade controller to simplify
        // the calling of this method

        FeedbackFormFactory feedbackFormFactory = new FeedbackFormFactory();

        Student student = new Student(feedbackFormFactory.createFeedbackForm("student"));
        Teacher teacher = new Teacher(feedbackFormFactory.createFeedbackForm("teacher"));
        Parent parent = new Parent(feedbackFormFactory.createFeedbackForm("parent"));

        announcementSystem.addObserver(student);
        announcementSystem.addObserver(teacher);
        announcementSystem.addObserver(parent);

        announcementSystem.sendAnnouncement(announcementMessage);
    }
}
