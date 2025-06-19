	package Buoi8;

import java.util.Scanner;

public class SinhVien {
	private String maSV;
	private String tenSV;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public double getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public double getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}
	public double getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	public SinhVien() {
		tenSV="";
		maSV="";
		diemToan=0.0;
		diemLy=0.0;
		diemHoa=0.0;
	}
	
	public SinhVien(String tenSV, String maSV, double diemToan, double diemLy, double diemHoa) {
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã SV: ");
		maSV = scanner.nextLine();
		System.out.println("Nhập tên SV: ");
		tenSV = scanner.nextLine();
		System.out.println("Nhập điểm toán: ");
		diemToan = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhập điểm lý: ");
		diemLy = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhập điểm hóa: ");
		diemHoa = Double.parseDouble(scanner.nextLine());
	}
	
	public void xuatThongTin() {
		System.out.printf("Mã SV: %-8s | Tên SV: %-20s\n", maSV, tenSV);
		System.out.printf("Toán: %-4.1f | Lý: %-4.1f | Hóa: %-4.1f | ĐTB: %-4.1f | Xếp loại: %-10s\n",
			diemToan, diemLy, diemHoa, diemTrungBinh(), xepLoai());
		System.out.println("------------------------------------------------------------");
	}

	
	public double diemTrungBinh() {
		double diemTB = 0;
		diemTB = Math.round((diemToan + diemLy + diemHoa)/3);
		return diemTB;
	}
	
	public String xepLoai() {
		double dtb = diemTrungBinh();
		String xepLoai;
		if(dtb >= 9)
			xepLoai = "Xuất sắc";
		else if(dtb >= 8)
			xepLoai = "Giỏi";
		else if(dtb >= 7)
			xepLoai = "Khá";
		else if(dtb >= 6)
			xepLoai = "TB Khá";
		else
			xepLoai = "Yếu";
		return xepLoai;
	}
	
	
}
