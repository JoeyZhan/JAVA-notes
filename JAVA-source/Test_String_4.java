/*
	String 的 常用方法 的用法_4
	
*/

public class Test_String_4
{
	public static void main(String[] args)
	{
		int iNumber = 1234567;
		String sNmber = String.valueOf(iNumber);
		
		System.out.println("iNumber 是" + sNmber.length() + "位数。");
		
		String s1 = "Mary,F,1976";
		String sPlit[] = s1.split(",");
		
		int i;
		
		for (i=0; i<sPlit.length; ++i)
		{
			System.out.println(sPlit[i]);
		}
	}
}

/*
	运行结果：
		iNumber 是7位数。
		Mary
		F
		1976

*/