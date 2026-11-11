package voanhKhoi25751321;

import java.time.LocalDate;
import java.util.List;

public class TestSanPham {
	static void inDS(List<SanPham> ds) {
		if(ds.isEmpty()) {
			System.out.println("Danh sach rong");
			return;
		}
		for(SanPham sp : ds) {
			System.out.println(sp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLySanPham ql = new QuanLySanPham();
		
		ql.themSanPham(new SanPhamDienTu("SPDT1", "CPU", LocalDate.of(2012, 10, 10), 1000000, 2, 12));
		ql.themSanPham(new SanPhamDienTu("SPDT2", "Man hinh", LocalDate.of(2013, 01, 12), 600000, 5, 12));
		ql.themSanPham(new SanPhamDienTu("SPDT3", "Chuot", LocalDate.of(2015, 12, 05), 300000, 25, 6));
		ql.themSanPham(new SanPhamThucPham("SPTP1", "Sua tuoi", LocalDate.of(2026, 11, 03), 24000, 75, LocalDate.of(2026, 12, 31)));
		ql.themSanPham(new SanPhamThucPham("SPTP2", "Trung", LocalDate.of(2026, 10, 03), 6000, 105, LocalDate.of(2026, 12, 11)));
		
		ql.themSanPham(new SanPhamDienTu("SPDT1", "RAM", LocalDate.of(2012, 10, 10), 1000000, 2, 12));
		
		System.out.println("\n--Danh sach toan bo san pham--\n");
		inDS(ql.layTatCa());
		
		System.out.println("\n--Xoa san pham co ma SPDT1--\n");
		ql.xoaSanPham("SPDT1");
		inDS(ql.layTatCa());
		
		System.out.println("\n--Sua so luong san pham co ma SPDT2 thanh STL : 20--\n");
		ql.suaSoLuongTon("SPDT2", 20);
		inDS(ql.layTatCa());
		
		
		
	}

}
