/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(30, 01, 2004);
        Date date2 = new Date(10, 06, 2023);
        Date date3 = new Date(01, 01, 2001);
        
        Name name1 = new Name("Nino Jan", "Roz", "Cabatas");
        Name name2 = new Name("Eduardo", "Miguel", "Cortes");
        Name name3 = new Name("Dan", "Lius", "Monsales");
        Name name4 = new Name("Francis", "James", "Lagang");
        
        HourlyEmployee employee1 = new HourlyEmployee(100, name1, date2, date1, 50, 500);
        PieceWorkerEmployee employee2 = new PieceWorkerEmployee(200, name2, date2, date1, 101, 1);
        CommissionEmployee employee3 = new CommissionEmployee(300, name3, date2, date1, 100000);
        BasePlusCommissionEmployee employee4 = new BasePlusCommissionEmployee(400, name4, date2, date1, 500000, 1000);

        //Employee Roster
        EmployeeRosterLIST roster = new EmployeeRosterLIST();

        roster.addEmployee(employee1);
        roster.addEmployee(employee2);
        roster.addEmployee(employee3);
        roster.addEmployee(employee4);
        
        roster.displayEmployeeTable();
        
        System.out.println("\nCurrent no. of Hourly Employees: " + roster.countHE());
        roster.displayHE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nCurrent no. of Piece Worker Employees: " + roster.countPWE());
        roster.displayPWE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nCurrent no. of Commission Employees: " + roster.countCE());
        roster.displayCE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nCurrent no. of Base Plus Commission Employees: " + roster.countBPCE());
        roster.displayBPCE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------\n");

        roster.removeEmployee(200);
        System.out.println("\n");
        roster.displayEmployeeTable();
        System.out.println("\n");

        Employee employee5 = roster.getEmployee(100);

        System.out.println(employee5);
        roster.updateEmployee(100, date3);
        System.out.println(employee5);
    }
}