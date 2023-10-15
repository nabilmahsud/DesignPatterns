package lab6.template.refactorguruexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        int choice = 0;
        while (choice != 5) {
            // Enter the message.
            System.out.print("Input message: ");
            String messageDescription = reader.readLine();

            System.out.println("\nChoose social network for posting message.\n" +
                    "1 - Facebook\n" +
                    "2 - Twitter\n" +
                    "3 - LinkedIn\n" +
                    "4 - All networks\n" +
                    "5 - Exit");

            choice = Integer.parseInt(reader.readLine());

            Message message = null;
            // Create proper network object and send the message.
            if (choice == 1) {
                message = new Message(messageDescription, MessageType.INFO, new Facebook(userName, password));
            } else if (choice == 2) {
                message = new Message(messageDescription, MessageType.INFO, new Twitter(userName, password));
            } else if (choice == 3) {
                message = new Message(messageDescription, MessageType.INFO, new LinkedIn(userName, password));
            } else if (choice == 4) {
                message = new Message(messageDescription, MessageType.INFO);
                message.attachNetwork(new Facebook(userName, password));
                message.attachNetwork(new Twitter(userName, password));
                message.attachNetwork(new LinkedIn(userName, password));
            }

            if (choice != 5)
                message.post();

        }
    }
}