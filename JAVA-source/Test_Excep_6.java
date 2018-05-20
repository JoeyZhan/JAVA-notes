/*
	Exception(异常) 的用法_6(非重点)
	
	自定义异常(非重点)
*/

class divisorIsZeroException extends Exception	//自定义异常，很少用到，非重点;
{
	public divisorIsZeroException(String name)
	{
		super(name);
	}
}

class A
{
	public int divide(int a, int b) throws divisorIsZeroException
	{
		int m = 0;
		
		if (0 == b)
			throw new divisorIsZeroException("除零错误！\n");
		else
			m = a/b;
		
		return m;
	}
}

public class Test_Excep_6
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		try
		{
			aa_1.divide(6, 0);
		}
		catch (divisorIsZeroException e)
		{
			e.printStackTrace();
		}
	}
}

/*
	运行结果：
		divisorIsZeroException: 除零不能为零！

        at A.divide(Test_Excep_6.java:22)
        at Test_Excep_6.main(Test_Excep_6.java:38)
*/