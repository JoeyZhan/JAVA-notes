/*
	equals 的用法_2
	
	重写equals
	
	Object 中的 equals()方法 只有在两个对象是同一块内存时，才返回true;
	
	何时需要重写 equals方法
		如果希望不同内存，但相同内容 的两个对象 equals 时返回true，则需要重写父类的 equals方法;
*/

class A
{
	public int i;
	
	public A(int i)
	{
		this.i = i;
	}
	
	public boolean equals(Object obj)	//Object obj = aa_2;
	{
		A aa_2_clone = (A)obj;		//将 父类引用 通过强制类型转换 赋给 子类引用。   强制类型转换的前提条件是，父类引用本身 指向的是 子类引用(多态);
		
		//return i == obj.i;		//error   父类无法调用子类的特有成员(多态);
		return i == aa_2_clone.i;
	}
}

public class Test_Equals_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A(233);
		A aa_2 = new A(233);
		
		System.out.println(aa_1.equals(aa_2));
	}
}

/*
	运行结果：
		true

*/