import Hinhhoc.Hinhchunhat;
import Hinhhoc.Hinhtron;
import Hinhhoc.Hinhtru;
import Hinhhoc.Hinhvuong;
public class Main {
    public static void main(String[] args){
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        
        Hinhchunhat hinhchunhat = new Hinhchunhat();
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieurong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        
        Hinhtru hinhtru = new Hinhtru();
        hinhtru.nhapChieucao();
        hinhtru.tinhTheTich();
        
        Hinhvuong hinhvuong = new Hinhvuong();
        hinhvuong.nhapCanh();
}
}