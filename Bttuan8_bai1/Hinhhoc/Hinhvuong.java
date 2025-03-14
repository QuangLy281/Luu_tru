package Hinhhoc;
import java.util.Scanner;
public class Hinhvuong extends Hinhchunhat {
    public void Hinhvuong(){
    }
    public void nhapCanh(){
        System.out.print("Nhap canh hinh vuong: ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }

    @Override
    public void tinhTheTich() {
    }
}