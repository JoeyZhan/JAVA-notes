/*
	final ���÷�_3
	
	final�����η�Χ��
		������
		���е����ɸ�����
		���е����ɸ�����
		
	final���� ���е����ɸ�����
		��ʾ�÷������Ա�����̳У��������Ա�������д;
*/

class A
{
	public final void f()	//ʹ�����ɱ��̳��޷�����д;
	{
		System.out.printf("A��f����!\n");
	}
}

class B extends A
{
	/*error	  ����A�е�f������ final���Σ��޷�����д;
	public void f()	
	{
		System.out.printf("B����дf����!\n");
	}
	*/
}

public class TestFinal_3
{
	public static void main(String[] args)
	{
		
	}
}


