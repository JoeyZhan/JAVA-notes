/*
	Array (����) ���÷�_4
	
	�����sort;
*/
import java.util.Arrays;

public class Test_Array_Sort
{
	public static void main(String[] args)
	{
		int[] array = {12, 321, -42, 52, 13, 64, -3, 123};
		System.out.printf("����ǰ������: ");
		showArray(array);
		
		Arrays.sort(array);
		
		System.out.printf("����������: ");
		showArray(array);
	}
	
	public static void showArray(int[] p)
	{
		
		/*for(int i=0; i<p.length; ++i)
		{
			System.out.printf("%d\t", p[i]);
		}
		*/
		for(int e : p)		//���ܣ���p���ֵѭ������e���������;
			System.out.printf("%d\t", e);
		System.out.println("");
	}
}