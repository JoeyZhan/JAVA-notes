/*
	Exception(�쳣) ���÷�_2
	
	try{}catch{} ��丳ֵ������
*/

public class Test_Excep_2
{
	public static void main(String[] args)
	{
		int i;
		//int i = 0;	//���⸳��ֵ;
		try
		{
			i = 666;
			System.out.printf("i = %d\n", i);
		}
		catch(Exception e)
		{
			
		}
		
		System.out.printf("i = %d\n", i);	//error  java��������Ϊ  i ���� ���� ��δ��ʼ������Ϊ14�д������ try����У�
											//		 java��������Ϊ����try����еĶ�˵�� �п��ܳ����������� ����ʱ �Զ����� 14�д��룬���� ����ʱ ��˳��ִ�У�
											//		 ���������11��;
	}
}


/*
	���н����
		Test_Excep_2.java:22: ����: ������δ��ʼ������i
                System.out.printf("i = %d", i);
                                            ^
		1 ������

		
	���ʣ�
		java��������Ϊ����try����еĶ�˵�� �п��ܳ������� ����ʱ �Զ����� 14�д��룬���� ����ʱ ��˳��ִ�У�
		���Ƿ���˵����try{}catch{} �е� ��� ֻ���� ����ʱ ִ�У�����
*/