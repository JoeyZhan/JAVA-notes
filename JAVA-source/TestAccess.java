/*
	类的访问控制符
	
	在一个类的内部，所有的成员可以互相访问，访问控制符是透明的；
	访问控制符是针对外部访问而言的。
	
	外部访问包括两种方式：
		通过 类名 访问类内部的成员；
		通过 类对象名 访问类内部成员；
		
	public(公共): 可以通过 外部访问方式 访问类内部的public成员；
	private(私有): 不可以通过 外部访问方式 访问类内部的private成员；
*/

class A
{
	public int i;	//令整型变量 i 变成 public(公共);
	protected int j;
	private int k;
	
	/*	public void m()		//令函数 m 变成 public(公共);
		{
		
		}
	*/
}

class TestAccess
{
	public static void main(String[] args)
	{
		A a_1 = new A();
		
		a_1.i = 10;		//ok, i在 class A 中为 public(公共);
		a_1.j = 20;		//ok, j在 class A 中为 protected(保护);
		//a_1.k = 30;	error, k在 class A 中为 private(私有);
	}
}

/*
	2018-03-11 16:40:52
*/