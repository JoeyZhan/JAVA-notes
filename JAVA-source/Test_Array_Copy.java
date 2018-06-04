/*
	Array (数组) 的用法_3
	
	数组的copy;
*/

public class Test_Array_Copy
{
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] b = {-1, -2, -3, -4, -5, -6, -7, -8};
		
		System.arraycopy(a, 0, b, 1, 3);
		//将数组a 下标从0到3 覆盖 数组b 下标从1到3的值;
		
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