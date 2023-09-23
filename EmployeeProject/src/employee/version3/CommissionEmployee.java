/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee{
    private double totalSales;
    private String saleType;
    
    //Constructor
    public CommissionEmployee() {
    }

    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(Name empName, double totalSales) {
        super(empName);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }
    
    //Setters and Getters
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        double salary = 0;
        if(totalSales < 50000){
            salary = totalSales * 0.05;
            saleType = "Low Sales";
        } else if (totalSales >= 50000 && totalSales < 100000){
            salary = totalSales * 0.2;
            saleType = "Typical Sales";
        } else if (totalSales >= 100000 && totalSales < 500000){
            salary = totalSales * 0.3;
            saleType = "Typical Sales";
        } else if (totalSales >= 500000){
            salary = totalSales * 0.5;
            saleType = "High Sales";
        }
        
        return salary;
    }
    
    public void displayInfo(){
        double Salary = computeSalary();
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Sale Type: " + saleType);
        System.out.println("Salary: " + Salary);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}