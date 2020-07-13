package QLNV;

import java.util.ArrayList;
import java.util.Scanner;



public class main {
	static int sonv;
	static NhanVien nVien;
	static ArrayList<NhanVien> listnVien = new ArrayList<NhanVien>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			menu();
		} while (true);
	}

	private static void menu() {
		System.out.println("CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN");
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Thêm thông tin nhân viên");
		System.out.println("2. Xuất danh sách nhân viên");
		System.out.println("3. Cập nhật thông tin nhân viên");
		System.out.println("4. Xóa nhân thông tin nhân viên");
		System.out.println("5. Tìm kiếm nhân viên");
		System.out.println("6. Sắp xếp nhân viên theo lương");
		System.out.println("7. Kết thúc");
		System.out.println("+---------------------------------------------------+");
		System.out.println("Chọn chức năng:");
		int menu = scanner.nextInt();
		scanner.nextLine();
		switch (menu) {
		case 1:
			Nhapnhanvien();
			break;
		case 2:
			Xuat();
			break;
		case 3:
			CapNhat();
			break;
		case 4:
			Xoa();
			break;
		case 5:
			TimKiem();
			break;
		case 6:
			Sapxep();
			break;
		case 7:
			System.exit(0);
			break;
		}
	}
	
	private static void Nhapnhanvien() {
		System.out.print("Nhập số nhân viên: ");
		sonv = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < sonv; i++) {
			System.out.println("Nhập nhân viên" + (i + 1) + ": ");
			nVien = new Congnhanlamthem();
			System.out.println("Nhập mã nhân viên:");
			String maNV = scanner.nextLine();
			nVien.nhapThongTin(maNV);
			listnVien.add(nVien);
		}
	}

	private static void Xuat() {
		System.out.println("THÔNG TIN NHÂN VIÊN");
		System.out.println("Mã NV\tHọ Tên\tEmail\tGiới Tính\tĐịa Chỉ\tLương\t\tVai Trò");
        for (NhanVien nv : listnVien) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
		
	}

	private static void CapNhat() {
		System.out.println("Nhập mã nhân viên cần cập nhật: ");
		String maNV = scanner.nextLine();
		int index = -1;
		for (int i = 0; i < listnVien.size(); i++) {
			if (listnVien.get(i).getMaNV().equalsIgnoreCase(maNV)) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("Nhân viên không tồn tại!");
		}
		else {	
			NhanVien nv = listnVien.get(index);
			nv.nhapThongTin(maNV);
			listnVien.set(index, nv);
			System.out.println("Cập nhật thành công");
			Xuat();
		}
		
	}

	private static void Xoa() {
		System.out.println("Nhập mã nhân viên cần xóa: ");
		String maNV = scanner.nextLine();
		int index = -1;
		for (int i = 0; i < listnVien.size(); i++) {
			if (listnVien.get(i).getMaNV().equalsIgnoreCase(maNV)) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("Nhân viên không tồn tại!");
		}
		else {	
//			System.out.println("Nhập lại mã nhân viên muốn xóa!");
//			String confirmMaNV = scanner.nextLine();
//			if (confirmMaNV.equalsIgnoreCase(maNV)) {
				listnVien.remove(index);
				System.out.println("Xóa thành công");
				Xuat();
//			}
//			else {
//				menu();
//			}
		}
		
	}

	private static void TimKiem() {
		System.out.println("Nhập mã nhân viên cần tìm: ");
		String maNV = scanner.nextLine();
		int index = -1;
		for (int i = 0; i < listnVien.size(); i++) {
			if (listnVien.get(i).getMaNV().equalsIgnoreCase(maNV)) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("Nhân viên không tồn tại!");
		} else {
			System.out.println("Tìm kiếm thành công!");
			System.out.println("Mã NV\tHọ Tên\t\tGiới Tính\tĐịa Chỉ\tLương\t\tVai Trò\t\tChi Tiết");
			System.out.println(listnVien.get(index).toString());			
		}
		
	}

	private static void Sapxep() {
		// TODO Auto-generated method stub
		
	}

	
}
