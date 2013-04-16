package lab1;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String phoneNumber;

    public Contact() {
    }
    
    public Contact(String firstName, String lastName, String streetAddress, 
            String city, String state, String email, String phoneNumber) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" 
                + "Address:  " + streetAddress + " " + city + ", " + state 
                + " " + zipCode + "\n" + "Email: " + email + "\n" 
                + "Phone Number: " + phoneNumber + "\n";
                 
    }

   
    
    
    

}
