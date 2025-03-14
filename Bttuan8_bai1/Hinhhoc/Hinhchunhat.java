package Hinhhoc;
import java.util.Scanner;
public class Hinhchunhat extends Hinhhoc{
    public float dai;
    public float rong;
    
    public Hinhchunhat(){
    }
    public void nhapChieuDai(){
        System.out.println("Nhap chieu dai hinh chu nhat: ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }
    public void nhapChieurong(){
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
}
    @Override
    void Hinhhoc() {
    System.out.print ("Day la hinh chu nhat");   
    }

    @Override
     public void tinhChuVi() {
        chuVi = (dai + rong)*2;
    }

    @Override
    public void tinhDienTich() {
    dienTich = dai*rong;  
    }

    @Override
    public void tinhTheTich() {
    }

}
