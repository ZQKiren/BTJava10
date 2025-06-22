package Buoi9;

import java.util.Scanner;

public class MaySay extends ThietBiDien {
	private double khoiLuongSay;   
    private String kieuSay;
    
	public double getKhoiLuongSay() {
		return khoiLuongSay;
	}
	public void setKhoiLuongSay(double khoiLuongSay) {
		this.khoiLuongSay = khoiLuongSay;
	}
	public String getKieuSay() {
		return kieuSay;
	}
	public void setKieuSay(String kieuSay) {
		this.kieuSay = kieuSay;
	} 
    
	@Override
	public void nhapThongTin() {
	    super.nhapThongTin();
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Nhập khối lượng sấy tối đa (kg) (ví dụ: 7.0, 10.5): ");
	    khoiLuongSay = Double.parseDouble(scanner.nextLine());

	    System.out.println("Nhập kiểu sấy (ví dụ: Sấy ngưng tụ, Sấy thông hơi, Sấy bơm nhiệt): ");
	    kieuSay = scanner.nextLine();
	}
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println(">>> Thiết bị là Máy Sấy");
        System.out.println("Khối lượng sấy  : " + khoiLuongSay + " kg");
        System.out.println("Kiểu sấy         : " + kieuSay);
        System.out.println("------------------------------------");
    }
}
