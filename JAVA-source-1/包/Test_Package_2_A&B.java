/*
	Package(包) 的用法_2
	
	同包不同类的相互访问;
*/

//A.java文件;
/*
Package Test;

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
Package Test;

class B
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.show();
	}
}

*/

/*
	当 A.java文件(7) 与 B.java文件(21) 属于一个包(文件夹)时 彼此可以互相访问;
	只要是 非私有的成员 都可以被同包的另一个类访问;
*/