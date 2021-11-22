package quan.ly.canbo;

import java.util.Scanner;

public class CanBo {
	private String tenCanBo;
	private int tuoi;
	private String diaChi;
	private String gioiTinh;

	Scanner scanner = new Scanner(System.in);
	
	public CanBo() {
		super();
	}

	public CanBo(String tenCanBo, int tuoi, String diaChi, String gioiTinh) {
		this.tenCanBo = tenCanBo;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
	}

	public String getTenCanBo() {return tenCanBo;}

	public void setTenCanBo(String tenCanBo) {this.tenCanBo = tenCanBo;}

	public int getTuoi() {return tuoi;}

	public void setTuoi(int tuoi) {this.tuoi = tuoi;}

	public String getDiaChi() {return diaChi;}

	public void setDiaChi(String diaChi) {this.diaChi = diaChi;}

	public String getGioiTinh() {return gioiTinh;}

	public void setGioiTinh(String gioiTinh) {this.gioiTinh = gioiTinh;}

	public void nhapThongTin() {}
	
	/* Show information */
	@Override
	public String toString() {
		return "Ten can bo: " + this.tenCanBo + "| tuoi: " + this.tuoi + "| Dia chi: " + this.diaChi + "| Gioi tinh:"+ gioiTinh;
	}
}