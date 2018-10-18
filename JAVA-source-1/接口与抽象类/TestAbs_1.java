/*
	抽象类(abstract)的用法_1
	
*/

abstract class A  //凡是 含有抽象方法 的类都必须声明为 抽象类;
{
	public abstract void f();
	//凡是没有 方法体 的方法必须使用关键字 abstract 修饰为抽象方法;
}

abstract class AA
{
	public void f()	//ok  一个 抽象类 中可以不包括任何 抽象方法，尽管比较少见;
	{
	}
}

public class TestAbs_1
{
	public static void main(String[] args)
	{
	}
}

/*
	2018-04-05 12:07:26
	
	总结：抽象类不一定有抽象方法，但有抽象方法的一定是抽象类；

*/