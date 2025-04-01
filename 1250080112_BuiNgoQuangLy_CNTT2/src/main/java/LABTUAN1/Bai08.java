package LABTUAN1;
import java.util.Scanner;
public class Bai08 {
    public double so;

    public Bai08(){
    }
    public void timsodaucuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        this.so =  sc.nextDouble();
        double socuoi = Math.abs(so % 10);
        double sodau = Math.abs(so);
        while (sodau >= 10){
            sodau/= 10;
        }
        System.out.print ("Chu so dau: " +(int)sodau);
        System.out.print ("Chu so cuoi: " +(int)socuoi);
    }
    public static void main(String[] args){
        Bai08 tsdc = new Bai08();
        tsdc.timsodaucuoi();
    }
}