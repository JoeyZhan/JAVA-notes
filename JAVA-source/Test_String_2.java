/*
	String 的 常用方法 的用法_2
	
*/

public class Test_String_2
{
	public static void main(String[] args)
	{
		String s1 = "sun java";
		String s2 = "Sun Java";
		
		System.out.println(s1.charAt(1));	//u
		System.out.println(s2.length());	//8
		System.out.println(s1.indexOf("java"));		//4
		System.out.println(s1.indexOf("Java"));		//-1	不存在则-1;
		System.out.println(s1.equals(s2));			//false
		System.out.println(s1.equalsIgnoreCase(s2));	//true
		
		String s = "java 是最好的编程语言！";
		String sc = s.replace("java", "c");
		System.out.println(sc);		//c 是最好的编程语言！
	}
}