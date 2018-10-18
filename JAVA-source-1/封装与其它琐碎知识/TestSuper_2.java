/*
	Super 的用法_2
	
*/

class A
{
	public int i;
	
	A(int i)
	{
		this.i = i;
	}
}

class B extends A
{
	public B()
	{
		super(2);  //如果将本语句注释掉，则会出错；
				   //因为 派生类构造函数 中如果不写super(...)；
				   //则默认的会添加super();
	}
}

public class TestSuper_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A(233);
		B bb_1 = new B();
	}
}