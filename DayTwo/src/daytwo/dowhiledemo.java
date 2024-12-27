package daytwo;

import java.util.Scanner;

public class dowhiledemo {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String ch;

	        do {
	            // Get two numbers from the user
	            System.out.print("Enter first number: ");
	            int a = sc.nextInt();

	            System.out.print("Enter second number: ");
	            int b = sc.nextInt();

	            // Calculate the sum
	            int sum = a + b;
	            System.out.println("The sum of " + a + " and " + b + " is: " + sum);

	            // Ask if the user wants to continue
	            System.out.print("Do you want to add more numbers? (yes/no): ");
	            ch = sc.next();

	        } while (ch.equalsIgnoreCase("yes"));

	        System.out.println("Thank you!");
	        sc.close();
	    }
}
