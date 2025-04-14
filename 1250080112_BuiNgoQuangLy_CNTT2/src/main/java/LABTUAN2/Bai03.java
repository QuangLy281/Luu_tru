package LABTUAN2;
import java.util.Scanner;
class SinhVien {
    private int maSv;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien(){
        this.maSv = 0;
        this.hoTen = "";
        this.diemLT = 0.0f;
        this.diemTH = 0.0f;
    }  
    public SinhVien(int maSv, String hoTen, float diemLT, float diemTH) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public int getMaSv(){
        return maSv;
    }
    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public float getDiemLT(){
        return diemLT;
    }
    public void setDiemLT(float diemLT){
        this.diemLT = diemLT;
    }
    public float getDiemTH(){
        return diemTH;
    }
    public void setDiemTH(float diemTH){
        this.diemTH = diemTH;
    }
    public float tinhDiemTB(){
        return (diemLT + diemTH) / 2;
    }
    @Override
    public String toString(){
        return maSv + " " + hoTen + " " + diemLT + " " + diemTH + " " + tinhDiemTB();
    }
}
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(80112, "Bui Ngo Quang Ly", 6.5f, 8.5f); 
        SinhVien sv2 = new SinhVien(80111, "Nguyen Thanh Luan", 7.5f, 8.0f);
        SinhVien sv3 = new SinhVien();

        System.out.print("Nhap ma so cua sinh vien sv3: ");
        sv3.setMaSv(sc.nextInt());  
        sc.nextLine();
        System.out.print("Nhap ho va ten cua sinh vien sv3: ");
        sv3.setHoTen(sc.nextLine());
        System.out.print("Nhap diem ly thuyet cua sinh vien sv3: ");
        sv3.setDiemLT(sc.nextFloat());  
        System.out.print("Nhap diem thuc hanh cua sinh vien sv3: ");
        sv3.setDiemTH(sc.nextFloat());

        System.out.printf("%-10s %-20s %-10s %-10s %-10s%n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}