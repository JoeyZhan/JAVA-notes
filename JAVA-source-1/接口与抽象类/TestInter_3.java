/*
	interface(接口)	的用法_3
	
*/

interface It
{
	public static final int i = 233;
	public abstract void f();
	public abstract void j();
}

abstract class It_2 implements It	//如果一个类只实现了一个接口的部分方法，则该类必须声明为抽象类，即在前面加修饰符 abstract;
{
	public void f()
	{
		System.out.printf("A类实现It接口!\n");
	}
}

class A
{
	public int a;
}

class B extends A implements It		//一个类可以在继承一个父类的同时实现一个或多个接口;
{									//但 extends 必须在 implements 之前;
	public void f()
	{
	}
	public void j()
	{
	}
}

public class TestInter_3
{
	public static void main(String[] args)
	{
		
	}
}