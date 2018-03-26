/*
	Exdents(继承) 的用法_2
	
	本程序证明了：
		1. 子类 内部可以访问 父类 非私有的成员，
		   私有成员 无法被 子类方法 访问；
		   
		2. 通过子类对象名只能访问从父类继承过来的非私有成员；
		
	总结：
		私有 不能被继承；
		准确来说是 私有 实际上已经被继承过来，只不过 逻辑上程序员不能去访问它
		因此继承必须 慎重，否则会浪费内存；
*/

class A
{
	public int i;
	protected int j;
	private int k;
	
	public void a()
	{
	}
	
	protected void b()
	{
	}
	
	private void c()
	{
	}
}

class B extends A
{
	private void d()
	{
		i = 233;
		j = 666;
		//k = 236;	//error		(private)私有属性不能被继承;
		
		a();
		b();
		//c();	//error		(private)私有方法不能被继承;
	}
	
	public void e()
	{
	}
}

public class TestExtends_2
{
	public static void main(String[] args)
	{
		B bb_1 = new B();
		
		bb_1.i = 2333;
		bb_1.j = 6666;
		
		bb_1.a();
		bb_1.b();
		
		//bb_1.c;	//error		
		//bb_1.d;	//error		
	}
}

/*
	2018-03-26 23:09:52
	
			public		protected	   default		private
	同包同类	 	√		 √		   √		  	√
	
	访问同包	  	√		 √		   √
	不同类
	
	同包不同类	       √		√		  √		   
	继承
	
	不同包继承	       √		√
	
	访问不同包
	无任何关系	       √
	的类
*/

/*
	Java 只支持 单继承，不允许多重继承。
	
	单继承：一个类只能有一个父类
	多继承：一个类可以有多个父类
	
	Java 可以有 多层继承，即一个类可以继承某一个类的子类，
	如 类B 继承了 类A，类C 又可以继承 类B，那么类C也间接继承了 类A。

	子类可以继承父类所有的成员变量和成员方法，但子类永远无法继承父类的构造方法。
	在子类的构造方法中可使用 语句 super(参数列表) 调用父类的构造方法。
*/
