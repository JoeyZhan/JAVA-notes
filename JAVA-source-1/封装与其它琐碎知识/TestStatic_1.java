/*
	Static(��̬) ������
	
	������ Staticʹ ��̬���� ��� ��̬���ԣ����� A�� �� ���������һ�� static���� i(9��);
*/

class A
{
	public static int i = 666;
	
	public void show()
	{
		System.out.printf("%d\n", i);
	}
}

public class TestStatic_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		A aa_2 = new A();
		
		aa_1.i = 233;		
		aa_2.show();	//aa_1�� i ��ֵ ����� 233��aa_2�� i ��ֵҲ���� 233����Ϊ A������� i (9��)Ϊ static���ͣ�
						//�˴��� aa_1 �� aa_2 ����ͬһ�� static���� i(9��);
						//aa_1������i�����仯��aa_2Ҳͬ���ᷢ����Ӧ�ı仯;
	}
}

/*
	2018-03-17 23:46:51
	
	��������
	233
	
*/
