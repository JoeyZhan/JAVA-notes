/*
	Exception(�쳣) ���÷�_3
	
	��д�����쳣 �Ĵ���
*/
import java.util.*;

public class Test_Excep_3
{
	public static void main(String[] args)
	{
		int i;
		
		try
		{
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			System.out.printf("%d\n", i);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
			System.out.printf("��д����!\n");
		}
	}
}

/*
	2018-05-16 00:05:53
	
	��������ֵ��������޷�ͨ���߼��ж��������(e.g. ��if else��ص��߼��ж����)��
	��Java�ṩ���쳣������ƿ��ԺܺõĽ���������;
*/