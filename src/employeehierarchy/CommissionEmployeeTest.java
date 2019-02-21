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
public class CommissionEmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiate CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee("SueTest", "JonesTest", "123-45-6789", 1000, 0.6);
        
        // get commission employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%n%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%n%s %s%n", "SSN name is", employee.getSsn());
        System.out.printf("%n%s %s%n", "Gross Sales name is", employee.getGrossSales());
        System.out.printf("%n%s %s%n", "Commission Rate name is", employee.getCommissionRate());
        
        employee.setGrossSales(5000);
        employee.setCommissionRate(0.7);
        
        System.out.printf("%n%s:%n%n%s%n", "Updated employee information set by toString", employee);
        
    }
    
}
