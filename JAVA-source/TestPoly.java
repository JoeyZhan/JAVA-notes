/*
	多态的用法
*/

class A
{
	public void f()
	{
		System.out.printf("A类！\n");
	}
}

class B extends A
{
	public void f()
	{
		System.out.printf("B类！\n");
	}
}

public class TestPoly
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		B bb_1 = new B();
		
		aa_1.f();
		bb_1.f();
		
		aa_1 = bb_1;	//把bb_1当作aa_1来看待，因为子类可以当作父类看待，所以本语句ok;
	  //bb_1 = aa_1;	//把aa_1当作bb_1来看待，但又因为父类不能当作子类看待，所以本语句error;
		aa_1.f();
	}
}

/*
	2018-03-30 23:21:39
	
	运行结果：
		A类！
		B类!
		B类！
		
	------------
	体会：
		可以理解为 猫可以当作动物来看待，但动物不能当作猫来看待！
		
	2018-03-31 22:29:11
	疑问：
	aa_1里面存储的到底是不是一个地址呢？
	已解决：是的！是A对象的地址！(与c语言中的malloc相似！)
	
	aa_1 = bb_1，是否可以理解成把bb_1里面的存储的地址赋给aa_1呢？
	已解决：可以！
*/


/*
	TestPoly_1.java
	
	class A
	{
		public void f()
		{
			System.out.printf("A类！\n");
		}
	}
	
	class B extends A
	{
		public void f()
		{
			System.out.printf("B类！\n");
		}
	}
	
	public class TestPoly_1
	{
		public static void main(String[] args)
		{
			A aa_1 = new B();	//ok	子类对象地址 可以 直接 赋给父类，但父类不可以 直接 赋给子类;
			aa_1.f();
			
			aa_1 = new A();		//ok
			aa_1.f();
		}
	}

*/
