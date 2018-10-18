/*
	Exception(异常) 的用法_1
	
	算数异常-除零错误
*/

class A
{
	public int numb;
	
	public int divide(int a, int b)
	{
		numb = a / b;
		return numb;
	}
}

public class Test_Excep_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		try
		{
			int i = aa_1.divide(6, 0);		
		}
		catch(ArithmeticException e)	//e用来接收23行抛出的异常对象;
		{
			e.printStackTrace();	//可以简单理解为输出该异常的具体信息;
			System.out.printf("\n异常，除零错误！\n\n");
		}
		
		System.out.printf("Test_Excep_1\n");
	}
}


/*
	运行结果：
		java.lang.ArithmeticException: / by zero
        at A.divide(Test_Excep_1.java:13)
        at Test_Excep_1.main(Test_Excep_1.java:26)

		异常，除零错误！

		Test_Excep_1

*/