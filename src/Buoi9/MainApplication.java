package Buoi9;

public class MainApplication {

    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        hs.nhapThongTin();
        hs.xuatThongTin();

        XeHoi xh = new XeHoi();
        xh.nhap();
        xh.xuat();

        XeMay xm = new XeMay();
        xm.nhap();
        xm.xuat();
        
        MaySay ms = new MaySay();
        ms.nhapThongTin();
        ms.hienThiThongTin();
        
        DieuHoa dh = new DieuHoa();
        dh.nhapThongTin();
        dh.hienThiThongTin();

        TroChoi tc = new TroChoi();
        tc.nhapThongTin();
        tc.batDau();
        tc.ketThuc();
    }
}
