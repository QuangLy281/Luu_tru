package LABTUAN1;
import java.util.Scanner;
public class Bai01 {
    public String Ten;
    public String Ngaysinh;
    public int Masosinhvien;
    
    public Bai01(){
    }
    public void inTen(){
        System.out.print("Nhap ten sinh vien: ");
        Scanner sc = new Scanner(System.in);
        this.Ten =  sc.nextLine();
        System.out.print("Ten sinh vien: " +this.Ten);
    }
    public void inNgaysinh(){
        System.out.print("Nhap ngay sinh: ");
        Scanner sc = new Scanner(System.in);
        this.Ngaysinh =  sc.nextLine();
        System.out.print("Ngay sinh: " +this.Ngaysinh);
    }
    public void inMasosinhvien(){
        System.out.print("Nhap ma so sinh vien: ");
        Scanner sc = new Scanner(System.in);
        this.Masosinhvien =  sc.nextInt();
        System.out.print("Ma so sinh vien: " +this.Masosinhvien);
    }
    public static void main(String[] args){
        Bai01 goibai01 = new Bai01();
        goibai01.inTen();
        goibai01.inNgaysinh();
        goibai01.inMasosinhvien();
    }
    }
