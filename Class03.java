package Java9;

public class Class03 {
	
	public static void main(String args[]) {
		Caaa obj1 = new Caaa(); //(b)21行 呼叫具空值的建構元
		Caaa obj2 = new Caaa(12); //(b)22行 呼叫具有 int i的建構元
	}
}

class Caaa{ //(c)不能把此class設成public,一個java文件中不能有兩個public class,除非命名相同 
	private int value; //(d)如果設成public的話,不會對現有的程式有影響,private如果沒有要在外面的類別中使用的話就不會受到影響
	
	public Caaa() {
		value = 10; //(a) 
		System.out.println("value="+value);
	}
	
	public Caaa(int i) {
		value = i;
		System.out.println("value="+value);
	}
}
