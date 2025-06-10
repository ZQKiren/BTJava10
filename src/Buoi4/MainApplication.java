package Buoi4;

import java.util.Scanner;

public class MainApplication {

	public static void tongBaSo() {
		int a = 0, b = 0, c = 0, tong;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thu 1: ");
		a = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap so thu 2: ");
		b = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap so thu 3: ");
		c = Integer.parseInt(scanner.nextLine());

		tong = a + b + c;
		System.out.println("Tong ba so la: " + tong);
	}

	public static void tinhChanLe() {
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap mot so bat ky: ");
		a = Integer.parseInt(scanner.nextLine());

		if (a == 0) {
			System.out.println(a + "la mot so khong chan khong le");
		} else if (a % 2 == 0) {
			System.out.println(a + " la mot so chan");
		} else {
			System.out.println(a + "la mot so le");
		}
	}

	public static void timSoLonNhat() {
		int a = 0, b = 0, c = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		a = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap so b: ");
		b = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap so c: ");
		c = Integer.parseInt(scanner.nextLine());

		System.out.println("So lon nhat la: ");
		if (a > b) {
			System.out.println(a);
		} else if (a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

	public static void chuongTrinhTinhToan() {
		int a = 0, b = 0, phepTinh = 0;
		double ketQua;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thu 1: ");
		a = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap so thu 2: ");
		b = Integer.parseInt(scanner.nextLine());
		System.out.println("Hay chon phep tinh (1 => +, 2 => -, 3 => *, 4 => /):");
		phepTinh = Integer.parseInt(scanner.nextLine());

		switch (phepTinh) {
		case 1:
			ketQua = a + b;
			System.out.println("Tong cua phep tinh la: " + ketQua);
			break;
		case 2:
			ketQua = a - b;
			System.out.println("Tong cua phep tinh la: " + ketQua);
			break;
		case 3:
			ketQua = a * b;
			System.out.println("Tong cua phep tinh la: " + ketQua);
			break;
		case 4:
			ketQua = a / b;
			System.out.println("Tong cua phep tinh la: " + ketQua);
			break;
		}
	}

	public static void main(String[] args) {
		int so;
		do {
			System.out.println("====================Vui long chon chuong trinh muon thuc hien====================");
			System.out.println("(1). Tong ba so nhap vao");
			System.out.println("(2). Tinh chan le");
			System.out.println("(3). Tim so lon nhat");
			System.out.println("(4). Chuong trinh tinh toan");
			System.out.println("Vui long chon so theo huong dan nhu tren de thuc hien chuong trinh");
			Scanner scanner = new Scanner(System.in);
			so = Integer.parseInt(scanner.nextLine());
			if (so < 5 && so > 0) {
				switch (so) {
				case 1:
					tongBaSo();
					break;
				case 2:
					tinhChanLe();
					break;
				case 3:
					timSoLonNhat();
					break;
				case 4:
					chuongTrinhTinhToan();
					break;
				}
				System.out.println("Nhan Enter de tiep tuc...");
				scanner.nextLine();
			}
		} while (so > 0 && so < 5);
	}
}
