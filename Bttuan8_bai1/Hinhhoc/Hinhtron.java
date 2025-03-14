package Hinhhoc;
import java.util.Scanner;
public class Hinhtron extends Hinhhoc {
    public float banKinh;
    
    public void Hinhtron(){
    }

    @Override
    void Hinhhoc() {
        System.out.print ("Day la hinh tron");
    }

    @Override
     public void tinhChuVi() {
        chuVi = 2*pi*banKinh;
    }

    @Override
    public void tinhDienTich() {
    dienTich = pi*pi*banKinh;   
    }

    @Override
    public void tinhTheTich() {
    }

    public void nhapBanKinh() {
System.out.print("Nhap ban kinh hinh tron: ");
        Scanner scanner = new Scanner (System.in);
        banKinh = scanner.nextFloat();    }
}
