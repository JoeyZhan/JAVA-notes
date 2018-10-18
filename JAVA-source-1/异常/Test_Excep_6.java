/*
	Exception(�쳣) ���÷�_6(���ص�)
	
	�Զ����쳣(���ص�)
*/

class divisorIsZeroException extends Exception	//�Զ����쳣�������õ������ص�;
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
			throw new divisorIsZeroException("�������\n");
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
	���н����
		divisorIsZeroException: ���㲻��Ϊ�㣡

        at A.divide(Test_Excep_6.java:22)
        at Test_Excep_6.main(Test_Excep_6.java:38)
*/