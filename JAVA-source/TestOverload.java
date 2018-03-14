/*
	函数的重载
	
	同名的函数通过不同的形参做类似的事情，这就叫函数的重载。
*/

class A
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
	/*	error 如果两个函数只是函数的返回值不一样，
		其他都一样，这构不成函数的重载，并且编译时会报错！
	public double add(int a, int b)
	{
		return a + b;
	}
	*/
	
	public int add(int a, int b, int c)
	{
		return a + b + c;
	}
	
	public double add(double a, double b, double c)
	{
		return a + b + c;
	}
}

class TestOverload
{
	public static void main(String[] args)
	{
		A a_1 = new A();
		System.out.printf("%d\n", a_1.add(1, 2));
		System.out.printf("%d\n", a_1.add(1, 2, 3));
		System.out.printf("%f\n", a_1.add(1.1, 2.2, 3.3));
	}
}

/*
	2018-03-14 16:49:33
*/