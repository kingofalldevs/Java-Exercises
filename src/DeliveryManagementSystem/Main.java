package DeliveryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DeliveryOrder deliveryOrder = new DeliveryOrder();

        boolean userSession = true;
        do {
            System.out.println("Welcome to the Delivery Store Store");
            System.out.println("1.Register a customer \n2.Find order by ID \n3.Place Order \n4.Display all orders \n5.Exit Application");
            int userInput = input.nextInt();
            if(userInput ==5 ){
                userSession =false;
                System.out.println("Exiting Application ....");
            } else if (userInput == 1) {
                System.out.println("Register a customer");
            }else if(userInput == 2){
                System.out.println("Find order \n Enter Order ID: ");

            }else if (userInput == 3){
                System.out.println("Place Order");
            }else if(userInput == 4){
                System.out.println("Display all orders");
            }
        }while(userSession);
    }
}
