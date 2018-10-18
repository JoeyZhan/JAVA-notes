/*
	Static(��̬) ������(4)
	
	������֤����ֻ�з�private��Static��Ա�ſ���ͨ�������ķ�ʽ���ʣ�
				
				Staticֻ�Ǳ����˸ó�Ա�����˿���ͨ���������ʵ�Ǳ������
				�� �Ƿ� ����ͨ���������ʣ�����������һ���������ó�Ա�����Ƿ�private��
*/

class A
{
	private static int i = 233;
	
	private static void show()
	{
		System.out.printf("2018-03-19 21:58:19\n");
	}
}

public class TestStatic_4
{
	public static void main(String[] args)
	{
		A.show();
		A.i = 666;
	}
}

/*
	2018-03-19 22:00:26
	
	������:
	TestStatic_4.java:19: ����: show()������A�з���private
                A.show();
                 ^
	TestStatic_4.java:20: ����: i������A�з���private
                A.i = 666;
                 ^
	2 ������
*/