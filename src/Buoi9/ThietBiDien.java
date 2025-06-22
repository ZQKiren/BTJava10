package Buoi9;

import java.util.Scanner;

public class ThietBiDien {
	private String tenThietBi;   
	private double congSuat;      
	private String hangSanXuat;   
	private String chucNang;      
	
	public String getTenThietBi() {
		return tenThietBi;
	}

	public void setTenThietBi(String tenThietBi) {
		this.tenThietBi = tenThietBi;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}

	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên thiết bị: ");
		tenThietBi = scanner.nextLine();
		System.out.println("Nhập công suất: ");
		congSuat = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập hãng sản xuất: ");
		hangSanXuat = scanner.nextLine();
		System.out.println("Nhập chức năng: ");
		chucNang = scanner.nextLine();
	}
	
	public void hienThiThongTin() {
	    System.out.println("===== Thông Tin Thiết Bị Điện =====");
	    System.out.println("Tên thiết bị     : " + tenThietBi);
	    System.out.println("Công suất        : " + congSuat + " W");
	    System.out.println("Hãng sản xuất    : " + hangSanXuat);
	    System.out.println("Chức năng        : " + chucNang);
	}

}
