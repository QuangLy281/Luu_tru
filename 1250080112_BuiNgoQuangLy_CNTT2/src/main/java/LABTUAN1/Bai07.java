package LABTUAN1;
import java.util.Scanner;
public class Bai07 {
    public double Ly;
    public double Hoa;
    public double Sinh;
    public double Toan;
    public double Maytinh;

    public Bai07(){
    }
    public void Tinhxephang(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem Ly: ");
        this.Ly =  sc.nextDouble();
        System.out.print("Nhap diem Hoa: ");
        this.Hoa =  sc.nextDouble();
        System.out.print("Nhap diem Sinh: ");
        this.Sinh =  sc.nextDouble();
        System.out.print("Nhap diem Toan: ");
        this.Toan =  sc.nextDouble();
        System.out.print("Nhap diem Maytinh: ");
        this.Maytinh =  sc.nextDouble();
        double tilephantram = ((Ly + Hoa + Sinh + Toan + Maytinh)/50)* 100;
        System.out.println("Ti le phan tram la: " +tilephantram);
        
        if (tilephantram > 90){
            System.out.println("Hang A");
        }
        else if (tilephantram > 80){
            System.out.println("Hang B");
        }
        else if (tilephantram > 70){
            System.out.println("Hang C");
        }
        else if (tilephantram > 60){
            System.out.println("Hang D");
        }
        else if (tilephantram > 40){
            System.out.println("Hang E");
        }
        else {
            System.out.println("Hang F");
        }
    }
    public static void main(String[] args){
        Bai07 xh = new Bai07();
        xh.Tinhxephang();
    }
}