/*
	Static(��̬) ������(2)
	
	������Static������: Static����i (11��)�������౾��
						��û�ж���������Ȼ����ֱ��ͨ�������ķ�ʽ���ʸ����ڲ��� Static���ԣ�
						Static����show (13��)ͬ��
*/

class A
{
	public static int i = 233;
	
	public static void show()
	{
		System.out.printf("2018-03-18 22:10:49\n");
	}
}

public class TestStatic_2
{
	public static void main(String[] args)
	{
		System.out.printf("%d\n", A.i);
		A.show();
	}
}

/*
	2018-03-18 22:18:12
	
	��������
	233
	2018-03-18 22:10:49
*/