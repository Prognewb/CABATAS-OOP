/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version3;

/**
 *
 * @author User
 */
public class Employee {    
    private int empID;
    private Name empName;
    private Date empDateHired;
    private Date empBirthDate;

    //Constructor
    public Employee() {
    }

    public Employee(Name empName) {
        this.empName = empName;
    }

    public Employee(int empID, Name empName, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
    }
    
    public Employee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    //Setters and Getters
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
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

    @Override
    public String toString() {
        return "\nID: " + empID + "\nName: " + empName + "\nDate Hired: " + empDateHired + "\nBirth Date: " + empBirthDate;
    }

}