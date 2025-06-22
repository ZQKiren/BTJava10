package Buoi9;

import java.util.Scanner;

public class XeMay extends PhuongTienGiaoThong{
	private String loaiXe;
	private int dungTichXe;
	
	
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public int getDungTichXiLanh() {
		return dungTichXe;
	}
	public void setDungTichXiLanh(int dungTichXiLanh) {
		this.dungTichXe = dungTichXiLanh;
	}
	
	@Override
	public void nhap() {
	    super.nhap();
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Nhập loại xe (ví dụ: Xe số, Xe ga, Cào cào): ");
	    loaiXe = scanner.nextLine();
	    System.out.println("Nhập dung tích xe (cc) (ví dụ: 110, 150, 250): ");
	    dungTichXe = Integer.parseInt(scanner.nextLine());
	}
	
	@Override
	public void xuat() {
	    super.xuat();
	    System.out.println(">>> Đây là xe máy");
	    System.out.println("Loại xe          : " + loaiXe);
	    System.out.println("Dung tích        : " + dungTichXe + " cc");
	    System.out.println("----------------------------------------");
	}
}
