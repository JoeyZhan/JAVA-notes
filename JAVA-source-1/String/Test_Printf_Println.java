/*
	printf 与 println 的用法
	
	输出一个变量时，用println;
	输出多个变量时，用printf;
*/
class Dian
{
	private int x, y;
	
	public Dian(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "[" + x + "," + y + "]";
	}
}

public class Test_Printf_Println
{
	public static void main(String[] agrs)
	{
		Dian d = new Dian(3, 2);
		
		System.out.printf("%s\n", d);
		System.out.println(d);
		
		int i, j, k;
		i = 1;
		j = 2;
		k = 3;
		
		System.out.printf("%d 的值 + %d 的值 是 %d\n", i, j, k);
		System.out.println(i + "的值 + " + j + "的值 是 " + k);
		
		int m = 1234;
		System.out.printf("%d\n", m);
		System.out.println(m);
		
		System.out.printf("十进制数字 %d 用十六进制表示是：%#X\n", m, m);
		//System.out.println("十进制数字 " + m + "用十六进制表示是：OX" + String.toUpperCase(Integer.toHexString(m)));		//error,  toUpperCase()没有对应String的形参;	
		System.out.println("十进制数字 " + m + " 用十六进制表示是：0X" + Integer.toHexString(m).toUpperCase());
	}
}

/*
	运行结果：
		[3,2]
		[3,2]
		1 的值 + 2 的值 是 3
		1的值 + 2的值 是 3
		1234
		1234
		十进制数字 1234 用十六进制表示是：0X4D2
		十进制数字 1234 用十六进制表示是：0X4D2

	注意！请注意java系统类中的形参！
*/




