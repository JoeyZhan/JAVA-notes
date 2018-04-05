/*
	final 的用法_3
	
	final的修饰范围：
		整个类
		类中的若干个属性
		类中的若干个方法
		
	final修饰 类中的若干个方法
		表示该方法可以被子类继承，但不可以被子类重写;
*/

class A
{
	public final void f()	//使方法可被继承无法被重写;
	{
		System.out.printf("A类f方法!\n");
	}
}

class B extends A
{
	/*error	  父类A中的f方法被 final修饰，无法被重写;
	public void f()	
	{
		System.out.printf("B类重写f方法!\n");
	}
	*/
}

public class TestFinal_3
{
	public static void main(String[] args)
	{
		
	}
}


