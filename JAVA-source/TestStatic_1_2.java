/*
	Static(静态) 实例_2
	
	本程序的作用：令类 只能 创建一个对象；
*/

class A
{
	public int i = 233;
	private static A aa = new A();	  //在同类中生成同类对象，语法无误，但这种用法很少见；
	
	private A()
	{
	}
	
	public static A getA()
	{
		return aa;
	}
}

public class TestStatic_1_2
{
	public static void main(String[] args)
	{
		A aa1 = A.getA();
		A aa2 = A.getA();
		
		aa1.i = 666;
		System.out.printf("%d\n", aa2.i);
		
		if (aa1 == aa2)
			System.out.printf("aa1 与 aa2 相等\n");
		else
			System.out.printf("aa1 与 aa2 不想等\n");
		
//		A aa1 = new A();  // error 如果A类的构造方法是private的，则new A()就会报错!
//		A aa2 = new A();  // 同上
	}
}

/*
	2018-03-24 17:43:01
	
	运行结果：
		666
		aa1 与 aa2 相等
	
	体会：有些混乱，如果限制只能生成一个 对象，
	     那为何不直接将 类 中的 属性 都变为Static(静态),
             这样无论生成多少对象，所使用的都是同一个对象。
*/








