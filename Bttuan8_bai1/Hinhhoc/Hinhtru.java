
package Hinhhoc;
import java.util.Scanner;
public class Hinhtru extends Hinhtron {
    public float chieuCao;
    
    public void Hinhtru(){
}
    public void nhapChieucao(){
        System.out.print ("Nhap chieu cao hinh tru: ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }
    @Override
    public  void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich *chieuCao;
    }
}