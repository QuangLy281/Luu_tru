package LABTUAN1;
import java.util.Scanner;
public class Bai06 {
    public double canh1;
    public double canh2;
    public double canh3;

    public Bai06(){
    }
    public void kiemtratghople(){
        System.out.print("Nhap canh thu nhat: ");
        Scanner sc = new Scanner(System.in);
        this.canh1 =  sc.nextDouble();
        System.out.print("Nhap canh thu hai: ");
        this.canh2 =  sc.nextDouble();
        System.out.print("Nhap canh thu ba: ");
        this.canh3 =  sc.nextDouble();
        if ((canh1 + canh2 >= canh3) || (canh2 + canh3 >= canh1) || (canh1 + canh3 >= canh2)) {
            System.out.println("Day khong phai tam giac hop le");
        }
        else {
            System.out.println("Day la tam giac hop le");
        }
    }
    public static void main(String[] args){
        Bai06 kttghl = new Bai06();
        kttghl.kiemtratghople();
    }
}