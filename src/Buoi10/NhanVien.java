package Buoi10;

import java.util.Scanner;

public abstract class NhanVien {

	protected String hoTen;
    protected String ngaySinh;
    protected double luongCoBan;
    
    public NhanVien() {
    	
    }
    
    public NhanVien(String hoTen, String ngaySinh, Double luongCoBan) {
    	this.hoTen = hoTen;
    	this.ngaySinh = ngaySinh;
    	this.luongCoBan= luongCoBan;
    }
    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = Double.parseDouble(scanner.nextLine());
    }
    
    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
    
    public abstract double tinhLuong();
	
    
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}


}
