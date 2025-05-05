package Bai02;
import java.util.Scanner;
public class HinhTron implements Hinh {
    private float banKinh;

    public HinhTron(){
        this.banKinh=0.0f;
    }
    public HinhTron(float banKinh){
        this.banKinh= banKinh;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        this.banKinh = sc.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Ban kinh: " + banKinh);
        System.out.println("Dien tich: " + dienTich());
    }

    @Override
    public float dienTich() {
        return (pi*banKinh*banKinh);
    }
}
