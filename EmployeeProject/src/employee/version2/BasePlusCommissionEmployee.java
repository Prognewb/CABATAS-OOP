/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    //Constructors
    public BasePlusCommissionEmployee() {
    } 

    public BasePlusCommissionEmployee(double totalSales, double baseSalary) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }
    
    //Setters and Getters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    
    @Override
    public double computeSalary(){
        double salary = super.computeSalary();
        
        salary = salary + baseSalary;
        
        return salary;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Total Sales: " + super.getTotalSales());
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase Salary: " + baseSalary;
    }    
}