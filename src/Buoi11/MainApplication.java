package Buoi11;

public class MainApplication {
    public static void main(String[] args) {
        QuanLyCongTy qlct = new QuanLyCongTy();
        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập thông tin công ty");
            System.out.println("2. Phân bổ nhân viên vào trưởng phòng");
            System.out.println("3. Thêm hoặc xóa nhân sự");
            System.out.println("4. Xuất thông tin toàn bộ nhân sự");
            System.out.println("5. Tính tổng lương công ty");
            System.out.println("6. Tìm nhân viên lương cao nhất");
            System.out.println("7. Tìm trưởng phòng nhiều nhân viên nhất");
            System.out.println("8. Sắp xếp nhân sự theo tên ABC");
            System.out.println("9. Sắp xếp nhân sự theo lương giảm dần");
            System.out.println("10. Tìm giám đốc cổ phần cao nhất");
            System.out.println("11. Tính thu nhập giám đốc");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = Integer.parseInt(NhanVien.scanner.nextLine());

            switch (chon) {
                case 1:
                    qlct.nhapThongTinCongTy();
                    break;
                case 2:
                	qlct.phanBoNhanVienChoTruongPhong();
                    break;
                case 3:
                	qlct.themHoacXoaNhanSu();
                    break;
                case 4:
                	qlct.xuatToanBoNhanSu();
                    break;
                case 5:
                	qlct.tinhTongLuongCongTy();
                    break;
                case 6:
                	qlct.timNhanVienLuongCaoNhat();
                    break;
                case 7:
                	qlct.timTruongPhongNhieuNhanVienNhat();
                    break;
                case 8:
                	qlct.sapXepNhanSuTheoTen();
                    break;
                case 9:
                	qlct.sapXepNhanSuTheoLuongGiamDan();
                    break;
                case 10:
                	qlct.timGiamDocCoPhanCaoNhat();
                    break;
                case 11:
                	qlct.tinhThuNhapGiamDoc();
                    break;
            }
        } while (chon != 0);
    }
}
