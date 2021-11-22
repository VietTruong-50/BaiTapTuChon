package quan.ly.canbo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		ArrayList<CongNhan> arrCongNhan = new ArrayList<>();
		ArrayList<KySu> arrKySu = new ArrayList<>();
		ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
		boolean exit = true;
		while (exit == true) {
			showMenu();
			int a = sc.nextInt();
			switch (a) {
			case 1:
				QuanLyCanBo.edit(arrCongNhan, arrKySu, arrNhanVien);
				break; // Chinh sua can bo
			case 2:
				Search.find(arrCongNhan, arrKySu, arrNhanVien);
				break; // Tim kiem can bo
			case 0:
				myPrint("Ban muon thoat: [1/0]");
				int c = sc.nextInt();
				if (c == 1) {
					exit = false;
					break;
				} else break;
			default:
				myPrint("invalid! please choose action in below menu");
				break;}
		}
	}

	public static void showMenu() {
		myPrint("================ Quan ly can bo ================");
		myPrint("|1. Chinh sua danh sach                         |");
		myPrint("|2. Tim kiem can bo                             |");
		myPrint("|0. Exit                                        |");
	}

	// Phuong thuc Println
	public static void myPrint(String content) {
		System.out.println(content);
	}
}