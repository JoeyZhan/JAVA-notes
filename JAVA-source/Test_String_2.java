/*
	String �� ���÷��� ���÷�_2
	
*/

public class Test_String_2
{
	public static void main(String[] args)
	{
		String s1 = "sun java";
		String s2 = "Sun Java";
		
		System.out.println(s1.charAt(1));	//u
		System.out.println(s2.length());	//8
		System.out.println(s1.indexOf("java"));		//4
		System.out.println(s1.indexOf("Java"));		//-1	��������-1;
		System.out.println(s1.equals(s2));			//false
		System.out.println(s1.equalsIgnoreCase(s2));	//true
		
		String s = "java ����õı�����ԣ�";
		String sc = s.replace("java", "c");
		System.out.println(sc);		//c ����õı�����ԣ�
	}
}