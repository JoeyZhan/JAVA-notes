/*
	Array (����) ���÷�_3
	
	�����copy;
*/

public class Test_Array_Copy
{
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] b = {-1, -2, -3, -4, -5, -6, -7, -8};
		
		System.arraycopy(a, 0, b, 1, 3);
		//������a �±��0��3 ���� ����b �±��1��3��ֵ;
		
		System.out.printf("a = ");
		for (int i=0; i<a.length; ++i)
		{
			System.out.printf("%d\t", a[i]);
		}
		
		System.out.printf("\nb = ");
		for (int i=0; i<a.length; ++i)
		{
			System.out.printf("%d\t", b[i]);
		}
	}
}