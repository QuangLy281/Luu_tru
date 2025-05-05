package Bai03;
public class Main {
    public static void main(String[]args){
        Circle circle= new Circle("blue",true,5.0);
        Rectangle rectangle= new Rectangle("green",false,4.0,6.0);
        Square square= new Square("yellow",true,3.0);
        
        System.out.println("Thong tin hinh tron: "+circle.toString());
        System.out.println("Thong tin hinh chu nhat: "+rectangle.toString());
        System.out.println("Thong tin hinh vuong: "+square.toString());
        System.out.println("\nKiem tra equal:");
        System.out.println("Circle va Rectangle co bang nhau khong?" +circle.equals(rectangle));
        System.out.println("Rectangle va Square co bang nhau khong?" +rectangle.equals(square));
    }
}
