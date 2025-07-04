package Buoi10;

import java.util.Scanner;

public class PhuongTienGiaoThong {

	protected String hangSanXuat;
    protected String tenPhuongTien;
    protected int namSanXuat;
    protected double vanTocToiDa;
    
    public PhuongTienGiaoThong() {
    	
    }
    
    public PhuongTienGiaoThong(String hangSanXuat, String tenPhuongTien, int namSanXuat, double vanTocToiDa) {
    	this.hangSanXuat= hangSanXuat;
    	this.tenPhuongTien= tenPhuongTien;
    	this.namSanXuat = namSanXuat;
    	this.vanTocToiDa = vanTocToiDa;
    }
    
    public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public String getTenPhuongTien() {
		return tenPhuongTien;
	}
	public void setTenPhuongTien(String tenPhuongTien) {
		this.tenPhuongTien = tenPhuongTien;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public double getVanTocToiDa() {
		return vanTocToiDa;
	}
	public void setVanTocToiDa(double vanTocToiDa) {
		this.vanTocToiDa = vanTocToiDa;
	}
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hãng sản xuất: ");
        hangSanXuat = sc.nextLine();
        System.out.print("Nhập tên phương tiện: ");
        tenPhuongTien = sc.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        namSanXuat = sc.nextInt();
        System.out.print("Nhập vận tốc tối đa: ");
        vanTocToiDa = sc.nextDouble();
    }
    
    public void xuat() {
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("Tên phương tiện: " + tenPhuongTien);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Vận tốc tối đa: " + vanTocToiDa + " km/h");
    }
}
