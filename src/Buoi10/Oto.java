package Buoi10;

import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong {

	private int soChoNgoi;
    private String kieuDongCo;
    
    public Oto() {
    }
    
    public Oto(String hangSanXuat, String tenPhuongTien, int namSanXuat, double vanTocToiDa, int soChoNgoi, String kieuDongCo) {
    	super(hangSanXuat, tenPhuongTien, namSanXuat, vanTocToiDa);
    	this.soChoNgoi = soChoNgoi;
    	this.kieuDongCo = kieuDongCo;
    }
    
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); 
        System.out.print("Nhập số chỗ ngồi: ");
        soChoNgoi = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nhập kiểu động cơ: ");
        kieuDongCo = scanner.nextLine();
    }
    
    public void xuat() {
        super.xuat();
        System.out.println("Số chỗ ngồi: " + soChoNgoi);
        System.out.println("Kiểu động cơ: " + kieuDongCo);
    }
    
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
	
}
