package Buoi9;

import java.util.Scanner;

public class TroChoi {
    private String tenTroChoi;
    private int soLuotChoi;

    public String getTenTroChoi() {
        return tenTroChoi;
    }

    public void setTenTroChoi(String tenTroChoi) {
        this.tenTroChoi = tenTroChoi;
    }

    public int getSoLuotChoi() {
        return soLuotChoi;
    }

    public void setSoLuotChoi(int soLuotChoi) {
        this.soLuotChoi = soLuotChoi;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên trò chơi (ví dụ: Cờ caro, Bắn súng, Đua xe): ");
        tenTroChoi = scanner.nextLine();
        System.out.println("Nhập số lượt chơi (ví dụ: 3, 5, 10): ");
        soLuotChoi = Integer.parseInt(scanner.nextLine());
    }

    public void batDau() {
        System.out.println(">>> Trò chơi \"" + tenTroChoi + "\" đã bắt đầu!");
    }

    public void ketThuc() {
        System.out.println(">>> Trò chơi \"" + tenTroChoi + "\" đã kết thúc sau " + soLuotChoi + " lượt chơi.");
    }
}
