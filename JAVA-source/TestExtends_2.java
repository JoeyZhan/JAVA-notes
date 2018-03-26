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

