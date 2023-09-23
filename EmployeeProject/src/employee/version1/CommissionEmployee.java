/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

/**
 *
 * @author User
 */
public class CommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    
    //Constructors
    public CommissionEmployee() {
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }
    
    //Setters and Getters
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

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
        } else if (totalSales >= 50000 && totalSales < 100000){
            salary = totalSales * 0.2;
        } else if (totalSales >= 100000 && totalSales < 500000){
            salary = totalSales * 0.3;
        } else if (totalSales >= 500000){
            salary = totalSales * 0.5;
        }
        
        return salary;
    }
    
    public void displayInfo(){
        System.out.println("Id: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Birth Date: " + empBirthDate);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return "ID: " + empID + "\nName: " + empName + "\nDate Hired: " + empDateHired + "\nBirth Date: " + empBirthDate + "\nTotal Sales: " + totalSales;
    }
}
