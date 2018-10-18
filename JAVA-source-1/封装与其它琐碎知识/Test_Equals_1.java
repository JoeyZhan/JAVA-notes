/*
	equals 的用法_1
	
	所有类都从 Object类 中继承了 equals方法;
	
	equals方法 判断两个对象是否是同一个内存单元编号，
	即地址是否一样，如果相同，equals则返回true，不同，返回false;
*/

class A
{
	public int i;
	public A(int i)
	{
		this.i = i;
	}
}

public class Test_Equals_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A(1);
		A aa_2 = new A(1);
		
		System.out.println(aa_1 == aa_2);
		System.out.println(aa_1.equals(aa_2));
	}
}

/*
	运行结果：
		false
		false
*/