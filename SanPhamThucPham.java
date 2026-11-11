package voanhKhoi25751321;

import java.time.LocalDate;

public class SanPhamThucPham extends SanPham{
	private LocalDate ngayHetHan;
	
	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		return giaNhap + (giaNhap*0.05);
	}
	
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public SanPhamThucPham(String maSP, String tenSP, LocalDate ngaySanXuat, double giaNhap, int soLuongTonKho,
			LocalDate ngayHetHan) {
		super(maSP, tenSP, ngaySanXuat, giaNhap, soLuongTonKho);
		this.ngayHetHan = ngayHetHan;
	}

	@Override
	public String toString() {
		return super.toString() + "SanPhamThucPham [ngayHetHan=" + ngayHetHan + "]";
	}
	
	
}
