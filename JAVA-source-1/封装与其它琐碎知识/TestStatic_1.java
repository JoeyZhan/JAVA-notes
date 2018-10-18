/*
	Static(静态) 的作用
	
	本程序 Static使 动态属性 变成 静态属性，即令 A类 的 多个对象公用一个 static属性 i(9行);
*/

class A
{
	public static int i = 666;
	
	public void show()
	{
		System.out.printf("%d\n", i);
	}
}

public class TestStatic_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		A aa_2 = new A();
		
		aa_1.i = 233;		
		aa_2.show();	//aa_1的 i 的值 变成了 233，aa_2的 i 的值也会变成 233，因为 A类的属性 i (9行)为 static类型；
						//此处的 aa_1 与 aa_2 公用同一个 static属性 i(9行);
						//aa_1的属性i发生变化，aa_2也同样会发生相应的变化;
	}
}

/*
	2018-03-17 23:46:51
	
	输出结果：
	233
	
*/
