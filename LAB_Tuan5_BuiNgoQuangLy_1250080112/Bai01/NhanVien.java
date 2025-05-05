package Bai01;
import java.util.Scanner;
abstract class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String trinhDo;
    private double luongCoBan;
    
    public NhanVien(){
        this.maNhanVien= "";
        this.tenNhanVien= "";
        this.trinhDo= "";
        this.luongCoBan= 0.0;
    }
    public NhanVien(String maNhanVien,String tenNhanVien,String trinhDo){
        this.maNhanVien= maNhanVien;
        this.tenNhanVien= tenNhanVien;
        this.trinhDo= trinhDo;
    }
    public String getmaNhanVien(){
        return maNhanVien;
    }
    public String gettenNhanVien(){
        return tenNhanVien;
    }
    public String gettrinhDo(){
        return trinhDo;
    }
    public double getluongCoBan(){
        return luongCoBan;
    }
    public void setmaNhanVien(String maNhanVien){
        this.maNhanVien= maNhanVien;
    }
    public void settenNhanVien(String tenNhanVien){
        this.tenNhanVien= tenNhanVien;
    }
    public void settrinhDo(String trinhDo){
        this.trinhDo= trinhDo;
    }
    public void setluongCoBan(double luongCoBan){
        this.luongCoBan= luongCoBan;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        this.maNhanVien= sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        this.tenNhanVien= sc.nextLine();
        System.out.print("Nhap trinh do: ");
        this.trinhDo= sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        this.luongCoBan= sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Ma nhan vien: "+maNhanVien+
                "Ten nhan vien: "+tenNhanVien+
                "Trinh do: "+trinhDo+
                "Luong co ban: "+luongCoBan);
    }
    public abstract double tinhLuong();
}
