/*
	String �� equals �÷�
	
	String Ĭ����д�� equals;
	
	String ��� equals ���� �����ж���������������Ƿ����;
	Object ��� equals ���� �����ж����������Ƿ���ͬһ������(����ַ�Ƿ�һ��);

	ע�� == �� equals ������;
	
	�� Java ��˫�������������ַ���Ҳ������ String����;
*/

public class Test_String_Equals
{
	public static void main(String[] args)
	{
		String aa_1 = new String("NBA");
		String aa_2 = new String("NBA");
		
		System.out.println(aa_1.equals(aa_2));	//true
		System.out.println(aa_1 == aa_2);		//false
		
		String bb_1 = "NCAA";
		String bb_2 = "NCAA";
		
		System.out.println(bb_1.equals(bb_2));	//true
		System.out.println(bb_1 == bb_2);		//true
		
		System.out.println("NSAA".equals("NSAA"));	//true
	}
}