package quan.ly.canbo;

import java.util.ArrayList;
import java.util.Scanner;


public class Search {
	public static void find(ArrayList<CongNhan> arrCongNhan, ArrayList<KySu> arrKySu, ArrayList<NhanVien> arrNhanVien) {
		Scanner sc = new Scanner(System.in);
		Main.myPrint("=============== Tim kiem  ===============");
		Main.myPrint("|  (Chon can bo muon tim [1.Cong nhan/ 2.Ky su/ 3.Nhan vien]) |");
		int choose = sc.nextInt();
		Main.myPrint("   (--Theo ho va ten--)");
		String search = sc.next();
		if (choose == 1) {
			for (CanBo d : arrCongNhan) {
				if (d.getTenCanBo() != null && d.getTenCanBo().contains(search)) {
					System.out.println(d);
				} else break;
			}
		} else if (choose == 2) {
			for (CanBo d : arrKySu) {
				if (d.getTenCanBo() != null && d.getTenCanBo().contains(search)) {
					System.out.println(d);
				} else break;
			}
		} else if (choose == 3) {
			for (CanBo d : arrNhanVien) {
				if (d.getTenCanBo() != null && d.getTenCanBo().contains(search)) {
					System.out.println(d);
				} else break;
			}
		}
	}
}
