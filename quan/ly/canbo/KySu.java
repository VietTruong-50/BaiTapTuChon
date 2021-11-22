package quan.ly.canbo;

public class KySu extends CanBo {

	private String nganhDaoTao;

	public KySu() {}

	public KySu(String nganhDaoTao, String tenCanBo, int tuoi, String diaChi, String gioiTinh) {
		super(tenCanBo, tuoi, diaChi, gioiTinh);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {return nganhDaoTao;}

	public void setNganhDaoTao(String nganhDaoTao) {this.nganhDaoTao = nganhDaoTao;}

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
		System.out.println("Nganh dao tao: ");
		nganhDaoTao = scanner.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + "|Nganh dao tao: " + getNganhDaoTao();
	}

}