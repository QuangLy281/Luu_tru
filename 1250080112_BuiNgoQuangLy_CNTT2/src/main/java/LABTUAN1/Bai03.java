package LABTUAN1;
import java.util.Scanner;
public class Bai03 {
    public double doC;
    public double doF;

    public Bai03(){
    }
    public void chuyenNhietDo(){
        System.out.print("Nhap do F: ");
        Scanner sc = new Scanner(System.in);
        this.doF =  sc.nextDouble();
        this.doC = (doF-32)/ 1.8;
        System.out.print("Do C: " +this.doC);
    }
    public static void main(String[] args){
        Bai03 chuyennhietdo = new Bai03();
        chuyennhietdo.chuyenNhietDo();
    }
}