package Java11;

public class Class09 {
	
	public static void main(String args[]) {
		Compute cmp = new Compute();
		cmp.mul(3,5);
		cmp.show();
		cmp.fac(4);
		cmp.show();
		
	}
}
interface AdvanceMath{
	public void mod(int a, int b);
	public void fac(int a);
	public void pow(int a, int b);
}
interface Math{
	public void show();
	public void add(int a, int b);
	public void sub(int a, int b);
	public void mul(int a, int b);
	public void div(int a, int b);
}

class Compute implements Math,AdvanceMath{
	int sum;
	public void add(int a, int b) {
		sum = a + b;
	}
	
	public void sub(int a, int b) {
		sum = a - b;
	}
	
	public void mul(int a, int b) {
		sum = a * b;
	}
	
	public void div(int a, int b) {
		sum = a / b;
	}
	
	public void mod(int a, int b) {
		sum = a % b;
	}
	
	public void fac(int a) {
		for(int i = a-1; i > 1; i--) {
			a *= i; 
		}
		sum = a;
	}
	
	public void pow(int a, int b) {
		sum = 1;
		for(int i = 0;i<b;i++) {
			sum *= a;
		}
	}
	
	public void show() {
		System.out.println("ans="+sum);
	}
}
