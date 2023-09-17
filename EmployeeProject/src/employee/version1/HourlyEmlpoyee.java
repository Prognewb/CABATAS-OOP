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
public class HourlyEmlpoyee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;
    
    public HourlyEmlpoyee() {
    }

    public HourlyEmlpoyee(int empID, String empName, Date BirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = BirthDate;
    }
    
    public HourlyEmlpoyee(int empID, String empName, Date empDateHired, Date BirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = BirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

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

    public Date getBirthDate() {
        return empBirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.empBirthDate = BirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary(){
        double salary = 0;
        float excess, overtime;
        
        if(totalHoursWorked < 40){
            salary = totalHoursWorked * ratePerHour;
        } else if (totalHoursWorked > 40){
            excess = totalHoursWorked - 40;
            overtime = (float) (ratePerHour * 1.5);
            salary = 40 * ratePerHour + (excess * overtime);
        }
        
        return salary;
    }
    
    public void displayInfo(){
        System.out.println("Id: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Birth Date: " + empBirthDate);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return "ID: " + empID + "\nName: " + empName + "\nDate Hired: " + empDateHired + "\nBirth Date: " + empBirthDate + "\nTotal Hours Worked: " + totalHoursWorked + "\nRate per Hour: " + ratePerHour;
    }
}