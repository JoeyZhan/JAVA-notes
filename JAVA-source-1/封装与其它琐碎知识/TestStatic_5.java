/*
	Static(��̬) ������(5)
	
	������֤��: ��̬�������ܷ��ʷǾ�̬��Ա��
				�Ǿ�̬�������Է��ʾ�̬��Ա��
				
				��Ϊ ��̬ �������� �� ����ģ�������û��ͨ���ഴ�����󣬾�̬ ����/���� ������ڣ�
				�� �Ǿ�̬ ������Ҫͨ���ഴ������ �Ż���ڣ�
*/

class A
{
	public static int i = 233;
	public int j = 666;
	
	public static void f()
	{
		System.out.printf("F��̬���������ɹ���\n");
		//g();	//error  ��̬���� �޷����� �Ǿ�̬��Ա��
		//j = 233666;   //error	  ͬ�ϣ�
	}
	
	public void g()
	{
		//f();		//ok  ˵�� �Ǿ�̬���� ���Է��� ��̬��Ա��
		System.out.printf("G��̬���������ɹ���\n");
		System.out.printf("%d\n", i);
	}
}

public class TestStatic_5
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		aa_1.f();
		//aa_1.g();
		
		//A.g() 	//error g�����Ƕ�̬�������޷�ͨ���������ʣ�
	}
}