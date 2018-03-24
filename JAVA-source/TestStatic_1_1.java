/*
	Static(��̬) ʵ��_1
	
	����������ã�����������A�����ĸ������ز������
*/

class A
{
	private int i;
	private static int cnt = 0;		//���ڴ洢�����������ı���
	
	public A()
	{
		++cnt;
	}
	
	public A(int i)
	{
		this.i = i;
		++cnt;
	}
	
	public static int getcnt()
	{
		return cnt;		
	}
}

public class TestStatic_1_1
{
	public static void main(String[] args)
	{
		System.out.printf("��ǰA�ഴ���Ķ���Ϊ: %d\n", A.getcnt());
		A aa_1 = new A();
		System.out.printf("��ǰA�ഴ���Ķ���Ϊ: %d\n", A.getcnt());
		A aa_2 = new A();
		System.out.printf("��ǰA�ഴ���Ķ���Ϊ: %d\n", A.getcnt());
	}
}


/*
	2018-03-24 14:09:15
	
	���н����
		��ǰA�ഴ���Ķ���Ϊ: 0
		��ǰA�ഴ���Ķ���Ϊ: 1
		��ǰA�ഴ���Ķ���Ϊ: 2
		
*/