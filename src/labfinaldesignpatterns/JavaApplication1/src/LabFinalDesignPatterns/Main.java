/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabFinalDesignPatterns;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        // HERE U CAN SEE THAT I AM USING THE FACADE CONTROLLER TO SIMPLIFY THE CALLING AND SENDING OF FEEDBACK REQUEST!
        AdminControllerFacade adminControllerFacade = new AdminControllerFacade();
        adminControllerFacade.makeAnnouncementAndFeedback("NABIL FINISHED HIS LAB FINAL!");
    }
}
