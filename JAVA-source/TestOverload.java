/*
	����������
	
	ͬ���ĺ���ͨ����ͬ���β������Ƶ����飬��ͽк��������ء�
*/

class A
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
	/*	error �����������ֻ�Ǻ����ķ���ֵ��һ����
		������һ�����⹹���ɺ��������أ����ұ���ʱ�ᱨ��
	public double add(int a, int b)
	{
		return a + b;
	}
	*/
	
	public int add(int a, int b, int c)
	{
		return a + b + c;
	}
	
	public double add(double a, double b, double c)
	{
		return a + b + c;
	}
}

class TestOverload
{
	public static void main(String[] args)
	{
		A a_1 = new A();
		System.out.printf("%d\n", a_1.add(1, 2));
		System.out.printf("%d\n", a_1.add(1, 2, 3));
		System.out.printf("%f\n", a_1.add(1.1, 2.2, 3.3));
	}
}

/*
	2018-03-14 16:49:33
*/