/*
	String �� ���÷��� ���÷�_1

	�ַ��� �� ���� ���໥ת��;
*/

public class Test_String_1
{
	public static void main(String[] args)
	{
		int i = 123;
		String str = "456";
		
		//str = i;
		//i = str;	//error 
		
		str = String.valueOf(i);	//�� ���� ת���� �ַ���;
		System.out.printf("str = %s\n", str);
		
		i = Integer.parseInt(str);	//�� �ַ��� ת���� ����;
		System.out.printf("i = %d\n", i);
	}
}