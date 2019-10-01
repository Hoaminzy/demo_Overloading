package demoOvarLoading_hoa;

import java.util.Scanner;


public class TinhLuongNV_OverLoading {
	
         static int Luong;
		static int thuong;
		static	int phat;
		static int soGio;
		static  double heSo;
		private static Scanner sc;
		private int luongCB;
		private int luongThuong;
		private int luongPhat;
		private double luongFull;
		void nhap() {
			sc = new Scanner(System.in);
			System.out.println("Nhap Luong: ");
			Luong = sc.nextInt();
			System.out.println("Thuong: ");
			thuong = sc .nextInt();
			System.out.println("Phat:" );
			phat = sc.nextInt();
			System.out.println("So gio:" );
			soGio = sc.nextInt();
			System.out.println("He So: " );
			heSo = sc.nextDouble();
			
		}
		



		public void hien() {
			System.out.println("Luong=" + Luong + ", thuong=" + thuong + ", phat=" + phat + ", soGio="
					+ soGio + ", heSo=" + heSo );
			
		}

     int TinhLuong(int Luong) {
    	 luongCB = Luong *soGio;
    	return luongCB; 
     }
     int TinhLuong(int Luong, int thuong) {
    	 luongThuong = Luong+thuong;
    	 return luongThuong;
     }
     int TinhLuong(int Luong, int thuong, int phat) {
    	 luongPhat = TinhLuong(Luong)+thuong-phat;
    	 return luongPhat;
     }
     double TinhLuong(int Luong, int thuong, int phat, Double heSo) {
    	 luongFull = (TinhLuong(Luong)+thuong-phat)*heSo;
		return luongFull;
    	 
    	 
     }
public static void main(String[] agrs) {
	TinhLuongNV_OverLoading luong = new TinhLuongNV_OverLoading();
	luong.nhap();
	luong.hien();
	System.out.println("Luong CB:"+luong.TinhLuong(Luong));
	System.out.println("Luong thuong: "+luong.TinhLuong(Luong, thuong));
	System.out.println("Luong phat: "+luong.TinhLuong(Luong, thuong, phat));
	System.out.println("Luong full: "+luong.TinhLuong(Luong, thuong, phat, heSo));
	
}





}
