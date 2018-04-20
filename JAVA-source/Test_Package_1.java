/*
	Package(包) 的用法_1
	
*/
package Test.Package;	//把该文件中所有的类放入Test文件夹下的Package下的main文件夹;
//并且该文件中所有的类 真正的名 将是 包名和类名的组合；

//例如 Tset_Package_1 名字将变成 Test.Package.Test_Package_1;

//编译时，应输入：javac -d . Tset_Package_1.java;	
//执行时，应输入：java Test.Package.Test_Package_1;

/*
	错误做法：
	(一)
	C:\Users\Source\Desktop>java Test_Package_1
	错误: 找不到或无法加载主类 Test_Package_1
	
	(二)
	C:\Users\Source\Desktop>cd Test/Package

	C:\Users\Source\Desktop\Test\Package>java Test_Package_1
	错误: 找不到或无法加载主类 Test_Package_1

*/

class A
{
	public void show()
	{
		System.out.printf("A类！\n");
	}
}

public class Test_Package_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.show();
	}
}