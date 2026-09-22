package DeliveryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean userSession = true;
        do {
            System.out.println("Welcome to the Delivery Store Store");
            System.out.println("1.Add order \n2.Find order by ID \n3.Remove order \n4.Display all orders \n5.Exit Application");
            int userInput = input.nextInt();
            if(userInput ==5 ){
                userSession =false;
                System.out.println("Exiting Application ....");
            } else if (userInput == 1) {
                System.out.println("");
            }
        }while(userSession);
    }
}
