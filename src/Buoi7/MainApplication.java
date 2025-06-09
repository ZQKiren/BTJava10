package Buoi7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		int n = 0;
		List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập số sinh viên muốn tạo: ");
			n = Integer.parseInt(scanner.nextLine());
		}while(n <= 0);
		for(int i = 1;i<=n;i++) {
			SinhVien sinhVien = new SinhVien();
			System.out.println("Nhập sinh viên thứ "+i);
			sinhVien.nhapThongTin();
			
			listSinhVien.add(sinhVien);
		}
		
		listSinhVien.forEach(item ->{
			item.xuatThongTin();
			System.out.println("Điểm TB: "+item.diemTrungBinh());
			System.out.println("Xếp loại: "+item.xepLoai() + "\n");		
		});

	}

}
