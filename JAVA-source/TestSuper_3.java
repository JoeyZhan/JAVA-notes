/*
	Super 的用法_3

*/

class A
{
	public A()
	{
		System.out.printf("A类\n");
	}
	
	public A(int i)
	{
	}
}

class B extends A
{
	public B()
	{
		super(233);		//如果把该语句注释掉的话， 则编译器默认的是自动隐藏调用super();
						//但如果父类没有无参的构造函数，则会报错；
						//一个子类的构造函数中只能出现一个 super(...);
		System.out.printf("B类\n");
	}
}

class C extends B
{
	public C()
	{
		//int k = 10;	//如果该语句生效，则会出错，因为会导致super()语句不是构造函数的第一条语句；
						//super()语句 必须在其他 普通语句 前面；
		
		super();	//每个子类构造方法的第一条语句，都是隐含的调用super(), 如果父类没有无参的构造函数，那么在编译的时候就会报错；
					//super();  此语句可以写，也可以不写，不写的话，系统会自动调用隐藏的super();
					//如果写出来的话，编译器则会要求该语句前面不能加任何语句，也就是说该语句必须保证是第一条语句；
					//super() 也可以改为 super(2);   但前提是父类必须有带一个参数的构造函数，否则也会报错；
					//如果把36行改为 super(2), 则编译时就会报错；
					
		System.out.printf("C类\n");
	}
}

public class TestSuper_3
{
	public static void main(String[] args)
	{
		C cc_1 = new C();
	}
}

