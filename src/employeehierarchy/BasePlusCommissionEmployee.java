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

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
   private double baseSalary; // base salary per week

   // constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales,
      double commissionRate, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber, 
         grossSales, commissionRate);

      if (baseSalary < 0.0) // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   }

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0) // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // calculate earnings; override method earnings in CommissionEmployee
   @Override                                                            
   public double getPaymentAmount()                                             
   {                                                                    
      return getBaseSalary() + super.getPaymentAmount();                        
   } 

   // return String representation of BasePlusCommissionEmployee object
   @Override                                                           
   public String toString()                                            
   {                                                                   
      return String.format("%s %s; %s: $%,.2f",                       
         "base-salaried", super.toString(),                            
         "base salary", getBaseSalary());                             
   } 
} // end class BasePlusCommissionEmployee