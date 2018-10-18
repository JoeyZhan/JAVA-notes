/*
	Array (数组) 的用法_4
	
	数组的sort;
*/
import java.util.Arrays;

public class Test_Array_Sort
{
	public static void main(String[] args)
	{
		int[] array = {12, 321, -42, 52, 13, 64, -3, 123};
		System.out.printf("排序前的数组: ");
		showArray(array);
		
		Arrays.sort(array);
		
		System.out.printf("排序后的数组: ");
		showArray(array);
	}
	
	public static void showArray(int[] p)
	{
		
		/*for(int i=0; i<p.length; ++i)
		{
			System.out.printf("%d\t", p[i]);
		}
		*/
		for(int e : p)		//功能：将p里的值循环赋给e，将其输出;
			System.out.printf("%d\t", e);
		System.out.println("");
	}
}