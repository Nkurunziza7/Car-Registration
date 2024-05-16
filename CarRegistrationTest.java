package assignment1;


import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
/**
 * CarRegistrationTest class to prompt for input of the customer’s data and 
 * instantiate an object of the class CarRegistration and then prints the data from that object. 
 * @author Denis Nkurunzia
  */

public class CarRegistrationTest {
	/**
	 * void main main method to display and read user input
	  */
    public static void main(String[] args) {
    	
    	Scanner scanner=new Scanner(System.in);

        /** Prompt for customer data
         * @param scanner
         */
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Year of Birth: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter Yearly Income: ");
        double yearlyIncome = scanner.nextDouble();

        // Instantiate CarRegistration object
        CarRegistration customer = new CarRegistration(25000, 1.5, 1000, firstName, lastName, gender, birthYear, "Engineer", yearlyIncome);

        // Display customer information
        customer.displayCustomerInfo();
    }
}
