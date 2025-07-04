package Buoi11;

public class GiamDoc extends NhanVien {
    public static final double LUONG_NGAY = 300;
    private double coPhan;

    @Override
    public double tinhLuong() {
        return soNgayLamViec * LUONG_NGAY;
    }

    public double tinhThuNhap(double loiNhuan) {
        return tinhLuong() + (coPhan / 100) * loiNhuan;
    }

    @Override
    public void nhap() {
        super.nhap();
        do {
            System.out.print("Nhập cổ phần (%): ");
            coPhan = Double.parseDouble(scanner.nextLine());
            if (coPhan < 0 || coPhan > 100) {
                System.out.println("Cổ phần phải từ 0 đến 100. Nhập lại!");
            }
        } while (coPhan < 0 || coPhan > 100);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chức vụ: Giám đốc");
        System.out.println("Cổ phần: " + coPhan + "%");
        System.out.println("Lương: " + tinhLuong());
    }

    public double getCoPhan() {
        return coPhan;
    }
}
