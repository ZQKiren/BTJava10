package Buoi11;

public class NhanVienThuong extends NhanVien {
    public static final double LUONG_NGAY = 100;
    private TruongPhong truongPhongQuanLy;

    @Override
    public double tinhLuong() {
        return soNgayLamViec * LUONG_NGAY;
    }

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chức vụ: Nhân viên thường");
        if (truongPhongQuanLy != null) {
            System.out.println("Trưởng phòng quản lý: " + truongPhongQuanLy.getHoTen());
        } else {
            System.out.println("Trưởng phòng quản lý: Không có");
        }
        System.out.println("Lương: " + tinhLuong());
    }

    public TruongPhong getTruongPhongQuanLy() {
        return truongPhongQuanLy;
    }

    public void setTruongPhongQuanLy(TruongPhong tp) {
        this.truongPhongQuanLy = tp;
    }
}
