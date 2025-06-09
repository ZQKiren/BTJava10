package Buoi7;

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
		System.out.println("Mã sinh viên: " + maSV + "\t" + "Tên sinh viên: " + tenSV);
		System.out.println("Điểm toán: " + diemToan + "\t" + "Điểm lý: " + diemLy + "\t" + "Điểm hóa: " + diemHoa);
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
