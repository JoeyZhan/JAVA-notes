/*
	为 private(私有)变量赋值
*/

/*	first means:通过构造函数来为 私有变量 赋值；
class A
{
	private int i;
	private int j;
	
	public A(int a, int b)
	{
		i = a;
		j = b;
		
		System.out.printf("%d %d", i, j);
	}
}

class TestAccess_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A(233, 666);
	}
}
*/

/*	second means:通过普通函数来为 私有变量 赋值；
class A
{
	private int i;
	private int j;
	
	void a_1(int a, int b)
	{
		i = a;
		j = b;
		
		System.out.printf("%d %d", i, j);
	}
}

class TestAccess_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		aa_1.a_1(233, 666);
	}
}
*/


























