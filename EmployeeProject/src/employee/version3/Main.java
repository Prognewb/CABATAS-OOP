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
public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(30, 01, 2004);
        Date date2 = new Date(10, 06, 2023);
        
        Name name1 = new Name("Niño", "Jan", "Cabatas");
        
        //Hourly Employee
        HourlyEmlpoyee employee1 = new HourlyEmlpoyee();
        HourlyEmlpoyee employee2 = new HourlyEmlpoyee(41, 1);
        HourlyEmlpoyee employee3 = new HourlyEmlpoyee(100, name1, date2, date1, 50, 500);

        System.out.println(employee2.computeSalary());
        employee1.displayInfo();
        System.out.println(employee3.toString());

        //Piece Worker Employee
        PieceWorkerEmployee employee4 = new PieceWorkerEmployee();
        PieceWorkerEmployee employee5 = new PieceWorkerEmployee(200, 10);
        PieceWorkerEmployee employee6 = new PieceWorkerEmployee(300, name1, date2, date1, 101, 1);

        System.out.println(employee5.computeSalary());
        employee4.displayInfo();
        System.out.println(employee6.toString());

        //Commission Employee
        CommissionEmployee employee7 = new CommissionEmployee();
        CommissionEmployee employee8 = new CommissionEmployee(name1, 10000);
        CommissionEmployee employee9 = new CommissionEmployee(400, name1, date2, date1, 100000);
        
        System.out.println(employee8.computeSalary());
        employee7.displayInfo();
        System.out.println(employee9.toString());

        //Base plus Commission Employee
        BasePlusCommissionEmployee employee10 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmployee employee11 = new BasePlusCommissionEmployee(50000, 10000);
        BasePlusCommissionEmployee employee12 = new BasePlusCommissionEmployee(700, name1, date2, date1, 500000, 1000);
        
        System.out.println(employee11.computeSalary());
        employee10.displayInfo();
        System.out.println(employee12.toString());
    }
}