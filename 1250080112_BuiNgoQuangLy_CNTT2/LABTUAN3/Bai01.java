package LABTUAN3;
import java.util.Scanner;
public class Bai01 {
    private int maso;
    private String hoten;
    private float dtb;
    public int getmaso(){
        return maso;
    }
    public void setmaso(int maso){
        this.maso= maso;
    }
    public String gethoten(){
        return hoten;
    }
    public void sethoten(String hoten){
        this.hoten= hoten;
    }
    public float getdtb(){
        return dtb;
    }
    public void setdtb(float dtb){
        this.dtb= dtb;
    }
    public Bai01(){
        this.maso= 0;
        this.hoten= null;
        this.dtb= 0f;
    }
    public Bai01(int maso,String hoten,float dtb){
        this.maso= maso;
        this.hoten= hoten;
        this.dtb= dtb;
    }
    public Bai01(Bai01 tmp){
        this.maso= tmp.maso;
        this.hoten= tmp.hoten;
        this.dtb= tmp.dtb;
    }
    public void nhaphs(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ho ten hoc sinh: ");
        hoten= sc.nextLine();
        System.out.print("Nhap ma so: ");
        maso= sc.nextInt();
        System.out.print("Nhap diem trung binh: ");
        dtb= sc.nextFloat();
    }
    public void xuaths(){
        System.out.println(maso+ "-" +hoten+ "-"+dtb);
    }
    public void rank(){
        if(dtb<5){
            System.out.println("Xep loai yeu");
        }
        else if( dtb>= 5 && dtb<7){
            System.out.println("Xep loai trung binh");
        }
        else if(dtb>=7 && dtb<8){
            System.out.println("Xep loai kha");
        }
        else if(dtb>=8 && dtb<=10){
            System.out.println("Xep loai gioi");
        }
        else{
            System.out.println("Diem nhap vao khong hop le");
        }
    }
}
class Demo1{
    public static void main(String[]args){
        Bai01 hs1= new Bai01();
        hs1.nhaphs();
        hs1.xuaths();
        Bai01 hs2= new Bai01(80112,"Bui Ngo Quang Ly",7.0f);
        hs2.xuaths();
        Bai01 hs3= new Bai01(hs2);
        hs3.xuaths();
        hs3.sethoten("Nguyen Thanh Luan");
        hs3.xuaths();
        float max= hs1.getdtb();
        String ht= hs1.gethoten();
        if(max< hs2.getdtb()){
            max= hs2.getdtb();
            ht= hs2.gethoten();
        }
        if(max< hs3.getdtb()){
            max= hs3.getdtb();
            ht= hs2.gethoten();
        }
        System.out.println(ht+ "co diem trung binh lon nhat la" +max);
    }
}
class dshocsinh{
    private Bai01 ds[];
    private int n;
   
    public void nhapds(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh");
        n= sc.nextInt();
        ds = new Bai01[n];
        for(int i=0; i<n; i++){
        ds[i]= new Bai01();
        ds[i].nhaphs();
        }
    }
    public void xuatds(){
        System.out.println("Danh sach hoc sinh la: \n");
        for(int i=0; i<n;i++){
            ds[i].xuaths();
        }
    }
    public void sapxep(){
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1 - i; j++){
                if (ds[j].getdtb() < ds[j + 1].getdtb()){
                    Bai01 temp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = temp;
                }
            }
        System.out.println("Danh sach hoc sinh sau khi sap xep theo diem trung binh giam dan: \n");
        xuatds();
        }
    }
}
class Demo2{
    public static void main(String[]args){
        dshocsinh ds= new dshocsinh();
        ds.nhapds();
        ds.sapxep();
        ds.xuatds();
    }
}