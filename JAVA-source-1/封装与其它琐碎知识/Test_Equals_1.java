/*
	equals ���÷�_1
	
	�����඼�� Object�� �м̳��� equals����;
	
	equals���� �ж����������Ƿ���ͬһ���ڴ浥Ԫ��ţ�
	����ַ�Ƿ�һ���������ͬ��equals�򷵻�true����ͬ������false;
*/

class A
{
	public int i;
	public A(int i)
	{
		this.i = i;
	}
}

public class Test_Equals_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A(1);
		A aa_2 = new A(1);
		
		System.out.println(aa_1 == aa_2);
		System.out.println(aa_1.equals(aa_2));
	}
}

/*
	���н����
		false
		false
*/