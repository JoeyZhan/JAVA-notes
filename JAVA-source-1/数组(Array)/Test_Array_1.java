/*
	Array (����) ���÷�_1
	
	������������;
*/

public class Test_Array_1
{
	public static void main(String[] args)
	{
		//����һ
		int[] a;
		a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		showArray(a);
		System.out.println("************************");
		
		//������
		int[] b = new int[] {1, 2, 3};
		showArray(b);
		System.out.println("************************");
		//int[3] b = new int[] {1, 2, 3};	//error
		//int[] b = new int[3] {1, 2, 3};   //error
		//int[3] b = new int[3] {1, 2, 3};	//error
		
		//������
		int[] c = {1, 2, 3};
		showArray(c);
		System.out.println("************************");
		//int[3] d = {1, 2, 3};		//error;
	}
	
	public static void showArray(int[] a)
	{
		int i;
		for(i=0; i<a.length; ++i)
		{
			System.out.println(a[i]);
		}
	}
}

/*
	���⣺
		�Ƿ���԰�int[] a;  ���Ϊint * a;	?
*/