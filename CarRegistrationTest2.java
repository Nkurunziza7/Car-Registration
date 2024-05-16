package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CarRegistrationTest2 {

	@Test
	void testIsPreApproved() {
	    CarRegistration customer = new CarRegistration(20000, 1.5, 1000, "Robert", "Doe", "Male", 1990, "Engineer", 50000);

	    // Add print statements for debugging
	    System.out.println("Base Price: " + customer.getBasePrice());
	    System.out.println("Max Car Price: " + (0.2 * customer.getYearlyIncome()));

	    // Testing if the customer is pre-approved
	    assertTrue(customer.isPreApproved(), "Customer should be pre-approved for the car loan");
	}
}