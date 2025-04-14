package LABTUAN2;
import java.util.Scanner;
class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private double dungTich;
    private double triGia;

    public Vehicle(String tenChuXe, String loaiXe, double dungTich, double triGia){
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }
    public String getTenChuXe(){
        return tenChuXe;
    }
    public String getLoaiXe(){
        return loaiXe;
    }
    public double getDungTich(){
        return dungTich;
    }
    public double getTriGia(){
        return triGia;
    }
    public double tinhThueTruocBa() {
        double thue = 0.0;
        if (dungTich < 100){
            thue = triGia * 0.01;
        } else if (dungTich >= 100 && dungTich <= 200){
            thue = triGia * 0.03;
        } else {
            thue = triGia * 0.05;
        }
        return thue;
    }
    @Override
    public String toString(){
        return String.format("%-20s %-15s %-15.1f %-15.1f %-15.1f", tenChuXe, loaiXe, dungTich, triGia, tinhThueTruocBa());  
    }
}
class Main4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        for (int i = 0; i < vehicles.length; i++) {
            System.out.print("Nhap ten chu xe: ");
            String tenChuXe = sc.nextLine();
            System.out.print("Nhap loai xe: ");
            String loaiXe = sc.nextLine();
            System.out.print("Nhap dng tich xe (cc): ");
            double dungTich = sc.nextDouble();
            System.out.print("Nhap gia tri xe: ");
            double triGia = sc.nextDouble();
            sc.nextLine();
            vehicles[i] = new Vehicle(tenChuXe, loaiXe, dungTich, triGia);
        }
        System.out.printf("%-20s %-15s %-15s %-15s %-15s%n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");  
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }
}