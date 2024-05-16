package assignment1;
/**
 * This class extends the base class CarRegistration.
 * @author Denis Nkurunzia
 */

public class CarRegistration extends CarSelection {
	// variable to hold the buyer's first name
	private double basePrice;
	private double upgradeCoefficient; // value range: 1(no upgrade) to 2 (highest level upgrade)
	private double colorIndex; // value range: 0 (default color) to 5000
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private String occupation;
	private double yearlyIncome;
// The approved variable stores true/false depending on whether a customer is approved or not for a loan, respectively
	private boolean approved;
	
	private int customerAge;
	
	
	public static int currentYear = 2024;
	
	/**
	 * Constructor to instantiate a car registration object of the class
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param birth year
	 * @param yearly income
	 */
	public CarRegistration(double basePrice, double upgradeCoefficient,
	double colorIndex, String firstName, String lastName, String gender, int birthYear, String
	occupation, double yearlyIncome) {
	// To Do: complete the constructor
		super();
		this.basePrice = basePrice;
		this.upgradeCoefficient = upgradeCoefficient;
        this.colorIndex = colorIndex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.occupation = occupation;
        this.yearlyIncome = yearlyIncome;
        this.customerAge = calculateAge();
        
	
	}
	
	/**
	 * getter methods for BasePrice
	  * 
	  * @return basePrice
	  */
	public double getBasePrice() {
        return basePrice;
	}

	/**
	 * setter methods for BasePrice
	  * 
	  * @param basePrice
	  */
	public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
	
	/**
	 * getter methods for upgradeCoefficient
	  * 
	  * @return upgradeCoefficient
	  */
	 public double getUpgradeCoefficient() {
	        return upgradeCoefficient;
	    }
	 
	 /**
		 * setter methods for upgradeCoefficient
		  * 
		  * @param upgradeCoefficient
		  */
	 public void setUpgradeCoefficient(double upgradeCoefficient) {
	        this.upgradeCoefficient = upgradeCoefficient;
	    }

	 /**
		 * getter methods for colorIndex
		  * 
		  * @return colorIndex
		  */
	 public double getColorIndex() {
	        return colorIndex;
	    }
	 
	 /**
		 * setter methods for colorIndex
		  * 
		  * @param colorIndex
		  */
	 public void setColorIndex(double colorIndex) {
	        this.colorIndex = colorIndex;
	    }

	 /**
		 * getter methods for firstName
		  * 
		  * @return firstName
		  */
	 public String getFirstName() {
	        return firstName;
	    }
	 
	 /**
		 * setter methods for firstName
		  * 
		  * @param firstName
		  */
	 public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 /**
		 * getter methods for lastName
		  * 
		  * @return lastName
		  */
	 public String getLastName() {
	        return lastName;
	    }
	 /**
		 * setter methods for lastName
		  * 
		  * @param lastName
		  */
	 public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	 /**
		 * getter methods for gender
		  * 
		  * @return gender
		  */
	 public String getGender() {
	        return gender;
	    }
	 /**
		 * setter methods for gender
		  * 
		  * @param gender
		  */
	 public void setGender(String gender) {
	        this.gender = gender;
	    }
	 /**
		 * getter methods for birthYear
		  * 
		  * @return birthYear
		  */
	 public int getBirthYear() {
	        return birthYear;
	    }
	 /**
		 * setter methods for birthYear
		  * 
		  * @param birthYear
		  */
	 public void setBirthYear(int birthYear) {
	        this.birthYear = birthYear;
	    }
	 /**
		 * getter methods for occupation
		  * 
		  * @return occupation
		  */
	 public String getOccupation() {
	        return occupation;
	    }
	 /**
		 * setter methods for occupation
		  * 
		  * @param occupation
		  */
	 public void setOccupation(String occupation) {
	        this.occupation = occupation;
	    }
	 /**
		 * getter methods for yearlyIncome
		  * 
		  * @return yearlyIncome
		  */
	 public double getYearlyIncome() {
	        return yearlyIncome;
	    }
	 /**
		 * setter methods for yearlyIncome
		  * 
		  * @param yearlyIncome
		  */
	 public void setYearlyIncome(double yearlyIncome) {
	        this.yearlyIncome = yearlyIncome;
	    }
	 
	 /**
		 * isApproved methods to return boolean approved
		  * 
		  * @return approved
		  */
	 public boolean isApproved() {
	        return approved;
	    }
	 /**
		 * getCustomerAge methods to return integer of CustomerAge
		  * 
		  * @return customerAge
		  */
	 public int getCustomerAge() {
	        return customerAge;
	    }
	 
	/**
	 * This method calculates a customer's age
	 */
	public int calculateAge() {
		return currentYear - birthYear;
		
	}
	/**
	 * This function checks whether a customer is eligible to purchase the car
	 * and prints out a message about it.
	 * To Do: a car's price should not be more than 20% of the customer's yearly
	 * salary. Implement the method below accordingly.
	 */
	public boolean isPreApproved() {
		double maxCarPrice = 0.2 * yearlyIncome;
        approved = basePrice <= maxCarPrice;
        System.out.println("Pre-Approval Status: " + (approved ? "Approved" : "Not Approved"));
        return approved;
		
		
	}
		
/**
 * This function check if a customer is eligible to drive and prints a relevant message.
 * To Do: a customer's age should be at least 16 years to be eligible to drive.
 */
	public void isEligibleToDrive(){
		
		 System.out.println("Eligibility to Drive: " + (customerAge >= 16 ? "Yes" : "No"));
		
	}
	
	/**
	* This function prints the customer’s information 
	*/
	public void displayCustomerInfo() {
		/**
		 * print out the customer's following information
		 * first name, last name
		 * gender
		 * age
		 * birth year
		 * eligibility to drive
		 * eligibility to purchase the car
		 */
		System.out.println("Customer Information:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Year of Birth: " + getBirthYear());
        System.out.println("Yearly Income: " + getYearlyIncome());
        isEligibleToDrive();
        isPreApproved();
	}
	


}
