/*
	类的属性与对象
	
	本程序证明了：一个类的属性也可以是一个类对象；
*/

class B
{
}

class A
{
	public int i = 233;
	public B bb_1 = new B();	//bb_1是个对象，同时它也是 A 的属性；
}

public class TestStatic_Class
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
	}
}