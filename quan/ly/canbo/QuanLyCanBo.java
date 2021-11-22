package quan.ly.canbo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {

	public static void edit(ArrayList<CongNhan> arrCongNhan, ArrayList<KySu> arrKySu, ArrayList<NhanVien> arrNhanVien) {
		Scanner sc = new Scanner(System.in);
		subMenu();
		int b = sc.nextInt();
		switch (b) {
		case 1:
			addTk(arrCongNhan, arrKySu, arrNhanVien); // Them can bo
			break;
		case 2:
			System.out.println("Danh sach cong nhan :");
			for (CanBo d : arrCongNhan) {
				System.out.println(d);
			}
			System.out.println("Danh sach ky su :");
			for (CanBo e : arrKySu) {
				System.out.println(e);
			}
			System.out.println("Danh sach nhan vien :");
			for (CanBo f : arrNhanVien) {
				System.out.println(f);
			}
			break;
		default: break; // Nhan phim bat ky de thoat
		}
	}

	public static void subMenu() {
		Main.myPrint("=============== Chinh sua danh sach ===============");
		Main.myPrint("|1) Them can bo                                   |");
		Main.myPrint("|2) Hien thi danh sach                            |");
		Main.myPrint("|0) Exit                                          |");
	}

	public static void addTk(ArrayList<CongNhan> arrCongNhan, ArrayList<KySu> arrKySu, ArrayList<NhanVien> arrNhanVien) {
		Scanner sc = new Scanner(System.in);
		int th;
		System.out.println("Nhap thong tin cong nhan:");
		for (int i = 0;; i++) {
			System.out.println("*Nhap thong tin cong nhan thu " + (i + 1) + ":");
			CongNhan congNhan = new CongNhan();
			congNhan.nhapThongTin();
			arrCongNhan.add(congNhan);
			Main.myPrint("Ban muon dung? [1.Y/0.N]");
			th = sc.nextInt();
			if (th == 1) break;
		}
		System.out.println("Nhap thong tin ky su: ");
		for (int i = 0;; i++) {
			System.out.println("*Nhap thong tin ky su thu " + (i + 1) + ":");
			KySu kySu = new KySu();
			kySu.nhapThongTin();
			arrKySu.add(kySu);
			Main.myPrint("Ban muon dung? [1.Y/0.N]");
			th = sc.nextInt();
			if (th == 1) break;
		}
		System.out.println("Nhap thong tin nhan vien: ");
		for (int i = 0;; i++) {
			System.out.println("*Nhap thong tin nhan vien thu " + (i + 1) + ":");
			NhanVien nhanVien = new NhanVien();
			nhanVien.nhapThongTin();
			arrNhanVien.add(nhanVien);
			Main.myPrint("Ban muon dung? [1.Y/0.N]");
			th = sc.nextInt();
			if (th == 1) break;
		}
	}
}
