/*
	Static(��̬) ������(3)
	
	������֤����Static���Ժͷ�����Ȼ���� �� ��������ͨ�������ķ�ʽ���ʣ�
				��Static���Ժͷ���������Ҳ��������󣬵�ȻҲ����ͨ���������ʣ�
*/

class A
{
	public static int i = 233;
	
	public static void show()
	{
		System.out.printf("2018-03-19 21:47:54\n");
	}
}

public class TestStatic_3
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		A.show();
		aa_1.show();
		System.out.printf("%d", aa_1.i);
	}
}

