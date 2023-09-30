/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private float ratePerHour;
    
    //Constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, float ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date BirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, BirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    //Setters and Getters
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
    
    @Override
    public double computeSalary(){
        double salary = 0;
        float excess, overtime;
        
        if(totalHoursWorked <= 40){
            salary = totalHoursWorked * ratePerHour;
        } else if (totalHoursWorked > 40){
            excess = totalHoursWorked - 40;
            overtime = (float) (ratePerHour * 1.5);
            salary = 40 * ratePerHour + (excess * overtime);
        }
        
        return salary;
    }
    
    @Override
    public String type(){
        return "HourlyEmployee";
    }
    
    public void displayInfo(){
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Hours Worked: " + totalHoursWorked + "\nRate per Hour: " + ratePerHour;
    }
}