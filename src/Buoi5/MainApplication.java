package Buoi5;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {

	public static int ketQuaTranDau(int nguoi, int may) {
		if (nguoi == may)
			return 0;
		if ((nguoi == 1 && may == 3) || (nguoi == 2 && may == 1) || (nguoi == 3 && may == 2)) {
			return 1;
		}
		return -1;
	}

	public static int nhapLuaChon(Scanner scanner) {
		int luaChon;
		do {
			System.out.println("Nhap lua chon cua ban (1. Keo; 2. Bua; 3. Bao; 0. Thoat): ");
			luaChon = Integer.parseInt(scanner.nextLine());
		} while (luaChon < 0 || luaChon > 3);
		return luaChon;
	}

	public static void troChoiOanTuTi() {
		int luaChonMay = 0, luaChon = 0, ban = 0, may = 0;
		String tenLuaChon[] = { "", "Keo", "Bua", "Bao" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("------------------------Tro choi Oan Tu Ti------------------------");
		do {
			System.out.println("Nhap lua chon cua ban (1. Keo; 2. Bua; 3. Bao; 0. Thoat): ");
			luaChon = Integer.parseInt(scanner.nextLine());
		} while (luaChon < 0 || luaChon > 3);

		while (luaChon != 0) {
			switch (luaChon) {
			case 1:
				System.out.println("Lua chon cua ban la: Keo");
				break;
			case 2:
				System.out.println("Lua chon cua ban la: Bua");
				break;
			case 3:
				System.out.println("Lua chon cua ban la: Bao");
				break;
			}
			luaChonMay = (int) (Math.random() * 3 + 1);

			System.out.println("Lua chon cua may la: " + tenLuaChon[luaChonMay]);

			if (ketQuaTranDau(luaChon, luaChonMay) == 1) {
				System.out.println("Ban da thang!");
				ban++;
				System.out.println("Si so hien tai: " + ban + " - " + may);
			} else if (ketQuaTranDau(luaChon, luaChonMay) == 0) {
				System.out.println("Ban da hoa!");
				System.out.println("Si so hien tai: " + ban + " - " + may);
			} else {
				System.out.println("Ban da thua!");
				may++;
				System.out.println("Si so hien tai: " + ban + " - " + may);
			}
			do {
				System.out.println("Ban muon tiep tuc? Nhap lua chon cua ban (1. Keo; 2. Bua; 3. Bao; 0. Thoat): ");
				luaChon = Integer.parseInt(scanner.nextLine());
			} while (luaChon > 3 || luaChon < 0);
		}
		System.out.println("Tro choi ket thuc!");
		System.out.println("Si so chung cuoc: " + ban + " - " + may);
	}

	public static void nguyenDuongMin() {
		int tong = 0, i = -1;
		while (tong <= 10000) {
			tong += i;
			i++;
		}
		i--;
		System.out.println("So nguyen duong nho nhat sao cho (1 + 2 + .. n > 10000) la: " + i);
	}

	public static void tongSoLe() {
		Scanner scanner = new Scanner(System.in);
		int n, tong = 0;
		do {
			System.out.println("Nhap so nguyen duong n: ");
			n = Integer.parseInt(scanner.nextLine());
		} while (n <= 0);

		for (int i = 1; i < n; i++) {
			if (i % 2 != 0) {
				tong += i;
			}
		}
		System.out.println("Tong cac so le nguyen duong la: " + tong);
	}

	public static void tongLuyThua(int x) {
		int tong = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia tri n: ");
		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= n; i++) {
			tong = (int) (tong + (Math.pow(x, i)));
		}
		System.out.println("Tong cua S(n) la: " + tong);
	}

	public static void tinhNamLai() {
		long tong = 0, i;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so tien goc: ");
		long tienGoc = Long.parseLong(scanner.nextLine());
		System.out.println("Nhap so tien mong muon: ");
		long tienMongMuon = Long.parseLong(scanner.nextLine());
		System.out.println("Nhap lai suat hang nam: ");
		double laiSuat = Double.parseDouble(scanner.nextLine()) * 0.01;

		for (i = 0; tong < tienMongMuon; i++) {
			tong = (long) (tienGoc * Math.pow(1 + laiSuat, i));
		}
		System.out.println("Tien goc: " + tienGoc + "   Tien mong muon: " + tienMongMuon + "   Lai suat: " + laiSuat);
		System.out.println("Tong so tien sau lai: " + tong + "   So nam can doi: " + i);
		System.out.println("Vay so nam can doi de co the du voi so tien mong muon la: " + i + " nam");
	}

	public static void main(String[] args) {
		int so = 0;
		do {
			System.out.println("====================Vui long chon chuong trinh muon thuc hien====================");
			System.out.println("(1). Tro choi Oan Tu Ti");
			System.out.println("(2). Tim nguyen duong nho nhat de 1 + 2 + ... + n > 10000");
			System.out.println("(3). Tinh tong cac so le nguyen duong nho hon n");
			System.out.println("(4). Tinh tong S(n)= x +^2 + x^3 + ... + x^n");
			System.out.println("(5). tinh tong so nam lai trong tuong lai");
			System.out.println("Vui long chon so theo huong dan nhu tren de thuc hien chuong trinh");
			Scanner scanner = new Scanner(System.in);
			so = Integer.parseInt(scanner.nextLine());
			if (so < 5 && so > 0) {
				switch (so) {
				case 1:
					troChoiOanTuTi();
					break;
				case 2:
					nguyenDuongMin();
					break;
				case 3:
					tongSoLe();
					break;
				case 4:
					tongLuyThua(2);
					break;
				case 5:
					tinhNamLai();
					break;
				}
				System.out.println("Nhan Enter de tiep tuc...");
				scanner.nextLine();
			}
		} while (so > 0 && so < 6);
		System.out.println("Chuong trinh da ket thuc!");
	}
}
