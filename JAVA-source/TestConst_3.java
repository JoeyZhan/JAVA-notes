/*
	���б����ĳ�ʼ��
	
	���е�������������ڶ���ʱ�������ʼ����������ֵ��ϵͳ�Զ�����õ�Ĭ��ֵ��������Ĭ�ϳ�ʼ���ο�������ײ���;
*/

class A
{
	private int i;
	private boolean j;
	
	public A(int a, boolean b)
	{
		i = a;
		j = b;
		
		System.out.printf(" ���캯����ִֵ�гɹ�\n i = %d, j = %b", i, j);		//boolean���ͱ�����%b��%B�������
	}
}

class TestConst_3
{
	public static void main(String[] args)
	{
		A aa_1 = new A(666, true);
		
	//	int k;	error,�ֲ����� �������ǲ����Զ������ʼ����
	//	��javaҪ�����еľֲ�������ʹ��֮ǰ������ĳ�ʼ����
	}
}

/*
	2018-03-15 23:13:00
	
	��Ա��������					��ʼ��
	byte							0
	short                           0
	int								0
	long							0L
	
	float							0.0F
	double							0.0D
	
	char							'\u0000'(��ʾΪ��)
	boolean							False
	
	All reference type				Null
*/