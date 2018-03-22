/*
	Static(静态) 的作用(5)
	
	本程序证明: 静态方法不能访问非静态成员；
		  非静态方法可以访问静态成员；
				
		  因为 静态 方法是在 类 里面的，无论有没有通过类创建对象，静态 方法/属性 都会存在；
		  而 非静态 方法需要通过类创建对象 才会存在；
*/

class A
{
	public static int i = 233;
	public int j = 666;
	
	public static void f()
	{
		System.out.printf("F静态函数构建成功！\n");
		//g();	//error  静态函数 无法访问 非静态成员；
		//j = 233666;   //error	  同上；
	}
	
	public void g()
	{
		//f();		//ok  说明 非静态函数 可以访问 静态成员；
		System.out.printf("G静态函数构建成功！\n");
		System.out.printf("%d\n", i);
	}
}

public class TestStatic_5
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		aa_1.f();
		//aa_1.g();
		
		//A.g() 	//error  g函数 是 动态函数，无法通过类名访问；
	}
}
