/*
	interface(接口) 的用法_4
	
*/

interface It
{
	public static final int i = 233;
	public abstract void f();
}

class A implements It
{
	public void f()
	{
		System.out.printf("A类实现It接口！\n");
	}
}

public class TestInter_4
{
	public static void main(String[] args)
	{
		//It it_1 = new It();	//error	  接口是抽象的，无法实体化;
		//但可以定义一个 接口引用类型的变量 并将其指向 实现接口的对象，达到多态的目的！
		It it_1 = new A();
		it_1.f();
	}
}