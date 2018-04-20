/*
	Package(包) 的用法_3
	
	不同包类的相互访问_2
*/


//B.java文件

package TwoTest.B;
//import OneTest.A.A;	//使用import语句导入一个包中特定的类；
import OneTest.A.*;		//使用import语句导入一个包中所有的类；

class B
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.show();
	}
}



//A.java文件;
/*
package OneTest.A;

class A
{
	public void show()
	{
		System.out.printf("A类！\n");
	}
}

*/
