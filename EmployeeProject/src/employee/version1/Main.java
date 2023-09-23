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
public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(30, 01, 2004);
        Date date2 = new Date(10, 06, 2023);
        
        //Hourly Employee
        HourlyEmlpoyee employee1 = new HourlyEmlpoyee();
        HourlyEmlpoyee employee2 = new HourlyEmlpoyee(100, "Niño", date1);
        HourlyEmlpoyee employee3 = new HourlyEmlpoyee(200, "Jan", date2, date1, 50, 200);

        System.out.println(employee1.computeSalary());
        employee3.displayInfo();
        System.out.println(employee2.toString());

        //Piece Worker Employee
        PieceWorkerEmployee employee4 = new PieceWorkerEmployee();
        PieceWorkerEmployee employee5 = new PieceWorkerEmployee("Eduardo", 100, 10);
        PieceWorkerEmployee employee6 = new PieceWorkerEmployee(300, "Miguel", date2, date1, 101, 1);

        System.out.println(employee4.computeSalary());
        employee6.displayInfo();
        System.out.println(employee5.toString());
        
        //Commission Employee
        CommissionEmployee employee7 = new CommissionEmployee();
        CommissionEmployee employee8 = new CommissionEmployee(400, "Dane", date2, date1);
        CommissionEmployee employee9 = new CommissionEmployee(500, "Antonie", date2, date1, 100000);
        
        System.out.println(employee7.computeSalary());
        employee9.displayInfo();
        System.out.println(employee8.toString());

        //Base plus Commission Employee
        BasePlusCommissionEmployee employee10 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmployee employee11 = new BasePlusCommissionEmployee(600, "James", date1);
        BasePlusCommissionEmployee employee12 = new BasePlusCommissionEmployee(700, "Dan", date2, date1, 500000, 1000);
        
        System.out.println(employee10.computeSalary());
        employee12.displayInfo();
        System.out.println(employee11.toString());
    }
}