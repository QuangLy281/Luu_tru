package LABTUAN1;
import java.util.Scanner;
public class Bai04 {
    public int nam;

    public Bai04(){
    }
    public void xacdinhnamnhuan(){
        System.out.print("Nhap vao nam: ");
        Scanner sc = new Scanner(System.in);
        this.nam =  sc.nextInt();
        if ((nam % 4 == 0) && (nam%100 != 0 || nam % 400 ==0)) {
            System.out.println ("Day la nam nhuan");
        }
        else {
            System.out.println("Day khong phai nam nhuan");
        }
    }
    public static void main(String[] args){
        Bai04 ktnamnhuan = new Bai04();
        ktnamnhuan.xacdinhnamnhuan();
    }
}