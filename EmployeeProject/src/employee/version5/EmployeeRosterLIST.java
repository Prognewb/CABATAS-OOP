/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EmployeeRosterLIST {
    private int MAX = 10;
    private int count = 0;
    private ArrayList<Employee> employee = new ArrayList();

    public EmployeeRosterLIST() {
    }

    public EmployeeRosterLIST(int max) {
        MAX = max;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }
    
    public boolean addEmployee(Employee employee){
        if(count < MAX){
            this.employee.add(employee);
            System.out.println("Employee has been Successfully Added!");
            return true;
        } else {
            System.out.println("List is Full!");
            return false;
        }
    }
    
    public boolean removeEmployee(int id){
        int f = 0;
        for(Employee i: employee){
            if(i.getEmpID() == id){
                employee.remove(f);
                System.out.println("Employee has been Successfully Removed!");
                return true;
            }
            f++;
        }
        return false;
    }

    public Employee getEmployee(int id){
        for(Employee i: employee){
            if(i.getEmpID() == id){
                System.out.println("Employee has been Successfully Retrieved!");
                return i;
            }
        }
        
        return null;
    }
    
    public boolean updateEmployee(int id, Date date) {
        for(Employee i: employee) {
            if(i.getEmpID() == id){
                i.setEmpBirthDate(date);
                System.out.println("Employee Updated Successfully!");
                return true;
            }
        }
        return false;
    }
    
    public int countHE() {
        int counter = 0;

        for(Employee i: employee){
            if ("HourlyEmployee".equals(i.type())) {
                counter++;
            }
        }

        return counter;
    }

    public int countPWE() {
        int counter = 0;

        for(Employee i: employee) {
            if ("PieceWorkerEmployee".equals(i.type())) {
                counter++;
            }
        }

        return counter;
    }

    public int countCE() {
        int counter = 0;

        for(Employee i: employee) {
            if ("CommissionEmployee".equals(i.type())) {
                counter++;
            }
        }

        return counter;
    }

    public int countBPCE() {
        int counter = 0;

        for(Employee i: employee) {
            if ("BasePlusCommissionEmployee".equals(i.type())) {
                counter++;
            }
        }

        return counter;
    }
    
    public void displayHE(){
        System.out.println("CURRENT HOURLY EMPLOYEES: ");
        for(Employee i: employee) {
            if ("HourlyEmployee".equals(i.type())) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5s | %-25s | %-15s | %-15s | %-15s | %-35s |\n", "ID", "Name", "Date Hired", "Date of Birth", "Salary", "Employee Status");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5d | %-25s | %-15s | %-15s | %-15.2f | %-35s |\n",
                    i.getEmpID(),
                    i.getEmpName(),
                    i.getEmpDateHired(),
                    i.getEmpBirthDate(),
                    i.computeSalary(),
                    getEmployeeType(i));

                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }
    
    public void displayPWE(){
        System.out.println("CURRENT PIECE WORKER EMPLOYEES: ");
        for(Employee i: employee) {
            if ("PieceWorkerEmployee".equals(i.type())) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5s | %-25s | %-15s | %-15s | %-15s | %-35s |\n", "ID", "Name", "Date Hired", "Date of Birth", "Salary", "Employee Status");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5d | %-25s | %-15s | %-15s | %-15.2f | %-35s |\n",
                    i.getEmpID(),
                    i.getEmpName(),
                    i.getEmpDateHired(),
                    i.getEmpBirthDate(),
                    i.computeSalary(),
                    getEmployeeType(i));

                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }
    
    public void displayCE(){
        System.out.println("CURRENT COMMISSION EMPLOYEES: ");
        for(Employee i: employee) {
            if ("CommissionEmployee".equals(i.type())) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5s | %-25s | %-15s | %-15s | %-15s | %-35s |\n", "ID", "Name", "Date Hired", "Date of Birth", "Salary", "Employee Status");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5d | %-25s | %-15s | %-15s | %-15.2f | %-35s |\n",
                    i.getEmpID(),
                    i.getEmpName(),
                    i.getEmpDateHired(),
                    i.getEmpBirthDate(),
                    i.computeSalary(),
                    getEmployeeType(i));

                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }
    
    public void displayBPCE(){
        System.out.println("CURRENT BASE PLUS COMMISSION EMPLOYEES: ");
        for(Employee i: employee) {
            if ("BasePlusCommissionEmployee".equals(i.type())) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5s | %-25s | %-15s | %-15s | %-15s | %-35s |\n", "ID", "Name", "Date Hired", "Date of Birth", "Salary", "Employee Status");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %-5d | %-25s | %-15s | %-15s | %-15.2f | %-35s |\n",
                    i.getEmpID(),
                    i.getEmpName(),
                    i.getEmpDateHired(),
                    i.getEmpBirthDate(),
                    i.computeSalary(),
                    getEmployeeType(i));

                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }
    
    public void displayEmployeeTable() {
        System.out.println("Employee Roster:");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-25s | %-15s | %-15s | %-15s | %-35s |\n", "ID", "Name", "Date Hired", "Date of Birth", "Salary", "Employee Status");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        for (Employee i: employee) {
            System.out.printf("| %-5d | %-25s | %-15s | %-15s | %-15.2f | %-35s |\n",
                    i.getEmpID(),
                    i.getEmpName(),
                    i.getEmpDateHired(),
                    i.getEmpBirthDate(),
                    i.computeSalary(),
                    getEmployeeType(i));
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public String getEmployeeType(Employee employee) {
        if (null == employee.type()) {
            return "Unknown Type";
        } else switch (employee.type()) {
            case "HourlyEmployee":
                return "Total Hours Worked: " + ((HourlyEmployee) employee).getTotalHoursWorked();
            case "PieceWorkerEmployee":
                return "Total Pieces Finished: " + ((PieceWorkerEmployee) employee).getTotalPiecesFinished();
            case "CommissionEmployee":
                return "Total Sales: $" + ((CommissionEmployee) employee).getTotalSales();
            case "BasePlusCommissionEmployee":
                return "Base Salary: $" + ((BasePlusCommissionEmployee) employee).getBaseSalary();
            default:
                return "Unknown Type";
        }
    }
}