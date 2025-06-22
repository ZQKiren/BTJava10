package Buoi9;

import java.util.Scanner;

public class HocSinh {
	private String hoTen;
	private int tuoi;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
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
		System.out.println("Nhập tên HS: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhập tuổi HS: ");
		tuoi = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập điểm toán: ");
		diemToan = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhập điểm lý: ");
		diemLy = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhập điểm hóa: ");
		diemHoa = Double.parseDouble(scanner.nextLine());
	}
	
	public void xuatThongTin() {
		System.out.printf("Tên HS: %-8s | Tuổi: %-20d\n", hoTen, tuoi);
		System.out.printf("Toán: %-4.1f | Lý: %-4.1f | Hóa: %-4.1f | ĐTB: %-4.1f",
			diemToan, diemLy, diemHoa, diemTrungBinh());
		
	}
	
	public double diemTrungBinh() {
		return (diemToan + diemLy + diemHoa)/3;
	}
	
}



