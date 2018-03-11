class A
{
	int i;
	int j;
}

class TestMemo
{
	public static void main(String[] args)
	{
		A aa = new A;	//(A *)malloc(sizeof(A));
		/*
			new A(); 在堆中动态分配一块区域，被当作了A对象；
			aa 本身的内存是在栈中分配的；
			堆中内存的地址赋给了 aa；
			aa 指向堆中的内存;
		*/
		
		aa.i = 10;	
		aa.j = 20;	//aa.j 代表：aa这个静态指针变量所指向的动态内存中 A 对象的 i 这个成员；
		
		System.out.printf("%d %d", aa.i, aa.j);
	}
}

/*
	此篇代码用于测试动态内存的分配；
	heap-堆，stack-栈；
	
	这里的内容与 C 中的指针和动态内存分配(malloc)相似！
*/