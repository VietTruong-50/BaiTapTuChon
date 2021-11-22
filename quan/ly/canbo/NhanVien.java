package quan.ly.canbo;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien() {}

	public NhanVien(String congViec, String tenCanBo, int tuoi, String diaChi, String gioiTinh) {
		super(tenCanBo, tuoi, diaChi, gioiTinh);
		this.setCongViec(congViec);
	}

	public String getCongViec() {return congViec;}

	public void setCongViec(String congViec) {this.congViec = congViec;}

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
		System.out.println("Cong viec: ");
		congViec = scanner.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + "|Cong viec: " + getCongViec();
	}
}
