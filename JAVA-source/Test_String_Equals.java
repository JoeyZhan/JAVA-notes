/*
	String 的 equals 用法
	
	String 默认重写了 equals;
	
	String 类的 equals 方法 用来判断两个对象的内容是否相等;
	Object 类的 equals 方法 用来判断两个对象是否是同一个对象(即地址是否一样);

	注意 == 与 equals 的区别;
	
	在 Java 中双引号括起来的字符串也被当作 String对象;
*/

public class Test_String_Equals
{
	public static void main(String[] args)
	{
		String aa_1 = new String("NBA");
		String aa_2 = new String("NBA");
		
		System.out.println(aa_1.equals(aa_2));	//true
		System.out.println(aa_1 == aa_2);		//false
		
		String bb_1 = "NCAA";
		String bb_2 = "NCAA";
		
		System.out.println(bb_1.equals(bb_2));	//true
		System.out.println(bb_1 == bb_2);		//true
		
		System.out.println("NSAA".equals("NSAA"));	//true
	}
}