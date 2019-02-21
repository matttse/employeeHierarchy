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
public class BasePlusCommissionEmployee extends CommissionEmployee{
      
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String fn, String ln, 
            String ssn, double sales, double rate, double salary){
       
        //we must FIRST call the constructor of the super class
        super(fn, ln, ssn, sales, rate);
        setBaseSalary(salary);  
    }
    
    public void setBaseSalary(double baseSalary){
        if (baseSalary>0.0)
            this.baseSalary=baseSalary;
        else
            this.baseSalary=0.0;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    //when you want to change the definition of the method
    @Override
    public double earning(){
        return baseSalary + super.earning();
    }
    
    @Override
    public String toString(){
        return String.format("base plus %s\n" 
                + "Base Salary: %.2f", super.toString(),
                this.baseSalary);
    }
   
    
}
