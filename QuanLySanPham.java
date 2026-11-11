package voanhKhoi25751321;

import java.util.ArrayList;
import java.util.List;


public class QuanLySanPham {
	
	List<SanPham> ds;
	public QuanLySanPham() {
		ds = new ArrayList<SanPham>();
	}
	
	public SanPham timKiem(String maSP) {
		for(SanPham sp : ds) {
			if(sp.getMaSP().equalsIgnoreCase(maSP)) return sp;
		}
		return null;
	}
	
	public boolean themSanPham(SanPham sp) {
		if(sp==null || timKiem(sp.getMaSP())!=null) return false;
		return ds.add(sp); 
	}
	
	public List<SanPham> layTatCa(){
		return new ArrayList<>(ds);
	}
	
	public boolean xoaSanPham(String maSP) {
		SanPham sp = timKiem(maSP);
		if(sp==null) return false;
		return ds.remove(sp);
	}
	
	public boolean suaSoLuongTon(String maSP, int soLuongMoi) {
		SanPham sp = timKiem(maSP);
		if(sp instanceof SanPham) {
			((SanPham) sp).setSoLuongTonKho(soLuongMoi);
			return true;
		}
		return false;
	}

	
}
	