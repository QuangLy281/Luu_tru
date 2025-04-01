package LABTUAN1;
import java.util.Scanner;
public class Bai05 {
    public double so1;
    public double so2;
    public double so3;

    public Bai05(){
    }
    public double timsonhonhat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        this.so1 =  sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        this.so2 =  sc.nextDouble();
        System.out.print("Nhap so thu ba: ");
        this.so3 =  sc.nextDouble();
        double min = this.so1;
        if (this.so2 < min){
            min = this.so2;
        }
        if (this.so3 < min){
            min = this.so3;
        }
        return min;
    }
    public static void main(String[] args){
        Bai05 tsnn = new Bai05();
        double minValue = tsnn.timsonhonhat();
        System.out.println ("So nho nhat la:" +minValue);
    }
}