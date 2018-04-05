/*
	final 的用法_1
	
	final的修饰范围：
		整个类
		类中的若干个属性
		类中的若干个方法
	
	final修饰 整个类
		表示该类不能被继承
	    	如果认为一个类已经很完美且不需要定义子类来继承它时，可以使用它；
	语法：public final class A{};	(public 和 final 可以互换);
*/

final class A
{
	
}

/*error	会报错，因为 当final修饰整个类时，无法被继承；
class B extends A
{
	
}
*/

public class TestFinal_1
{
	public static void main(String[] args)
	{
		
	}
}
