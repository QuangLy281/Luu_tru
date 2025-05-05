package Bai01;
import java.util.Scanner;
class QuanLy extends NhanVien {
    private String chuyenMon;
    private double phuCapChucVu;
    
    public QuanLy(){
        super();
        this.chuyenMon= "";
        this.phuCapChucVu=0.0;
    }
    public QuanLy(String maNhanVien,String tenNhanVien,String trinhDo,String chuyenMon,double phuCapChucVu){
        super(maNhanVien,tenNhanVien,trinhDo);
        this.chuyenMon= chuyenMon;
        this.phuCapChucVu= phuCapChucVu;
    }
    public String getchuyenMon(){
        return chuyenMon;
    }
    public double getphuCapChucVu(){
        return phuCapChucVu;
    }
    public void setchuyenMon(String chuyenMon){
        this.chuyenMon= chuyenMon;
    }
    public void setphuCapChucVu(double phuCapChucVu){
        this.phuCapChucVu= phuCapChucVu;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyenMon= sc.nextLine();
        System.out.print("Nhap phu cap chuc vu: ");
        this.phuCapChucVu= sc.nextDouble();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("Chuyen mon: "+chuyenMon+ "Phu cap chuc vu: "+phuCapChucVu);
    }
    @Override
    public double tinhLuong(){
        return phuCapChucVu+ getluongCoBan();
    }
}
