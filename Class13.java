package Java11;

public class Class13 {
	
	public static void main(String[] args) {
			Compute cmp = new Compute();
			cmp.mul(3,5);
			cmp.show();
		}
	}
	
	interface show_ans{
		public void show();
	}
	interface Math extends show_ans{
		public void add(int a, int b);
		public void sub(int a, int b);
		public void mul(int a, int b);
		public void div(int a, int b);
	}

	class Compute implements Math{
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
		public void show() {
			System.out.println("ans="+sum);
		}
	}
