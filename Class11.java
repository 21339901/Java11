package Java11;

public class Class11 {
	
	public static void main(String args[]) {
		CStu stu = new CStu("94011","fiona",90,92,85);
		stu.show();
	}
}

interface Data{
	public void showData();
}

interface Test{
	public void showScore();
	public double calcu();
}

class CStu implements Data,Test{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	
	public CStu(String a,String b,int c,int d,int e) {
		id = a;
		name = b;
		mid = c;
		finl = d;
		common = e;
	}
	
	public void showData() {
		System.out.println("id= "+id);
		System.out.println("name= "+name);
	}
	
	public void showScore() {
		System.out.println("mid= "+mid);
		System.out.println("finl= "+finl);
		System.out.println("common= "+common);
	}
	
	public double calcu() {
		return (0.3*(mid+finl)+0.4*common);
	}
	
	public void show() {
		showData();
		showScore();
		System.out.println("學期成績= "+calcu());
	}
}
