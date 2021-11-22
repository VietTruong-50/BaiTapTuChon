package quan.ly.canbo;

public class CongNhan extends CanBo {
	private int bacCongNhan;

	public CongNhan() {
	}

	public CongNhan(int bacCongNhan,String tenCanBo, int tuoi, String diaChi, String gioiTinh) {
		super(tenCanBo, tuoi, diaChi, gioiTinh);
		this.bacCongNhan = bacCongNhan;
	}

	public int getBacCongNhan() {return bacCongNhan;}

	public void setBacCongNhan(int bacCongNhan) {this.bacCongNhan = bacCongNhan;}
	
	@Override
	public void nhapThongTin() {
		System.out.println("Nhap ten can bo: ");
		setTenCanBo(scanner.nextLine());
		System.out.println("Nhap tuoi: ");
		setTuoi(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Nhap dia chi: ");
		setDiaChi(scanner.nextLine());
		System.out.println("Gioi tinh: ");
		setGioiTinh(scanner.next());
		scanner.nextLine();
		System.out.println("Bac cong nhan(>1 && <10): ");
		while(bacCongNhan <1 || bacCongNhan >10) {
			bacCongNhan = scanner.nextInt();
		}
	}

	@Override
	public String toString() {
		return super.toString() + "|Bac cong nhan: " + getBacCongNhan();
	}
}
