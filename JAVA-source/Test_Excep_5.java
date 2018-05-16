/*
	Exception(异常) 的用法_5
	
	处理异常的第二种方式: throws;
	必须捕获并处理的异常-IOException
*/

import java.io.*;

class A
{
	public void f() throws IOException	//throws 表示本方法 对 抛出的异常 不进行处理，交给调用本方法 的 方法处理(即27行的主方法);
	{
		throw new IOException();	//throw 抛出异常;
		//IOException - 继承自 Exception 但又不是 RuntimeException 的异常，属于必须捕获并处理的异常;
	}
	
	public void g()
	{
		throw new ArithmeticException();
		//ArithmeticException - 继承自 RuntimeException 的异常，属于可处理也可不处理的异常;
	}
}

public class Test_Excep_5
{
	public static void main(String[] args) //throws IOException	//处理异常的第二种方法：throws, 本方法不进行处理，交给Java虚拟机处理;
	{
		A aa_1 = new A();
		
		try	//处理异常的第一种方法;
		{
			aa_1.f();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

/*
	运行结果:
		java.io.IOException
        at A.f(Test_Excep_5.java:14)
        at Test_Excep_5.main(Test_Excep_5.java:33)

*/