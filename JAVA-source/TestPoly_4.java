/*
	多态的用法_4
		实例：用一个函数实现调用A  B  C 类对象 f方法的函数 
*/

class A
{
	public void f()
	{
		System.out.printf("A类！\n");
	}
}

class B extends A
{
	public void f()
	{
		System.out.printf("B类！\n");
	}
}

class C extends B
{
	public void f()
	{
		System.out.printf("C类！\n");
	}
}

public class TestPoly_4
{
	//m函数可以实现 调用 整个A类族 所有对象f方法的功能；
	public static void m(A aa)
	{
		aa.f();
	}
	
	public static void main(String[] args)
	{
		A aa_1 = new A();
		B bb_1 = new B();
		C cc_1 = new C();
		
		m(aa_1);
		m(bb_1);
		m(cc_1);
	}
}