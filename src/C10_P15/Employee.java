package C10_P15;

public abstract class Employee implements Payable {

	private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    
    // constructor
    public Employee(String firstName, String lastName, 
            String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    } // end constructor
    
    // return first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName
    
    public String getLastName()
    {
        return lastName;
    } // end method getLastName
    
    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber
    
    // return String representation of Employee object
    @Override
    public String toString()
    {
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    } // end method toString
    
    // getPaymentAmount method
    public double getPaymentAmount()
    {
       return earnings();
    }
    public abstract double earnings();
}
