/*
	整型变量转String的四种方法
*/

class Test
{
	public static void main(String[] args)
	{
		int i = 123;
		String str;
		
		str = i + "";	//第一种方法;
		str = Integer.toString(i);	//第二种方法;
		str = String.valueOf(i);	//第三种方法;
		//第四种方法;
		Integer it = new Integer(i);
		str = it.toString();
	}
}