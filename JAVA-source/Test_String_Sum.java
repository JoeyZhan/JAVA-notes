/*
	String 的 常用方法 的用法_总结
	
	1.
		public boolean equals(Object obj)
		判断两个对象内容是否相等，返回true或false;
		(Test_String_Equals.java)
		
	2.
		public static String valueOf(...)
			public static String valueOf(double d)
			public static String valueOf(int i)
				...
		将基本类型数据转换为字符串;
		(Test_String_1.java)
		
	3.
		public static int parseInt(String s)
		将 字符串 转换为 整型;
		(Test_String_1.java)
		
	4.
		public char charAt(int index)
		返回字符串中的第index个字符;
		
	5.
		public int length()
		返回字符串的长度;
		
	6.
		public int indexOf(String str)
		返回字符串中出现str的第一个位置;
		
	7.
		public int indexOf(String str, int fromIndex)
		返回字符串中从 fromIndex 开始出现str的第一个位置;
		
	8.
		public boolean equalsIgnoreCase(String another)
		比较字符串与 another 是否一样(忽略大小写);
		
	9.
		public String replace(char oldChar, char newChar)
		在字符串中用 newChar 字符替换 oldChar字符;
		
	(4-9)(Test_String_2.java)
	
	10.
		public boolean startsWith(String prefix)
		判断字符串是否以 prefix 字符串开头;
		
	11.
		public boolean endsWith(String suffix)
		判断字符串是否以 prefix 字符串结尾;
		
	12.
		public String toUpperCase()
		返回一个字符串为该字符串的大写形式;
		
	13.
		public String toLowerCase()
		返回一个字符串为该字符串的小写形式;
		
	14.
		public String substring(int beginIndex)
		返回该字符串从 beginIndex 开始到结尾的字符串;
		
	15.
		public String substring(int beginIndex, int endIndex)
		返回该字符串从 beginIndex 开始到 endIndex 结尾的字符串;
		
	(10-15)(Test_String_3.java)
*/