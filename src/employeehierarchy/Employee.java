/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeehierarchy;

/**
 *
 * @author Matthew Tse
 */
public abstract class Employee {
       
    private String firstName;
    private String lastName;
    private String Ssn;

    
    public Employee(String first, String last , String ssn){
        firstName = first;
        lastName = last;
        Ssn = ssn;

    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String last){
        lastName=last;
    }
    
    public String getSsn(){
        return Ssn;
    }
    
    public void setSsn (String ssn){
        Ssn=ssn;
    }
    
    
    
    public abstract double earning();
    
    
    public String toString(){
        return String.format("commission employee: %s %s\n"
                + "social security number: %s \n", firstName, 
                lastName, Ssn);
    }
}
