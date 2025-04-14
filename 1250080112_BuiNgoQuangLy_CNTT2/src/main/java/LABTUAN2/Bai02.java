package LABTUAN2;
import java.util.Scanner;
class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    
    public void setSodo(double dai, double rong){
        this.chieuDai = dai;
        this.chieuRong = rong;
    }
    public double getChieuDai(){
        return chieuDai;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public double tinhDienTich(){
        return chieuDai * chieuRong;
    }
    public double tinhChuVi(){
        return 2*(chieuDai + chieuRong);
    }
    @Override
    public String toString(){
        return "Chieu dai: " + chieuDai + ",Chieurong: " + chieuRong + ",Dien tich: " +tinhDienTich()+ ",Chu vi: " +tinhChuVi();
    }
 public class Main{
    public static void main(String[] args){
        HinhChuNhat hcn = new HinhChuNhat();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double chieuRong = scanner.nextDouble();
        hcn.setSodo(chieuDai, chieuRong);
        System.out.println (hcn.toString());
    }  
}
}
