/*
	toString ���÷�_2
	
	���е��඼Ĭ���Զ��̳��� Object��;
	
	Object�� �е� toString���� Ĭ�Ϸ���(δ��д) ���� ������� �� �ö����ϣ��(�ڴ��ַ) ��ɵ�һ���ַ���;

	System.out.println(�������);
	ʵ��������Ǹö���� toString() ���������ص��ַ���;
	
	Ϊ��ʵ����Ҫ������������д�� ����Object �̳е� toString����;
*/

class Point
{
	private int i, j;
	
	public Point(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public String toString()	//��д�� ����Object �̳е� toString����;
	{
		return "[" + i + "," + j + "]";
	}
}

public class Test_toString_2
{
	public static void main(String[] args)
	{
		Point p_1 = new Point(2, 3);
		Point p_2 = new Point(6, 9);
		
		System.out.println(p_1);
		System.out.println(p_2);
	}
}

/*
	���н����
		[2,3]
		[6,9]

*/