package QLNV;

public class Congnhanlamthem extends NhanVien {

	private int giolamviec, sosp, choose;
	private String vaiTro;
	private static double luongquanly = 15000000;
	private static double luongmotsp = 10000;
	private static double luongmotgio = 20000;
	private static double luonglamthem = luongmotgio * 1.5;

	public Congnhanlamthem() {
		super();
	}

	public Congnhanlamthem(int giolamviec, int sosp) {
		super();
		this.giolamviec = giolamviec;
		this.sosp = sosp;
	}

	public int getGiolamviec() {
		return giolamviec;
	}

	public void setGiolamviec(int giolamviec) {
		this.giolamviec = giolamviec;
	}

	public int getSosp() {
		return sosp;
	}

	public void setSosp(int sosp) {
		this.sosp = sosp;
	}

	public String getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}

	public void nhapThongTin(String maNV) {
		super.nhapThongTin(maNV);
		System.out.println("Chọn vai trò: ");
		System.out.println("1. Nhân viên theo giờ");
		System.out.println("2. Quản lý");
		System.out.println("3. Nhân viên theo sản phẩm");
		choose = sc.nextInt();
		switch (choose) {
		case 1:
			vaiTro = "Nhân viên theo giờ";
			System.out.print("Nhập số giờ làm việc: ");
			giolamviec = sc.nextInt();
			break;
		case 2:
			vaiTro = "Quản lý";
			break;
		case 3:
			vaiTro = "Nhân viên theo sản phẩm";
			System.out.print("Nhập số sản phẩm: ");
			sosp = sc.nextInt();
			break;
		}
	}

	@Override
	public void tinhLuong() {
		if (vaiTro.equals("Quản lý")) {
			luong = luongquanly;
		}
		if (vaiTro.equals("Nhân viên theo sản phẩm")) {
			luong = luongmotsp * sosp;
		}
		if (vaiTro.equals("Nhân viên theo giờ")) {
			if (this.giolamviec <= 40) {
				luong = giolamviec * luongmotgio;
			} else {
				luong = luongmotgio * 40 + (giolamviec - 40) * luongmotgio;
			}
		}
	}
	
	@Override
    public String toString() {
		if (vaiTro.equals("Nhân viên theo sản phẩm")) {
			return super.toString()+"\t" + vaiTro+ "\t";
		}
		if (vaiTro.equals("Nhân viên theo giờ")) {
			return super.toString()+"\t" + vaiTro+ "\t";
		}
		else 
		return  super.toString()+"\t" + vaiTro+ "\t";
    }

}
