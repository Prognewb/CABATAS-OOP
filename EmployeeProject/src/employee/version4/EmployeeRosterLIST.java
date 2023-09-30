/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version4;

/**
 *
 * @author User
 */
public class EmployeeRosterLIST {
    private int MAX = 10;
    private int count = 0;
    private Employee[] employee = new Employee[MAX];

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
            this.employee[count++] = employee;
            System.out.println("Employee has been Successfully Added!");
            return true;
        } else {
            System.out.println("List is Full!");
            return false;
        }
    }
    
    public boolean removeEmployee(int id){
        Employee[] newEmployeeList = new Employee[count];
        int f = 0;
        for(int i = 0; i < count; i++){
            if(employee[i].getEmpID() != id){
                newEmployeeList[f++] = employee[i];
            }
        }
        
        if(f != count){
            employee = newEmployeeList;
            count--;
            System.out.println("Employee has been Successfully Removed!");
            return true;
        } else {
            System.out.println("Invalid ID!");
            return false;
        }
    }

    public Employee getEmployee(int id){
        for(int i = 0; i < count; i++){
            if(employee[i].getEmpID() == id){
                return employee[i];
            }
        }
        
        return null;
    }
    
    public boolean updateEmployee(int id, Date date) {
        for(int i = 0; i < count; i++) {
            if(employee[i].getEmpID() == id){
                employee[i].setEmpBirthDate(date);
                System.out.println("Employee Updated Successfully!");
                return true;
            }
        }
        return false;
    }
    
    public int countHE() {
        int counter = 0;

        for(int i = 0; i < count; i++) {
            if ("HourlyEmployee".equals(employee[i].type())) {
                counter++;
            }
        }

        return counter;
    }

    public int countPWE() {
        int counter = 0;

        for(int i = 0; i < count; i++) {
            if ("PieceWorkerEmployee".equals(employee[i].type())) {
                counter++;
            }
        }

        return counter;
    }

    public int countCE() {
        int counter = 0;

        for(int i = 0; i < count; i++) {
            if ("CommissionEmployee".equals(employee[i].type())) {
                counter++;
            }
        }

        return counter;
    }

    public int countBPCE() {
        int counter = 0;

        for(int i = 0; i < count; i++) {
            if ("BasePlusCommissionEmployee".equals(employee[i].type())) {
                counter++;
            }
        }

        return counter;
    }
    
    public void displayHE(){
        System.out.println("CURRENT HOURLY EMPLOYEES: ");
        for(int i = 0; i < count; i++) {
            if ("HourlyEmployee".equals(employee[i].type())) {
                System.out.println(employee[i]);
            }
        }
    }
    
    public void displayPWE(){
        System.out.println("\nCURRENT PIECE WORKER EMPLOYEES: ");
        for(int i = 0; i < count; i++) {
            if ("PieceWorkerEmployee".equals(employee[i].type())) {
                System.out.println(employee[i]);
            }
        }
    }
    
    public void displayCE(){
        System.out.println("\nCURRENT COMMISSION EMPLOYEES: ");
        for(int i = 0; i < count; i++) {
            if ("CommissionEmployee".equals(employee[i].type())) {
                System.out.println(employee[i]);
            }
        }
    }
    
    public void displayBPCE(){
        System.out.println("\nCURRENT BASE PLUS COMMISSION EMPLOYEES: ");
        for(int i = 0; i < count; i++) {
            if ("BasePlusCommissionEmployee".equals(employee[i].type())) {
                System.out.println(employee[i]);
            }
        }
    }
    
    public void displayEmployeeTable() {
        System.out.println("Employee Roster:");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-25s | %-15s | %-15s | %-15s | %-35s |\n", "ID", "Name", "Date Hired", "Date of Birth", "Salary", "Employee Status");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("| %-5d | %-25s | %-15s | %-15s | %-15.2f | %-35s |\n",
                    employee[i].getEmpID(),
                    employee[i].getEmpName(),
                    employee[i].getEmpDateHired(),
                    employee[i].getEmpBirthDate(),
                    employee[i].computeSalary(),
                    getEmployeeType(employee, i));
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public String getEmployeeType(Employee employee[], int i) {
        if (null == employee[i].type()) {
            return "Unknown Type";
        } else switch (employee[i].type()) {
            case "HourlyEmployee":
                return "Total Hours Worked: " + ((HourlyEmployee) employee[i]).getTotalHoursWorked();
            case "PieceWorkerEmployee":
                return "Total Pieces Finished: " + ((PieceWorkerEmployee) employee[i]).getTotalPiecesFinished();
            case "CommissionEmployee":
                return "Total Sales: $" + ((CommissionEmployee) employee[i]).getTotalSales();
            case "BasePlusCommissionEmployee":
                return "Base Salary: $" + ((BasePlusCommissionEmployee) employee[i]).getBaseSalary();
            default:
                return "Unknown Type";
        }
    }
}