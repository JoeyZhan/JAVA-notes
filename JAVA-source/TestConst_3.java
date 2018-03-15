/*
	类中变量的初始化
	
	类中的数据类型如果在定义时不将其初始化，则它的值是系统自动分配好的默认值！（变量默认初始化参考表在最底部）;
*/

class A
{
	private int i;
	private boolean j;
	
	public A(int a, boolean b)
	{
		i = a;
		j = b;
		
		System.out.printf(" 构造函数赋值执行成功\n i = %d, j = %b", i, j);		//boolean类型变量用%b或%B来输出；
	}
}

class TestConst_3
{
	public static void main(String[] args)
	{
		A aa_1 = new A(666, true);
		
	//	int k;	error,局部变量 编译器是不会自动将其初始化，
	//	且java要求所有的局部变量在使用之前都必须的初始化；
	}
}

/*
	2018-03-15 23:13:00
	
	成员变量类型					初始化
	byte							0
	short                           0
	int								0
	long							0L
	
	float							0.0F
	double							0.0D
	
	char							'\u0000'(表示为空)
	boolean							False
	
	All reference type				Null
*/