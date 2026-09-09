package register;

import java.util.Scanner;

public class cashRegister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("How many times do you want to run the code: ");
        int times = input.nextInt();
        for (int i=0; i <= times ; i++ ){
            System.out.print(" Enter the total cost of items: ");
            double totalCost = input.nextDouble();
            System.out.print(" Enter the CashPaid: ");
            double cashPaid = input.nextDouble();
            double change = cashPaid - totalCost;

            if (totalCost > cashPaid ){
                System.out.println("Insufficient Amount Please add "+ -(change) +" in order to pay!" );
            }else if (change == 0){
                System.out.println("No Change! Happy Shopping");
            } else if (cashPaid > totalCost) {
                System.out.println("Your change is "+change);

            }

        }


        input.close();

    }


    }

