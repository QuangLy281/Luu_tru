package LABTUAN1;
import java.util.Scanner;
public class Bai02 {
    public double chieuDai;
    public double chieuRong;

    public Bai02(){
    }
    public void tinhDientich(){
        System.out.print("Nhap chieu dai: ");
        Scanner sc = new Scanner(System.in);
        this.chieuDai =  sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        this.chieuRong =  sc.nextDouble();
        double dienTich = chieuDai*chieuRong;
        System.out.print("Dien tich: " +dienTich);
    }
    public static void main(String[] args){
        Bai02 rectangle = new Bai02();
        rectangle.tinhDientich();
    }
}