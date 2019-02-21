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
public class CommissionEmployee extends Employee {

    private double grossSales;// gross weekly sales
    private double commissionRate;// commission percentage
    
    public CommissionEmployee(String first, String last, 
            String ssn, double sales, double rate ){
        super(first, last, ssn);
        setGrossSales(sales); //we have to perform data validation
        setCommissionRate(rate);//we have to perform data validation
    }
    
        
    public double getGrossSales(){
        return grossSales;
    }
    
    public void setGrossSales(double sales){
        if (sales>=0.0)//data validation
            grossSales = sales;
        else
            throw new IllegalArgumentException("Gross sales must be greater than 0.0");
    }
    
    public double getCommissionRate(){
        return commissionRate;
    }
    
    public void setCommissionRate(double rate){
        if ((rate>=0.2)&&(rate<1.0))
            commissionRate = rate;
        else
            throw new IllegalArgumentException("Commission rate must in >=0.0 and <1.0");
    }
    
    public double earning(){
        return commissionRate*grossSales;
    }
    
    
    public String toString(){
        return String.format("%s\n"
                + "Gross Sales: %.2f \n"
                + "Commission Rate: %.2f", super.toString(), 
                grossSales, commissionRate);
    }
    
}