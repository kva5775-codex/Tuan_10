package voanhKhoi25751321;

import java.time.LocalDate;

public class SanPhamDienTu extends SanPham{
	private int thoiGianBaoHanh;
	
	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		return giaNhap + (giaNhap*0.1) + (thoiGianBaoHanh * 50000);
	}
	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}


	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	
	public SanPhamDienTu(String maSP, String tenSP, LocalDate ngaySanXuat, double giaNhap, int soLuongTonKho,
			int thoiGianBaoHanh) {
		super(maSP, tenSP, ngaySanXuat, giaNhap, soLuongTonKho);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	@Override
	public String toString() {
		return super.toString() + "SanPhamDienTu [thoiGianBaoHanh=" + thoiGianBaoHanh + "]";
	}
}
