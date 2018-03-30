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
*/