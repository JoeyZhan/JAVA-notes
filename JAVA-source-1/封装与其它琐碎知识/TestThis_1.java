/*
	this指针的使用_1
	
	this是一个 系统隐含的指针 被自动附加在 非静态 的成员函数参数列表中；
*/

class A
{
	private int i;
	
	public A(int j)
	{
		i = j;
	}
	
	//这里的 show 方法(函数) 只分配了一个空间，无论定义了多少 A类的对象，所定义的对象都只能使用这同一个 show方法；
	public void show()	
	{
		System.out.printf("i = %d", i);		//这里的 i 是 第9行 的类属性 i;
	}
	/*
	用c语言的写法来理解：
	void show(A * this)
	{
		printf("i = %d\n", (*this).i);
	}
	*/
}

public class TestThis_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A(233);
		A aa_2 = new A(666);	//这里定义的 对象 ，在内存里分别分配了不同的内存空间；
		
		aa_1.show();			//但这里 show方法(函数) 在内存里只分配了一个空间，也就是说 aa_1与aa_2 使用的是同一个 show方法(函数)；
		aa_2.show();
		/*
		用c语言的写法来理解：
		aa_1.show(aa_1);
		aa_2.show(aa_2);	
		*/
	}
}

/*
	2018-03-16 13:39:26
	
	静态函数内部 没有 this指针;
*/

/*
	2018-03-16 13:43:22
	
	TestThis_1.2.java
-------------------------
	class A
	{
		private int i;
		
		public A(int j)
		{
			i = j;
		}
		
		public void show()                                   //	aa_1 和 aa_2 在内存中分别有各自的 数据成员i，
		{                                                    //	但是aa_1 和 aa_2 公用show()方法，
			System.out.printf("i = %d", i);                  //	show方法如何知道输出的 i 应该是哪个对象中的 i 呢？
		}                                                    
	}                                                        //	实际上每个非static方法中都隐含着这一个 this指针，
															 //	指向当前正在调用该方法的对象；
	public class TestThis_1.2()
	{
		public static void main(String[] args)
		{
			A aa_1 = new A(233);
			A aa_2 = new A(666);
			
			aa_1.show();
			aa_2.show();
		}
	}
*/