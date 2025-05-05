package Bai01;
import java.util.Scanner;
class NghienCuu extends NhanVien{
    private String chuyenMon;
    private double phuCapDocHai;
    
    public NghienCuu(){
        super();
        this.chuyenMon= "";
        this.phuCapDocHai= 0.0;
    }
    public NghienCuu(String maNhanVien,String tenNhanVien,String trinhDo,String chuyenMon,double phuCapDocHai){
        super(maNhanVien,tenNhanVien,trinhDo);
        this.chuyenMon= chuyenMon;
        this.phuCapDocHai= phuCapDocHai;
    }
    public String getchuyenMon(){
        return chuyenMon;
    }
    public double getphuCapDocHai(){
        return phuCapDocHai;
    }
    public void setChuyenMon(String chuyenMon){
        this.chuyenMon= chuyenMon;
    }
    public void setphuCapDocHai(double phuCapDocHai){
        this.phuCapDocHai= phuCapDocHai;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyenMon= sc.nextLine();
        System.out.print("Nhap phu cap doc hai: ");
        this.phuCapDocHai= sc.nextDouble();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.print("Chuyen mon: "+chuyenMon+ "Phu cap doc hai: "+phuCapDocHai);
    }
    @Override
    public double tinhLuong(){
        return phuCapDocHai+ getluongCoBan();
    }
}
