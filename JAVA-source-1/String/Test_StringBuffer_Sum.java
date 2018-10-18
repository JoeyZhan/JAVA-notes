/*
	StringBuffer 的用法_总结
	
	
	为什么要使用 StringBuffer 类？ StringBuffer 类的由来.
	
		1.String 类对象一旦创建就不可更改;
		
		2.如果经常需要对字符串内容进行修改，则使用 StringBuffer;
		
		3.如果经常对字符串内容进行修改而使用 String 的话，就会导致既 耗内存空间 又耗时间;
		
		4.因此 String 类中没有修改字符串的方法，而 StringBuffer类中却有大量修改字符串的方法;
		
	
	StringBuffer 类的构造函数
		
		public StringBuffer()
			创建一个空的，无字符的 StringBuffer 对象;
		
		public StringBuffer(int capacity)
			创建一个不带字符，但具有指定初始容量的字符串缓冲区;
			
		public StringBuffer(String str)
			创建一个 StringBuffer 对象，包括与str对象想同的字符序列;
			
	StringBuffer 类的常用方法
		
		重载方法 public StringBuffer append(...) 
		
			可以为该 StringBuffer 对象添加字符序列,	返回添加后的该 StringBuffer 对象引用;
		例如:
			public StringBuffer append(String str)
			public StringBuffer append(StringBuffer sbuf)
			public StringBuffer append(char[] str)
			public StringBuffer append(char[] str, int offset, int len)
			public StringBuffer append(double d)
			public StringBuffer append(Object obj)
			......
			
		重载方法 public StringBuffer insert(...) 
		
			可以为该 StringBuffer 对象在指定位置插入字符序列，返回修改后的该 StringBuffer 对象引用;
		例如:
			public StringBuffer insert(int offset, String str)
			public StringBuffer insert(int offset, double d)
			......
			
		重载方法 public StringBuffer delete(int start, int end)
			
			可以删除从 start 开始到 end-1 为止的一段字符序列，返回修改后的该 StringBuffer 对象引用;
	
		重载方法 public StringBuffer reverse()

			用于将字符序列逆序，返回修改后的该 StringBuffer 对象引用;
		
		
		与String 类含义类似的方法:
			public int indexOf(String str)
			public int indexOf(String str, int fromIndex)
			public String substring(int start)
			public String substring(int start, int end)
			public int length()
			

*/