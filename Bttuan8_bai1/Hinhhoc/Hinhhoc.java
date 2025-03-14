package Hinhhoc;
public abstract class Hinhhoc {
    public final float pi =3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
    
    abstract void Hinhhoc();
    public void xuatTen(){
        System.out.println("\n=====" +ten+ " ====");
    }
    abstract void tinhChuVi();
    abstract void tinhDienTich();
    abstract void tinhTheTich();
}