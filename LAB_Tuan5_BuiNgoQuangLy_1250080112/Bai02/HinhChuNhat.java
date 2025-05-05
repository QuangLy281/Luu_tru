package Bai02;
import java.util.Scanner;
public class HinhChuNhat implements Hinh {
    private float dai;
    private float rong;

    public HinhChuNhat(){
        this.dai=0.0f;
        this.rong= 0.0f;
    }
    public HinhChuNhat(float dai, float rong){
        this.dai= dai;
        this.rong= rong;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        this.dai = sc.nextFloat();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        this.rong = sc.nextFloat();
    }
    @Override
    public void xuat(){
        System.out.println("Dai: " + dai + ", Rong: " + rong);
        System.out.println("Dien tich: " + dienTich());
    }
    @Override
    public float dienTich(){
        return dai * rong;
    }
}
