package Bai02;
import java.util.Scanner;
public class HinhVuong implements Hinh {
    private float canh;
    public HinhVuong(){
        this.canh=0.0f;
    }
    public HinhVuong(float canh){
        this.canh= canh;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai canh hinh vuong: ");
        this.canh = sc.nextFloat();
    }
    @Override
    public void xuat() {
        System.out.println("Canh: "+canh);
        System.out.println("Dien tich: "+dienTich());
    }

    @Override
    public float dienTich() {
        return canh * canh;
    }
}
