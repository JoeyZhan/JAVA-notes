/*
	Static(静态) 实例_1
	
	本程序的作用：将所创建的A类对象的个数返回并输出！
*/

class A
{
	private int i;
	private static int cnt = 0;		//用于存储本类对象个数的变量
	
	public A()
	{
		++cnt;
	}
	
	public A(int i)
	{
		this.i = i;
		++cnt;
	}
	
	public static int getcnt()
	{
		return cnt;		
	}
}

public class TestStatic_1_1
{
	public static void main(String[] args)
	{
		System.out.printf("当前A类创建的对象为: %d\n", A.getcnt());
		A aa_1 = new A();
		System.out.printf("当前A类创建的对象为: %d\n", A.getcnt());
		A aa_2 = new A();
		System.out.printf("当前A类创建的对象为: %d\n", A.getcnt());
	}
}


/*
	2018-03-24 14:09:15
	
	运行结果：
		当前A类创建的对象为: 0
		当前A类创建的对象为: 1
		当前A类创建的对象为: 2
		
*/