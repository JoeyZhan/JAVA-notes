/*
	printf �� println ���÷�
	
	���һ������ʱ����println;
	����������ʱ����printf;
*/
class Dian
{
	private int x, y;
	
	public Dian(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "[" + x + "," + y + "]";
	}
}

public class Test_Printf_Println
{
	public static void main(String[] agrs)
	{
		Dian d = new Dian(3, 2);
		
		System.out.printf("%s\n", d);
		System.out.println(d);
		
		int i, j, k;
		i = 1;
		j = 2;
		k = 3;
		
		System.out.printf("%d ��ֵ + %d ��ֵ �� %d\n", i, j, k);
		System.out.println(i + "��ֵ + " + j + "��ֵ �� " + k);
		
		int m = 1234;
		System.out.printf("%d\n", m);
		System.out.println(m);
		
		System.out.printf("ʮ�������� %d ��ʮ�����Ʊ�ʾ�ǣ�%#X\n", m, m);
		//System.out.println("ʮ�������� " + m + "��ʮ�����Ʊ�ʾ�ǣ�OX" + String.toUpperCase(Integer.toHexString(m)));		//error,  toUpperCase()û�ж�ӦString���β�;	
		System.out.println("ʮ�������� " + m + " ��ʮ�����Ʊ�ʾ�ǣ�0X" + Integer.toHexString(m).toUpperCase());
	}
}

/*
	���н����
		[3,2]
		[3,2]
		1 ��ֵ + 2 ��ֵ �� 3
		1��ֵ + 2��ֵ �� 3
		1234
		1234
		ʮ�������� 1234 ��ʮ�����Ʊ�ʾ�ǣ�0X4D2
		ʮ�������� 1234 ��ʮ�����Ʊ�ʾ�ǣ�0X4D2

	ע�⣡��ע��javaϵͳ���е��βΣ�
*/




