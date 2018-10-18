/*
	final 的用法_2
	
	final的修饰范围：
		整个类
		类中的若干个属性
		类中的若干个方法
	
	final修饰 类中的若干个属性
		表示该属性 必须被 赋值，并且只能被赋一次值(注意默认值不算真正的赋值);
		并且可以被继承，但不能被再次赋值;
		
	该初始化的两种方法(一次只能选择其中一种)
		在定义成员变量的同时初始化;
		在类中所有的构造函数中初始化;
		
	注意：一个类的所有普通方法内部都不可以修改final修饰过的成员变量;
*/

class A
{
	//初始化的第一种方式：在定义成员变量的同时初始化；
	public final int i = 233;	//常变量
	
	//初始化的第二种方式：在类中所有的构造函数中初始化;
	public final int j;
	public A()
	{
	  //i = 2333;	//error	  被final修饰过的 i 只能被初始化一次;
		j = 666;
	}
}

class B extends A
{
	
}

public class TestFinal_2
{
	public static void main(String[] args)
	{
		B bb_1 = new B();
		System.out.printf("%d %d", bb_1.i, bb_1.j);
	}
}