package Buoi11;

import java.util.Scanner;

public abstract class NhanVien {
    protected String maSo;
    protected String hoTen;
    protected String soDienThoai;
    protected int soNgayLamViec;

    static Scanner scanner = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhập mã số: ");
        maSo = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        soDienThoai = scanner.nextLine();
        System.out.print("Nhập số ngày làm việc: ");
        soNgayLamViec = Integer.parseInt(scanner.nextLine());
    }

    public void xuat() {
        System.out.println("Mã số: " + maSo);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Số ngày làm việc: " + soNgayLamViec);
    }

    public abstract double tinhLuong();

    public String getHoTen() {
        return hoTen;
    }

    public String getMaSo() {
        return maSo;
    }
}
