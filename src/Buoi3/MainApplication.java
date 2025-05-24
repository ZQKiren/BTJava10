package Buoi3;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		double a, y, z, canhHuyen, nhietDo, donThuc, trungBinh = 0;
		int n, u = 0, tong2KySo, x = 8, tienTe, tong = 0, so1, so2, so3, so4, so5;
		final int DEM = 5;
		
		//Cau 1
//		System.out.print("Nhap canh thu 1: ");
//		y = scanner.nextDouble();
//		System.out.print("Nhap canh thu 2: ");
//		z = scanner.nextDouble();
//		canhHuyen = Math.sqrt(Math.pow(y, 2) + Math.pow(z, 2));
//		System.out.print("Canh huyen tam giac vuong la: "+ canhHuyen);
		
		//Cau2
//		System.out.print("Nhap gia tri cua a: ");
//		a = scanner.nextDouble();
//		System.out.print("Nhap gia tri cua n (n => 0): ");
//		n = scanner.nextInt();
//		donThuc = a* Math.pow(x, n);
//		System.out.println("Gia tri don thuc la: "+donThuc);
		
		//Cau3
//		System.out.print("Nhap so nguyen duong u (10 <= u <= 99): ");
//		n = scanner.nextInt();
//		tong2KySo = n * 10 + n % 10;
//		System.out.print("Tong hai ky so la: "+ tong2KySo);
		
		//Cau4
		System.out.println("Nhap so thu 1: ");
		so1 = scanner.nextInt();
		tong += so1;
		System.out.println("Nhap so thu 2: ");
		so2 = scanner.nextInt();
		tong += so2;
		System.out.println("Nhap so thu 3: ");
		so3 = scanner.nextInt();
		tong += so3;
		System.out.println("Nhap so thu 4: ");
		so4 = scanner.nextInt();
		tong += so4;
		System.out.println("Nhap so thu 5: ");
		so5 = scanner.nextInt();
		tong += so5;
		
		trungBinh = (double) tong/DEM;
		System.out.println("Tong cua 5 so la: "+tong+"     "+"Trung binh cua 5 so la: "+trungBinh);
		
		//Cau5
//		System.out.print("Nhap so nhiet do bat ky (°C): ");
//		nhietDo = scanner.nextDouble();
//		System.out.println(nhietDo +" °C "+"==> "+ nhietDo * 1.8 + 32 + " °F");
		
		//Cau6
//		System.out.print("Nhap so tien USD can quy doi: ");
//		tienTe = scanner.nextInt();
//		System.out.println(tienTe +" USD "+"==> "+ tienTe * 23500 + " VND");
	}
}
