/*
	Global variables(ȫ�ֱ���) ���������
	
*/

class Gvar
{
	int i;
	//i = 233;	//error	  ȫ�ֱ���ֻ�� �ڶ���ʱ ���� �ڷ�����(13��) ���и�ֵ��ʼ��;
	
	public void f()
	{
		i = 666;
		
		System.out.printf("%d\n", i);
	}
}

public class Global_Variables
{
	public static void main(String[] args)
	{
		
	}
}