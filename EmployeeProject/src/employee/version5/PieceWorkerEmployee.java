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
public class PieceWorkerEmployee extends Employee{
    private float  totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(float totalPiecesFinished, float ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, float totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    @Override
    public double computeSalary(){
        double salary = 0;
        int count;
        
        if(totalPiecesFinished < 100){
            salary = totalPiecesFinished * ratePerPiece;
        } else if (totalPiecesFinished >= 100){
            count = (int) (totalPiecesFinished/100);
            salary = totalPiecesFinished * ratePerPiece + (ratePerPiece * 10);
        }
        return salary;
    }
    
    @Override
    public String type(){
        return "PieceWorkerEmployee";
    }    
    
    public void displayInfo(){
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate per Piece: " + ratePerPiece);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Pieces Finished: " + totalPiecesFinished + "\nRate per Piece: " + ratePerPiece;
    }
}