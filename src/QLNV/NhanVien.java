package QLNV;

import java.util.Scanner;

public abstract class NhanVien {

	private String maNV;
	private String hoTen;
	private String email;
	private boolean gioiTinh;
	private String diaChi;
	protected double luong;

	Scanner sc = new Scanner(System.in);

	public NhanVien() {
		super();
	}

	public NhanVien(String maNV, String hoTen, String email, boolean gioiTinh, String diaChi) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.email = email;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double getLuong() {
		return luong;
	}

	public void nhapThongTin(String maNV) {
		this.maNV = maNV;
		System.out.println("Nhập họ tên: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhập email: ");
        this.email = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        this.gioiTinh = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.diaChi = sc.nextLine();
    }
	
	public abstract void tinhLuong();

	@Override
	public String toString() {
		return maNV + "\t" + hoTen +"\t"+ email + "\t" + gioiTinh + "\t\t" + diaChi + "\t" + luong + "VND";
	}
	
	
	

}
