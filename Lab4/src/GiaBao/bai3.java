package GiaBao;
import java.util.Scanner;
public class bai3 {
	String tenSP;
	 double donGia;
	 double giamGia;
		
	public bai3(String tenSP,double donGia, double giamGia ) {
		this.tenSP=tenSP;
		this.giamGia=giamGia;
		this.donGia=donGia;
	}
	public bai3(String tenSp, double donGia) {
       this(tenSp, donGia, 0); 
   }
	private  double getThueNhapKhau() {
		return 0.1*donGia;
		
	}
	public void Xuat() {
		System.out.println("Tên sản phẩm: "+tenSP);
		System.out.println("Đơn giá: "+ donGia);
		System.out.println("Giảm giá: "+giamGia);
		System.out.println("Thuế nhập khẩu: "+getThueNhapKhau());
	}
	public void Nhap() {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		tenSP = scanner.nextLine();
		System.out.println("Nhập đơn giá: ");
		donGia = scanner.nextDouble();
		System.out.println("Nhập giảm giá: ");
		giamGia = scanner.nextDouble();
		
	}
	public static void main(String[] args) {
		bai3 sp1 = new bai3("iphone ", 20000000);
		System.out.println("Thông tin sản phẩm 1:");
		sp1.Xuat();
		bai3 sp2 = new bai3("Samsung", 17000000,15000000);
		System.out.println("Thông tin sản phẩm 2:");
		sp2.Xuat();
	}
}
