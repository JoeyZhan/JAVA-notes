/*
	Exception(�쳣) ���÷�_4
	
	�����쳣
*/

//Test_Excep_4_1.java  ��ָ���쳣
class A
{
	public int i;
}

public class Test_Excep_4_1
{
	public static void main(String[] args)
	{
		A aa_1 = null;
		System.out.println(aa_1.i);
	}
}

/*
	���н����
		Exception in thread "main" java.lang.NullPointerException
        at Test_Excep_4.main(Test_Excep_4.java:18)
*/

//Test_Excep_4_2.java  �±�Խ���쳣
public class Test_Excep_4_2
{
	public static void main(String[] args)
	{
		int i;
		String NBA[] = {"Jordan", "Kobe", "Lebron"};
		
		for(i=0; i<5; ++i)
		{
			System.out.printf("%s", NBA[i]);
		}
	}
}

/*
	���н����
		JordanKobeLebronException in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Test_Excep_4.main(Test_Excep_4.java:38)
*/
