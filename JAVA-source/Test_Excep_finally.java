/*
	Exception(异常)
	
	finally的用法
	无论 try 所指定的程序块中是否 抛出异常，也无论 catch语句 的异常类型是否与抛弃的异常的类型一致，
	finally 中的代码一定会得到执行;
	
	finally 语句为异常处理提供一个统一的出口，使得在 控制流程 转到 程序的其他部分之前，
	能够对程序的状态作统一的管理;
	
	通常在 finally 语句中可以进行资源的清除工作，如关闭打开的文件，删除临时文件等;
*/

import java.io.*;
import java.util.*;

class A
{
	int m;
	
	public int divide(int a, int b)
	{
		m = a/b;
		return m;
	}
}

public class Test_Excep_finally
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		try
		{
			aa_1.divide(6, 0);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.printf("catch除零异常！\n\n");
		}
		finally	//无论 try有没有抛出异常，或又有没有 catch到异常，finally里的代码都执行;
		{
			try
			{
				aa_1.divide(6, 0);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.printf("catch finally除零错误！\n");
			}
		}
	}
}

/*
	运行结果:
		java.lang.ArithmeticException: / by zero
        at A.divide(Test_Excep_finally.java:16)
        at Test_Excep_finally.main(Test_Excep_finally.java:29)
		catch除零异常！

		java.lang.ArithmeticException: / by zero
        at A.divide(Test_Excep_finally.java:16)
        at Test_Excep_finally.main(Test_Excep_finally.java:44)
		catch finally除零错误！

*/