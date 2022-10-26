package Java11;

public class Class12 {
	
	public static void main(String args[]) {
		CStu stu = new CStu("Judy",58,91);
		stu.show();
	}
}

interface Data{
	public void best();
	public void failed();
}

interface Test{
	public void showData();
	public double average();
}
class CStu implements Test{
	protected String name;
	protected int math;
	protected int english;
	
	public CStu(String a,int b, int c) {
		name = a;
		math = b;
		english = c;
	}
	
	public void best() {
		if (math>english) {
			System.out.println("Judy的數學比英文好");	
		}
		else {
			System.out.println("Judy的英文比數學好");
		}
	}
	
	public void failed() {
		if (math<60 && english>60) {
			System.out.println("Judy的數學當掉了");
		}
		else if (math>60 && english<60){
			System.out.println("Judy的英文當掉了");
		}
		else {
			System.out.println("Judy的數學和數學都當掉了");
		}
	}
	
	public double average() {
		return (math+english)/2.0;
	}
	
	public void showData() {
		System.out.println("姓名:"+name);
		System.out.println("數學成績:"+math);
		System.out.println("英文成績:"+english);
		System.out.println("平均成績:"+average());
	}

	public void show() {
		showData();
		best();
		failed();
	}
}
