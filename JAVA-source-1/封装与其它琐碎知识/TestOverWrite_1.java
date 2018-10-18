/*
	父类方法的重写_1
	
	1.方法重写指在子类中重新定义父类中已有的方法；
	
	2.如果 子类 对继承自 父类 的方法不满意，就应该重写父类的方法；
	
	3.重写方法 必须和 被重写方法 具有相同的 方法名称、参数列表 和 返回值类型；
	
	4.子类中不允许出现与父类同名同参但不同返回值的方法，如果出现了，编译时会报错；
	
	5.重写方法时，不能使用比父类中被覆盖的方法更严格的访问权限；
*/

class A
{
	public void f()
	{
		System.out.printf("A类\n");
	}
}

class B extends A
{
	//这里如果把public改成protected(以及更严格的访问权限)时，就会报错；
	//因为重写方法时，不能使用比父类中被重写的方法更严格的访问权限；
	public void f()		//此处的方法名称、参数列表、返回值类型必须与17行的 被重写的父类方法 一致，不然会报错；
	{
		//super.f();	//调用从父类继承过来的f方法；
		System.out.printf("B类\n");
	}
}

public class TestOverWrite_1
{
	public static void main(String[] args)
	{
		B bb_1 = new B();
		bb_1.f;
	}
}

/*
	2018-03-28 16:52:52
	
	重写父类方法不常用；
*/
