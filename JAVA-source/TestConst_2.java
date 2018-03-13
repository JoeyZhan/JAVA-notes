/* 
	多个构造函数可能带来的冲突
*/

class A
{
	private int i;
	//如果将9-11行代码注释调，则程序就会报错；
	public A()
	{
	}//11
	
	public A(int j)
	{
		i = j;
	}
}

class TestConst_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		A aa_2 = new A(1);
	}
}

/*
	2018-03-13 14:24:05
	
	一旦编程者为类定义了构造方法，系统就不再提供默认的构造方法了；
	
	当一个对象被创建时，会对其中各种类型的成员变量自动进行初始化赋值。
	
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