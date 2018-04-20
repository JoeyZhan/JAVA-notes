/*
	Package(包) 的用法_3
	
	不同包类的相互访问_1
*/

//A.java文件;
/*
Package OneTest.A;

class A
{
	public void show()
	{
		System.out.printf("A类！\n");
	}
}

*/

//B.java文件
/*
Package TwoTest.B;

class B
{
	public static void main(String[] args)
	{
		OneTest.A aa_1 = new OneTest.A();
		aa_1.show();
	}
}

*/

/*
	当不同类在不同包中，互相调用，需要使用一个类的全名(29行)，即文件目录+类名;

	单独编译时必须先编译 A.java, 后编译B.java， 否则会出错；
	
	建议两个一起编译：javac -d . A.java B.java;	(文件名不分前后)
*/