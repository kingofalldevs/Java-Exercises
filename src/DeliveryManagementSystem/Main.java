package DeliveryManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DeliveryOrder deliveryOrder = new DeliveryOrder();
        Operations operations = new Operations();
        operations.addVehicles();

       boolean userSession = true;
        try {
          do {
              System.out.println("Welcome to the Delivery Store");
                  System.out.print("1.Your Customers \n2.Find order by ID \n3.Place Order \n4.Display all vehicles \n5.Exit Application :");
                  int userInput = input.nextInt();
                  if (userInput == 5) {
                      userSession = false;
                      System.out.println("Exiting Application ....");
                  } else if (userInput == 1) {
                      System.out.println("1.Register a customer\n2.List Customer \n3.Remove Customer \n4.Search Customer: ");
                       userInput = input.nextInt();
                      if (userInput == 1){
                          operations.registerCustomers();
                      }else if(userInput == 2){
                          operations.displayCustomers();
                      }

                  } else if (userInput == 2) {
                      System.out.println("Find order \n Enter Order ID: ");

                  } else if (userInput == 3) {
                      System.out.println("Place Order");
                  } else if (userInput == 4) {
                      System.out.println("-------- Available Vehicles ------");
                      operations.listVehicles();
                      System.out.println("----------------------------------");
                  }
              } while (userSession) ;

          }catch(InputMismatchException e){
            System.out.println("Type a number");
        }

    }


}
