package LABTUAN3;
import java.util.Scanner;
public class Bai02 {
    private int tu;  
    private int mau;  

    public Bai02(){
        this.tu = 0;
        this.mau = 1;
    }

    public Bai02(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public Bai02(Bai02 tmp) {
        this.tu = tmp.tu;  
        this.mau = tmp.mau;  
    }  

    public void nhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        this.tu = sc.nextInt();
        System.out.print("Nhap mau so: ");
        this.mau = sc.nextInt();
        
        while (mau== 0){
            if (this.mau == 0){
            System.out.println("Mau so khong duoc la 0");
            System.out.print("Nhap mau so: ");
            this.mau = sc.nextInt();
            }
        }
    }
    
    public void xuatPhanSo(){
        System.out.println(tu + "/" + mau);
    }

    private int UCLN(int a, int b) {
        int UCLN= 0;
        int temp= a-b;
        if (a==b){
            UCLN =a;
        }
        else if( a>b){
            while((temp) > b){
                temp= temp-b;
                UCLN= temp;
            }
        }    
        else {
            while (Math.abs(temp) > a){
                temp= temp-a;
                UCLN = temp;
            }
    }
        return UCLN;
    }

    public void rutGon(){
        int ucln = UCLN(tu, mau);
        tu /= ucln;
        mau /= ucln;
    }

    public Bai02 cong(Bai02 p) {
        Bai02 kq = new Bai02();
        kq.tu = this.tu * p.mau + p.tu * this.mau;
        kq.mau = this.mau * p.mau;
        kq.rutGon(); 
        return kq;  
    }  

    public Bai02 tru(Bai02 p) {
        Bai02 kq = new Bai02();
        kq.tu = this.tu * p.mau - p.tu * this.mau;
        kq.mau = this.mau * p.mau;
        kq.rutGon();
        return kq;
    }

    public Bai02 chia(Bai02 p) {
        Bai02 kq = new Bai02();
        kq.tu = this.tu * p.mau;
        kq.mau = this.mau * p.tu;
        kq.rutGon();
        return kq;
    }  

    public Bai02 nhan(Bai02 p) {
        Bai02 kq = new Bai02();
        kq.tu = this.tu * p.tu;
        kq.mau = this.mau * p.mau;
        kq.rutGon();
        return kq;
    }
}
class Demo {
    private static Bai02 p1;
    private static Bai02 p2;
    private static Bai02 p3;
    private static Bai02 p4;
    private static Bai02 pTong;
    public static void taops1(){
        Bai02 p1 = new Bai02();
        p1.nhapPhanSo();
        System.out.print("Phan so p1: ");  
        p1.xuatPhanSo();
    }
        public static void taops2(){
        Bai02 p2 = new Bai02(4, 16);  
        System.out.print("Phan so p2: ");  
        p2.xuatPhanSo();
        }
        
        public static void taops3(){
        Bai02 p3 = new Bai02();
        p3.nhapPhanSo();
        System.out.print("Phan so p3: ");
        p3.xuatPhanSo();
        }
        
        public static void congps1va3(){
        pTong = p1.cong(p3);
        System.out.print("Tong phan so p1 va p3: ");
        pTong.xuatPhanSo();
    }  

        public static void taops4(){
        Bai02 p4 = new Bai02(pTong);
        System.out.print("Phan so p4: ");
        p4.xuatPhanSo();
        }
        
        public static void nhanps2va4(){
        Bai02 pKq = p4.nhan(p2);
        System.out.print("Ket qua nhan p4 voi p2: ");
        pKq.xuatPhanSo();
    }
        public static void main(String[] args) {
        taops1();  
        taops2();  
        taops3();  
        congps1va3();  
        taops4();  
        nhanps2va4();  
    }  
}