/*
	Static(静态) 的作用(2)
	
	本程序Static的作用: Static属性i (11行)是属于类本身；
			  即没有对象，我们仍然可以直接通过类名的方式访问该类内部的 Static属性；
			  Static方法show (13行)同理；
*/

class A
{
	public static int i = 233;
	
	public static void show()
	{
		System.out.printf("2018-03-18 22:10:49\n");
	}
}

public class TestStatic_2
{
	public static void main(String[] args)
	{
		System.out.printf("%d\n", A.i);
		A.show();
	}
}

/*
	2018-03-18 22:18:12
	
	输出结果：
	233
	2018-03-18 22:10:49
*/
