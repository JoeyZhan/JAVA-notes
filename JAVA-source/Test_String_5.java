/*
	String �� ���÷��� ���÷�_5
	
	ͳ��String������ ��Сд��ĸ������ĸ�����Գ��ֵĸ���;	
*/

public class Test_String_5
{
	public static void main(String[] args)
	{
		String str = "W1a2k3a4n5d6a Forever! ";
		
		int cntU = 0;	//��д����
		int cntL = 0;	//Сд����
		int cntOther = 0;
		int i;
		
		//����һ��
		for (i = 0; i<str.length(); ++i)
		{
			char ch = str.charAt(i);
			
			if (Character.isUpperCase(ch))
				++cntU;
			else if (Character.isLowerCase(ch))
				++cntL;
			else
				++cntOther;
		}

		
		//����һ��
		/*
		for (i=0; i<str.length(); ++i)
		{
			char ch = str.charAt(i);
			
			if (ch >= 'A' && ch <='Z')
				++cntU;
			else if (ch >= 'a' && ch <= 'z')
				++cntL;
			else
				++cntOther;		
		}
		*/
		
		System.out.printf("��д��ĸ������%d\n", cntU);
		System.out.printf("Сд��ĸ������%d\n", cntL);
		System.out.printf("����ĸ������%d\n", cntOther);

	}
}