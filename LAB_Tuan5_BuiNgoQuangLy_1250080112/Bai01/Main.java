package Bai01;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien>danhSachNhanVien= new ArrayList<>();
        QuanLy quanly= new QuanLy("QL001","Nguyen Van A","Dai hoc","Quan tri",2000000);
        quanly.nhap();
        quanly.xuat();
        System.out.print("Luong quan ly: "+quanly.tinhLuong());
        
        NghienCuu nghiencuu= new NghienCuu("NC001","Tran Thi B","Thac Si","Hoa hoc",1500000);
        nghiencuu.nhap();
        nghiencuu.xuat();
        System.out.print("Luong nghien cuu: "+nghiencuu.tinhLuong());
        
        PhucVu phucvu= new PhucVu ("PV001","Le Van C","Trung Cap");
        phucvu.nhap();
        phucvu.xuat();
        System.out.print("Luong phuc vu: "+phucvu.tinhLuong());
        
        danhSachNhanVien.add(quanly);
        danhSachNhanVien.add(nghiencuu);
        danhSachNhanVien.add(phucvu);
        
        System.out.println("\nDanh sach nhan vien:");
        for (NhanVien nv: danhSachNhanVien){
            nv.xuat();
            System.out.println("Luong: "+nv.tinhLuong());
        }
    }
}
