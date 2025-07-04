package Buoi10;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Bai1
		Phanso ps = new Phanso();
		ps.nhapPS();
		ps.xuatPS();
		
		Phanso ps2 = new Phanso();
		ps2.nhapPS();
		ps2.xuatPS();
		
		ps.cong(ps2);
		ps.tru(ps2);
		ps.nhan(ps2);
		ps.chia(ps2);
		
		//Bai2
		VanDongVien vdv = new VanDongVien();
		VanDongVien vdv2 = new VanDongVien();
		
		vdv.nhap();
		vdv.xuat();
		
		vdv2.nhap();
		vdv2.xuat();
		
		System.out.println("\n--- SO SÁNH ---");
		if(vdv.soSanh(vdv2)) {
			System.out.println(vdv.getHoTen() + " lớn hơn " + vdv2.getHoTen());
		}else if(vdv2.soSanh(vdv)){
            System.out.println(vdv2.getHoTen() + " lớn hơn " + vdv.getHoTen());
		}else{
			System.out.println("Hai vận động viên bằng nhau");
		}
		
		//Bai3
//		System.out.println("Nhập số lượng nhân viên: ");
//		int n = scanner.nextInt();
//		ArrayList<NhanVien> danhSach = new ArrayList<NhanVien>();
//		for (int i = 0; i < n; i++) {
//            System.out.println("Nhân viên thứ " + (i + 1) + ":");
//            System.out.println("1. Nhân viên sản xuất");
//            System.out.println("2. Nhân viên văn phòng");
//            System.out.print("Chọn loại nhân viên: ");
//            int loai = scanner.nextInt();
//            
//            if (loai == 1) {
//                NhanVienSanXuat nvsx = new NhanVienSanXuat();
//                nvsx.nhap();
//                danhSach.add(nvsx);
//            } else {
//                NhanVienVanPhong nvvp = new NhanVienVanPhong();
//                nvvp.nhap();
//                danhSach.add(nvvp);
//            }
//        }
//        
//        System.out.println("\n--- DANH SÁCH NHÂN VIÊN ---");
//        for (int i = 0; i < danhSach.size(); i++) {
//            System.out.println("Nhân viên " + (i + 1) + ":");
//            danhSach.get(i).xuat();
//            System.out.println("---");
//        }
        
        //Bai4
		System.out.println("Nhập thông tin phương tiện giao thông:");
        PhuongTienGiaoThong pt = new PhuongTienGiaoThong();
        pt.nhap();
        System.out.println("\n--- THÔNG TIN PHƯƠNG TIỆN ---");
        pt.xuat();
        
        System.out.print("\nNhập số lượng ô tô: ");
        int n = scanner.nextInt();
        ArrayList<Oto> danhSachOto = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin ô tô thứ " + (i + 1) + ":");
            Oto oto = new Oto();
            oto.nhap();
            danhSachOto.add(oto);
        }
        
        System.out.println("\n--- DANH SÁCH Ô TÔ ---");
        for (int i = 0; i < danhSachOto.size(); i++) {
            System.out.println("Ô tô " + (i + 1) + ":");
            danhSachOto.get(i).xuat();
            System.out.println("---");
        }
        
        System.out.println("\n--- CÁC Ô TÔ CÓ CÙNG VẬN TỐC ---");
        for (int i = 0; i < danhSachOto.size(); i++) {
            for (int j = i + 1; j < danhSachOto.size(); j++) {
                if (danhSachOto.get(i).getVanTocToiDa() == danhSachOto.get(j).getVanTocToiDa()) {
                    System.out.println(danhSachOto.get(i).getTenPhuongTien() + " và " + 
                                     danhSachOto.get(j).getTenPhuongTien() + 
                                     " có cùng vận tốc: " + danhSachOto.get(i).getVanTocToiDa() + " km/h");
                }
            }
        }
	}
}
