/*
	Static(静态) 的作用(3)
	
	本程序证明：Static属性和方法虽然属于 类 本身，可以通过类名的方式访问；
				但Static属性和方法很明显也属于类对象，当然也可以通过类对象访问；
*/

class A
{
	public static int i = 233;
	
	public static void show()
	{
		System.out.printf("2018-03-19 21:47:54\n");
	}
}

public class TestStatic_3
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		A.show();
		aa_1.show();
		System.out.printf("%d", aa_1.i);
	}
}

