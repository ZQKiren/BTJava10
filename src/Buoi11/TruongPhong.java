package Buoi11;

import java.util.ArrayList;

public class TruongPhong extends NhanVien {
    public static final double LUONG_NGAY = 200;
    private ArrayList<NhanVienThuong> dsNhanVien = new ArrayList<>();

    @Override
    public double tinhLuong() {
        return soNgayLamViec * LUONG_NGAY + dsNhanVien.size() * 100;
    }

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chức vụ: Trưởng phòng");
        System.out.println("Số nhân viên quản lý: " + dsNhanVien.size());
        System.out.println("Lương: " + tinhLuong());
    }

    public void themNhanVien(NhanVienThuong nv) {
        dsNhanVien.add(nv);
    }

    public void xoaNhanVien(NhanVienThuong nv) {
        dsNhanVien.remove(nv);
    }

    public int getSoLuongNhanVien() {
        return dsNhanVien.size();
    }

    public ArrayList<NhanVienThuong> getDanhSachNhanVien() {
        return dsNhanVien;
    }
}
