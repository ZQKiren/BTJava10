package Buoi9;

import java.util.Scanner;

public class DieuHoa extends ThietBiDien {
	private double congSuatLamLanh;
	private String loaiGas;
	
	public double getCongSuatLamLanh() {
		return congSuatLamLanh;
	}
	public void setCongSuatLamLanh(double congSuatLamLanh) {
		this.congSuatLamLanh = congSuatLamLanh;
	}
	public String getLoaiGas() {
		return loaiGas;
	}
	public void setLoaiGas(String loaiGas) {
		this.loaiGas = loaiGas;
	}
	
	@Override
	public void nhapThongTin() {
	    super.nhapThongTin();
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Nhập công suất làm lạnh (HP) (ví dụ: 1.0, 1.5, 2.0): ");
	    congSuatLamLanh = Double.parseDouble(scanner.nextLine());

	    System.out.println("Nhập loại gas (ví dụ: R32, R410A): ");
	    loaiGas = scanner.nextLine();
	}

	
	@Override
	public void hienThiThongTin() {
	    super.hienThiThongTin();
	    System.out.println(">>> Thiết bị là Máy Điều Hòa");
	    System.out.println("Công suất làm lạnh: " + congSuatLamLanh + " HP");
	    System.out.println("Loại gas           : " + loaiGas);
	    System.out.println("------------------------------------");
	}
}
