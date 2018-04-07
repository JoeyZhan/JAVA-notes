/*
	Interface(接口) 的用法_1
	
*/

interface It
{
	public static final int i = 233;
	//接口中定义的属性必须是 public static final;
	public abstract void f();
	//接口中定义的方法必须是 public abstract;	因此接口中的方法不允许有方法体;
	
	//但这些修饰符在接口中可以省略，因为接口中定义的属性和方法必须是这种类型的;
	//int i = 233	//ok
	//void f();	//ok
}

class B implements It	//implements(实现)
{
	public void f()
	{
	  //i = 666;	//error	  接口中定义的属性的值在实现类中不能被更改, 因为它被final修饰过;
		System.out.printf("%d\n", i);
	}
}

public class TestInter_1
{
	public static void main(String[] args)
	{
		It aa_1 = new B();
		aa_1.f();
	}
}
