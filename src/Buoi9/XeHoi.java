package Buoi9;

import java.util.Scanner;

public class XeHoi extends PhuongTienGiaoThong {
	private int soChoNgoi;
	private String kieuDongCo;
	
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public String getKieuDongCo() {
		return kieuDongCo;
	}
	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}
	
	@Override
	public void nhap() {
	    super.nhap();
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Nhập số chỗ ngồi (ví dụ: 4, 7): ");
	    soChoNgoi = Integer.parseInt(scanner.nextLine());
	    System.out.println("Nhập kiểu động cơ (ví dụ: Xăng, Diesel, Hybrid): ");
	    kieuDongCo = scanner.nextLine();
	}
	
	@Override
	public void xuat() {
	    super.xuat();
	    System.out.println(">>> Đây là xe hơi");
	    System.out.println("Số chỗ ngồi      : " + soChoNgoi);
	    System.out.println("Kiểu động cơ     : " + kieuDongCo);
	    System.out.println("----------------------------------------");
	}
}
