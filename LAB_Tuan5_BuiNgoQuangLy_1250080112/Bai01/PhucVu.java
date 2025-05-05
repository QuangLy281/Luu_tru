package Bai01;
class PhucVu extends NhanVien {
    public PhucVu(){
        super();
    }
    public PhucVu(String maNhanVien,String tenNhanVien,String trinhDo){
        super(maNhanVien,tenNhanVien,trinhDo);
    }
    @Override
    public double tinhLuong(){
        return getluongCoBan();
    }
}
