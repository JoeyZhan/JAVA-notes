/*
	Super 的用法
	
	super 的作用：用于 子类 调用 父类 的 构造函数；
*/

class A
{
	public int i;
	public int j;
	
	public A()
	{
	}
	
	public A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
}

class B extends A
{
	public int k;
	
	public B()
	{
	}
	
	public B(int i, int j, int k)
	{
		super(i, j);	//super 应放在普通语句前面；而且super只能被 构造函数 调用，普通函数无法调用super；
		this.k = k;
	}
}

public class TestSuper_1
{
	public static void main(String[] args)
	{
		B bb_1 = new B(233, 666, 236);
		System.out.printf("%d %d %d\n", bb_1.i, bb_1.j, bb_1.k);
	}
}