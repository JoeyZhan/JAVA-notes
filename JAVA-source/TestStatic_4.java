/*
	Static(静态) 的作用(4)
	
	本程序证明：只有非private的Static成员才可以通过类名的方式访问；
	
		  Static只是表明了该成员具有了可以通过类名访问的潜在特征
		  但 是否 可以通过类名访问，还必须满足一个条件：该成员必须是非private；
*/

class A
{
	private static int i = 233;
	
	private static void show()
	{
		System.out.printf("2018-03-19 21:58:19\n");
	}
}

public class TestStatic_4
{
	public static void main(String[] args)
	{
		A.show();
		A.i = 666;
	}
}

/*
	2018-03-19 22:00:26
	
	编译结果:
	TestStatic_4.java:19: 错误: show()可以在A中访问private
                A.show();
                 ^
	TestStatic_4.java:20: 错误: i可以在A中访问private
                A.i = 666;
                 ^
	2 个错误
*/
