/*
	String �� ���÷��� ���÷�_4
	
*/

public class Test_String_4
{
	public static void main(String[] args)
	{
		int iNumber = 1234567;
		String sNmber = String.valueOf(iNumber);
		
		System.out.println("iNumber ��" + sNmber.length() + "λ����");
		
		String s1 = "Mary,F,1976";
		String sPlit[] = s1.split(",");
		
		int i;
		
		for (i=0; i<sPlit.length; ++i)
		{
			System.out.println(sPlit[i]);
		}
	}
}

/*
	���н����
		iNumber ��7λ����
		Mary
		F
		1976

*/