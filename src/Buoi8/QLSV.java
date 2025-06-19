package Buoi8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSV {

	private ArrayList<SinhVien> listSV;
	private Scanner scanner;
	
	public QLSV() {
		listSV = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public void duLieuGia() {
		System.out.println("Đang tạo dữ liệu giả...");
          
		listSV.add(new SinhVien("Nguyen Van A", "SV001", 8.5, 7.5, 9.0));
		listSV.add(new SinhVien("Tran Thi B", "SV002", 9.5, 9.0, 8.5));
		listSV.add(new SinhVien("Le Van C", "SV003", 6.0, 5.5, 4.0));
		listSV.add(new SinhVien("Pham Thi D", "SV004", 7.5, 8.0, 7.0));
		listSV.add(new SinhVien("Hoang Van E", "SV005", 4.5, 3.0, 5.0));
		listSV.add(new SinhVien("Vu Thi F", "SV006", 9.0, 9.5, 8.5));
		listSV.add(new SinhVien("Do Van G", "SV007", 6.5, 7.0, 6.0));
	}
	
	public void nhapSinhVien() {
		System.out.println("Nhập thông tin sinh viên: ");
		
		System.out.println("Tên sinh viên: ");
		String tenSV = scanner.nextLine();
		
		System.out.println("Mã sinh viên: ");
		String maSV = scanner.nextLine();
		
		System.out.println("Điểm toán: ");
		double diemToan = scanner.nextDouble();
		
		System.out.println("Điểm lý: ");
		double diemLy = scanner.nextDouble();
		
		System.out.println("Điểm hóa: ");
		double diemHoa = scanner.nextDouble();
		
		SinhVien sv = new SinhVien(tenSV,maSV,diemToan,diemLy,diemHoa);
		listSV.add(sv);
		
		System.out.println("Đã thêm sinh viên thành công !");
	}
	
	public void xuatSinhVien() {
		if(listSV.isEmpty()) {
			System.out.println("Danh sach rong!");
			return;
		}
		
		System.out.println("\n======== DANH SACH SINH VIEN =========");
		for(SinhVien sv: listSV) {
			sv.xuatThongTin();
		}
		
		System.out.printf("Tong so sinh vien: %d%n",listSV.size());
	}
	
	public void xuatSVYeu() {
		System.out.println("=========== Danh sách sinh viên yếu ===========");
		List<SinhVien> listYeu = new ArrayList<SinhVien>();
		listSV.forEach(item ->{
			if(item.xepLoai().equals("Yếu"))
				listYeu.add(item);
		});
		
		listYeu.forEach(item ->{
			item.xuatThongTin();
		});
		
	}
	
	public void xuatSVDtbMax() {
	    if (listSV.isEmpty()) {
	        System.out.println("Danh sách rỗng!");
	        return;
	    }

	    SinhVien max = listSV.get(0);

	    for (SinhVien sv : listSV) {
	        if (sv.diemTrungBinh() > max.diemTrungBinh()) {
	            max = sv;
	        }
	    }

	    System.out.println("=== Sinh viên có điểm trung bình cao nhất ===");
	    max.xuatThongTin();
	}

	
	public void timTheoTen() {
		if(listSV.isEmpty()) {
			System.out.println("Danh sach rong!");
			return;
		}
		
		System.out.println("Nhập tên cần tìm: ");
		String tenSV = scanner.nextLine().toLowerCase();
	
		List<SinhVien> listTheoTen = new ArrayList<SinhVien>();
		
		listSV.forEach(item ->{
			if(item.getTenSV().toLowerCase().contains(tenSV))
				listTheoTen.add(item);
		});
		
		listTheoTen.forEach(item ->{
			item.xuatThongTin();
		});
	}
	
	public void timTheoMa() {
		if(listSV.isEmpty()) {
			System.out.println("Danh sach rong!");
			return;
		}
		System.out.println("Nhập mã cần tìm: ");
		String maSV = scanner.nextLine().toLowerCase();
		
		List<SinhVien> listTheoMa = new ArrayList<SinhVien>();
		
		listSV.forEach(item -> {
			if(item.getMaSV().toLowerCase().contains(maSV))
				listTheoMa.add(item);
		});
		
		listTheoMa.forEach(item ->{
			item.xuatThongTin();
		});
	}
	
	public void xoaTheoMa() {
		System.out.println("Nhập mã cần tìm: ");
		String maSV = scanner.nextLine().toLowerCase();
		for(int i =0;i<listSV.size();i++) {
			if(listSV.get(i).getMaSV().equalsIgnoreCase(maSV)) {
				SinhVien svXoa = listSV.get(i);
				svXoa.xuatThongTin();
				
				System.out.println("Ban co chac muon xoa: (y/n)");
				String xacNhan = scanner.nextLine().toLowerCase();
				if(xacNhan.equals("y")) {
					listSV.remove(i);
					System.out.println("Xoa thanh cong");
				}else 
					System.out.println("Da huy thao tac");
			}
		}
	}
	
	public void hienThiMenu() {
        System.out.println("1. Tạo dữ liệu giả");
        System.out.println("2. Nhập sinh viên mới");
        System.out.println("3. In danh sách tất cả sinh viên");
        System.out.println("4. In sinh viên có điểm TB cao nhất");
        System.out.println("5. In tất cả sinh viên YẾU");
        System.out.println("6. Tìm sinh viên theo TÊN");
        System.out.println("7. Tìm sinh viên theo MÃ");
        System.out.println("8. Xóa sinh viên theo MÃ");
        System.out.println("0. Quay lại menu chính");
        System.out.print("Chọn chức năng: ");
    }
	
	public void chayChuongTrinh() {
        int luaChon;
        
        do {
            hienThiMenu();
            luaChon = scanner.nextInt();
            scanner.nextLine();
            
            switch (luaChon) {
                case 1: duLieuGia(); break;
                case 2: nhapSinhVien(); break;
                case 3: xuatSinhVien(); break;
                case 4: xuatSVDtbMax(); break;
                case 5: xuatSVYeu(); break;
                case 6: timTheoTen(); break;
                case 7: timTheoMa(); break;
                case 8: xoaTheoMa(); break;
                case 0: System.out.println("Quay lại menu chính..."); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
            
            if (luaChon != 0) {
                System.out.println("\nNhấn Enter để tiếp tục...");
                scanner.nextLine();
            }
            
        } while (luaChon != 0);
    }
}
