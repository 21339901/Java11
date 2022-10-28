package hibiki;

public class Main {
	
	public static void main(String[] args) {
			CCircle cir = new CCircle(8,6,2);
			cir.showData();
		}
	}
	
interface iVolume{
	public void showData();
	public double vol();
}

abstract class CSphere implements iVolume{ //實作後仍然屬於抽象直到CCircle繼承後才實作
	final double PI = 3.14;
	protected int x;
	protected int y;
	int radius;
	public double vol() {
		return (4.0/3.0*PI*Math.pow(radius, 3));
	}
	public void showData() {
		System.out.println("球心:("+x+","+y+")");
		System.out.println("半徑:"+radius);
		System.out.println("球體積:"+ vol());
	}
}

class CCircle extends CSphere{
	
	public CCircle(int a,int b,int c) {
		x = a;
		y = b;
		radius = c;
	}
	
}
