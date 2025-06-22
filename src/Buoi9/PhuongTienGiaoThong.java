package Buoi9;

import java.util.Scanner;

public class PhuongTienGiaoThong {
	private String tenPT;
	private String hangSX;
	private String mauSac;
	private int namSX;
	
	public String getTenPT() {
		return tenPT;
	}

	public void setTenPT(String tenPT) {
		this.tenPT = tenPT;
	}

	public String getHangSX() {
		return hangSX;
	}

	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public int getNamSX() {
		return namSX;
	}

	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên phương tiện: ");
		tenPT = scanner.nextLine();
		System.out.println("Nhập tên hãng sản xuất: ");
		hangSX = scanner.nextLine();
		System.out.println("Nhập màu sắc: ");
		mauSac = scanner.nextLine();
		System.out.println("Nhập năm sản xuất: ");
		namSX = Integer.parseInt(scanner.nextLine());
		
	}
	
	public void xuat() {
	    System.out.println("===== Thông Tin Phương Tiện Giao Thông =====");
	    System.out.println("Tên phương tiện : " + tenPT);
	    System.out.println("Hãng sản xuất    : " + hangSX);
	    System.out.println("Màu sắc          : " + mauSac);
	    System.out.println("Năm sản xuất     : " + namSX);
	}
}
