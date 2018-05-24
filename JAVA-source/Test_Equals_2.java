/*
	equals ���÷�_2
	
	��дequals
	
	Object �е� equals()���� ֻ��������������ͬһ���ڴ�ʱ���ŷ���true;
	
	��ʱ��Ҫ��д equals����
		���ϣ����ͬ�ڴ棬����ͬ���� ���������� equals ʱ����true������Ҫ��д����� equals����;
*/

class A
{
	public int i;
	
	public A(int i)
	{
		this.i = i;
	}
	
	public boolean equals(Object obj)	//Object obj = aa_2;
	{
		A aa_2_clone = (A)obj;		//�� �������� ͨ��ǿ������ת�� ���� �������á�   ǿ������ת����ǰ�������ǣ��������ñ��� ָ����� ��������(��̬);
		
		//return i == obj.i;		//error   �����޷�������������г�Ա(��̬);
		return i == aa_2_clone.i;
	}
}

public class Test_Equals_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A(233);
		A aa_2 = new A(233);
		
		System.out.println(aa_1.equals(aa_2));
	}
}

/*
	���н����
		true

*/