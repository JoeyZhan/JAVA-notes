/*
	多态的用法_3
	
	父类可以通过 将子类地址赋给父类 的方式 来 访问 子类从父类继承过来的对象；
	但父类无法通过 这种方式 来访问 子类对象所特有的成员；
	
*/

class A
{
	public void f()
	{
		System.out.printf("A类!\n");
	}
}

class B extends A
{
	public void f()
	{
		System.out.printf("B类!\n");
	}
	
	public void g()
	{
		System.out.printf("B类g对象!\n");
	}
}

public class TestPoly_3
{
	public static void main(String[] args)
	{
		A aa_1 = new B();	//等价于A aa; aa = new B();
		B bb_1 = new B();
		
		aa_1.f();
		//aa_1.g();		//error  多态 无法通过 父类引用 访问 子类对象的 特有成员；
		bb_1.g();
	}
}