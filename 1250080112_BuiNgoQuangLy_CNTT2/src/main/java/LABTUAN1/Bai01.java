package LABTUAN1;
import java.util.Scanner;

/**
 *
 * @author Quang Lý
 */
public class Bai01 {

    /**
     *
     */
    public String Ten;

    /**
     *
     */
    public String Ngaysinh;

    /**
     *
     */
    public int Masosinhvien;
    
    /**
     *
     */
    public Bai01(){
    }

    /**
     *
     * @param Ten
     */
    public void inTen(String Ten){
        this.Ten = Ten;
        System.out.print("Nhap ten sinh vien: ");
        Scanner sc = new Scanner(System.in);
        Ten =  sc.nextLine();
        System.out.print("Ten sinh vien: " +Ten);
    }

    /**
     *
     * @param Ngaysinh
     */
    public void inNgaysinh(String Ngaysinh){
        this.Ngaysinh = Ngaysinh;
        System.out.print("Nhap ngay sinh: ");
        Scanner sc = new Scanner(System.in);
        Ngaysinh =  sc.nextLine();
        System.out.print("Ngay sinh: " +Ngaysinh);
    }

    /**
     *
     * @param Masosinhvien
     */
    public void inMAsosinhvien(int Masosinhvien){
        this.Masosinhvien = Masosinhvien;
        System.out.print("Nhap ma so sinh vien: ");
        Scanner sc = new Scanner(System.in);
        Masosinhvien =  sc.nextInt();
        System.out.print("MA so sinh vien: " +Masosinhvien);
    }
    }
