/*
	抽象类(abstract)的用法_2
	
*/

abstract class A
{
	public abstract void f();
}

class B extends A
{
	public void f()
	{
		System.out.printf("B类继承于A抽象类！\n");
	}
}

public class TestAbs_2
{
	public static void main(String[] args)
	{
	  //A aa_1 = new A();	//error	 无法 new 出一个 抽象类对象;
		A aa_1;				//ok	 但可以	定义一个 抽象类引用;
		aa_1 = new B();		//ok	 将子类对象的地址赋给抽象类的引用;
		aa_1.f()			//ok	 抽象类实现多态;
	}
}

/*
	2018-04-05 13:37:36
	
	总结：
		抽象类无法创建对象，即 无法new 出一个 抽象类对象；
		但可以定义一个 抽象类对象；
		
		抽象类可以通过 将子类对象的地址赋给抽象类的应用(25行) 的方式 来 实现多态；
*/