package Buoi11;

import java.util.ArrayList;

public class QuanLyCongTy {
    private ArrayList<NhanVienThuong> dsNV = new ArrayList<>();
    private ArrayList<TruongPhong> dsTP = new ArrayList<>();
    private ArrayList<GiamDoc> dsGD = new ArrayList<>();
    private double doanhThuThang = 0;

    public void nhapThongTinCongTy() {
        System.out.print("Nhập doanh thu tháng: ");
        doanhThuThang = Double.parseDouble(NhanVien.scanner.nextLine());

        System.out.print("Số nhân viên thường: ");
        int n = Integer.parseInt(NhanVien.scanner.nextLine());
        for (int i = 0; i < n; i++) {
            NhanVienThuong nv = new NhanVienThuong();
            nv.nhap();
            dsNV.add(nv);
        }

        System.out.print("Số trưởng phòng: ");
        int m = Integer.parseInt(NhanVien.scanner.nextLine());
        for (int i = 0; i < m; i++) {
            TruongPhong tp = new TruongPhong();
            tp.nhap();
            dsTP.add(tp);
        }

        System.out.print("Số giám đốc: ");
        int p = Integer.parseInt(NhanVien.scanner.nextLine());
        for (int i = 0; i < p; i++) {
            GiamDoc gd = new GiamDoc();
            gd.nhap();
            dsGD.add(gd);
        }
    }

    public void phanBoNhanVienChoTruongPhong() {
        for (NhanVienThuong nv : dsNV) {
            System.out.println("Phân cho NV: " + nv.getHoTen());
            for (int i = 0; i < dsTP.size(); i++) {
                System.out.println((i + 1) + ". " + dsTP.get(i).getHoTen());
            }
            System.out.print("Chọn số (0 để bỏ qua): ");
            int chon = Integer.parseInt(NhanVien.scanner.nextLine());
            if (chon > 0 && chon <= dsTP.size()) {
                TruongPhong tp = dsTP.get(chon - 1);
                nv.setTruongPhongQuanLy(tp);
                tp.themNhanVien(nv);
            }
        }
    }

    public void themHoacXoaNhanSu() {
        System.out.println("1. Thêm | 2. Xóa");
        int chon = Integer.parseInt(NhanVien.scanner.nextLine());
        if (chon == 1) {
            System.out.println("1. NV | 2. TP | 3. GD");
            int loai = Integer.parseInt(NhanVien.scanner.nextLine());
            if (loai == 1) {
                NhanVienThuong nv = new NhanVienThuong();
                nv.nhap();
                dsNV.add(nv);
            } else if (loai == 2) {
                TruongPhong tp = new TruongPhong();
                tp.nhap();
                dsTP.add(tp);
            } else {
                GiamDoc gd = new GiamDoc();
                gd.nhap();
                dsGD.add(gd);
            }
        } else if (chon == 2) {
            System.out.print("Nhập mã muốn xóa: ");
            String ma = NhanVien.scanner.nextLine();
            boolean found = xoaNhanVienTheoMa(ma);
            if (!found) found = xoaTruongPhongTheoMa(ma);
            if (!found) found = xoaGiamDocTheoMa(ma);
            if (found) {
                System.out.println("Đã xóa: " + ma);
            } else {
                System.out.println("Không tìm thấy.");
            }
        }
    }

    private boolean xoaNhanVienTheoMa(String ma) {
        for (NhanVienThuong nv : dsNV) {
            if (nv.getMaSo().equals(ma)) {
                if (nv.getTruongPhongQuanLy() != null) {
                    nv.getTruongPhongQuanLy().xoaNhanVien(nv);
                }
                dsNV.remove(nv);
                return true;
            }
        }
        return false;
    }

    private boolean xoaTruongPhongTheoMa(String ma) {
        for (TruongPhong tp : dsTP) {
            if (tp.getMaSo().equals(ma)) {
                for (NhanVienThuong nv : tp.getDanhSachNhanVien()) {
                    nv.setTruongPhongQuanLy(null);
                }
                dsTP.remove(tp);
                return true;
            }
        }
        return false;
    }

    private boolean xoaGiamDocTheoMa(String ma) {
        for (GiamDoc gd : dsGD) {
            if (gd.getMaSo().equals(ma)) {
                dsGD.remove(gd);
                return true;
            }
        }
        return false;
    }

    public void xuatToanBoNhanSu() {
        System.out.println("--- DANH SÁCH NHÂN SỰ ---");
        for (NhanVien nv : layTatCaNhanVien()) {
            nv.xuat();
            System.out.println("---");
        }
    }

    public void tinhTongLuongCongTy() {
        double tong = 0;
        for (NhanVien nv : layTatCaNhanVien()) {
            tong += nv.tinhLuong();
        }
        System.out.println("Tổng lương công ty: " + tong);
    }

    public void timNhanVienLuongCaoNhat() {
        ArrayList<NhanVien> all = layTatCaNhanVien();
        if (all.isEmpty()) {
            System.out.println("Không có nhân viên.");
            return;
        }
        NhanVien max = all.get(0);
        for (NhanVien nv : all) {
            if (nv.tinhLuong() > max.tinhLuong()) {
                max = nv;
            }
        }
        System.out.println("Nhân viên lương cao nhất:");
        max.xuat();
    }

    public void timTruongPhongNhieuNhanVienNhat() {
        if (dsTP.isEmpty()) {
            System.out.println("Không có trưởng phòng.");
            return;
        }
        TruongPhong max = dsTP.get(0);
        for (TruongPhong tp : dsTP) {
            if (tp.getDanhSachNhanVien().size() > max.getDanhSachNhanVien().size()) {
                max = tp;
            }
        }
        System.out.println("Trưởng phòng nhiều NV nhất:");
        max.xuat();
    }

    public void sapXepNhanSuTheoTen() {
        ArrayList<NhanVien> list = layTatCaNhanVien();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getHoTen().compareTo(list.get(j).getHoTen()) > 0) {
                    NhanVien temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (NhanVien nv : list) {
            nv.xuat();
            System.out.println("---");
        }
    }

    public void sapXepNhanSuTheoLuongGiamDan() {
        ArrayList<NhanVien> list = layTatCaNhanVien();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).tinhLuong() < list.get(j).tinhLuong()) {
                    NhanVien temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (NhanVien nv : list) {
            nv.xuat();
            System.out.println("---");
        }
    }

    public void timGiamDocCoPhanCaoNhat() {
        if (dsGD.isEmpty()) {
            System.out.println("Không có giám đốc.");
            return;
        }
        GiamDoc max = dsGD.get(0);
        for (GiamDoc gd : dsGD) {
            if (gd.getCoPhan() > max.getCoPhan()) {
                max = gd;
            }
        }
        System.out.println("Giám đốc cổ phần cao nhất:");
        max.xuat();
    }

    public void tinhThuNhapGiamDoc() {
        double tongLuong = 0;
        for (NhanVien nv : layTatCaNhanVien()) {
            tongLuong += nv.tinhLuong();
        }
        double loiNhuan = doanhThuThang - tongLuong;
        System.out.println("Lợi nhuận công ty: " + loiNhuan);
        for (GiamDoc gd : dsGD) {
            double thuNhap = gd.tinhLuong() + (loiNhuan * gd.getCoPhan() / 100);
            System.out.println("Thu nhập GĐ " + gd.getHoTen() + ": " + thuNhap);
        }
    }

    private ArrayList<NhanVien> layTatCaNhanVien() {
        ArrayList<NhanVien> all = new ArrayList<>();
        all.addAll(dsNV);
        all.addAll(dsTP);
        all.addAll(dsGD);
        return all;
    }
}
