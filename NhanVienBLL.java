package demoOvarLoading_hoa;

import java.awt.CardLayout;
import java.util.Scanner;

public class NhanVienBLL {
	String color;
	int price;

	void accelerate() {
		System.out.println("Color: "+color+" Price: "+price);
	}
	public static void main(String[] args) {
		NhanVienBLL nV = new NhanVienBLL();
		nV.color ="tim";
		nV.price= 120000;
		Bike bike = new Bike();
		bike.color ="tim";
		bike.price= 120000;
		bike.soVanh= 2;
		car c = new car();
		c.color ="tim";
		c.price= 120000;
		c.thue = 16000;
		Bus bus = new Bus();
		bus.color ="tim";
		bus.price= 120000;
		bus.sochongoi= 15;
		nV.accelerate();
		System.out.println("Bike");
		bike.accelerate();
		bus.accelerate();
	}
}
 class Bike extends NhanVienBLL{
	 int soVanh;

	 @Override
		void accelerate() {
			System.out.println("Color: "+color+" Price: "+price+"Thue: "+soVanh);
		}
	 
	 
 }
 class car extends NhanVienBLL{
	 
	 int thue;
	 @Override
		void accelerate() {
			System.out.println("Color: "+color+" Price: "+price+"Thue: "+thue);
		}
 }
 class Bus extends NhanVienBLL{ 	
	 int sochongoi;
	@Override
	void accelerate() {
		System.out.println("Color: "+color+" Price: "+price+"So Cho Ngoi: "+sochongoi);}

	}
 	
 