/*
	StringBuffer ���÷�_1
	
*/

public class Test_StringBuffer_1
{
	public static void main(String[] args)
	{
		StringBuffer strB = new StringBuffer();
		
		strB.append("Lebron");		//Ϊ�ö�������ַ�����;
		strB.append("23");
		
		System.out.println(strB);	//Lebron23
		
		strB.insert(6, "--");		//ָ��λ�ò����ַ�����;		
		
		System.out.println(strB);	//Lebron--23
		
		strB.delete(3, 7);			//ɾ��ָ�����ַ�;	((n+1) �� n);
		
		System.out.println(strB);	//Leb-23
		
		strB.reverse();				//���ַ���������;
		
		System.out.println(strB);	//32-beL
		
		//StringBuffer str = strB.toString();	//error    String�޷�ת��ΪStringBuffer;
		String str = strB.toString();
		
		System.out.println(str);	//32-beL
		
	}
}