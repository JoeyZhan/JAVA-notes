/*
	四大基本抽象流介绍 及 常用方法
	
		InputStream和outputStream读写数据的单位是一个 字节;
		
		Reader 和 Writer 读写数据的单位是一个 字符;
		
		在Java中一个字符占两个字节
		
						字节流			字符流
		输入流:		InputStream			Reader
		输出流:		OutputStream		Writer
		
		InputStream、OutputStream、Reader、Writer这四个类都是 抽象类;
		凡是以 Stream 结尾的都是字节流;
		
		
		
	InputStream 流中常用的方法
		public int read() throws IOException
			读取一个字节并以整数形式返回
			
			如果读取到输入流的末尾则返回-1
			
		public int read(byte[] b) throws IOException
			从 输入流 中读取一定数量的字节，并将其储存在 缓存区数组 b 中，以整型返回实际读取的字节数;
			
			如果b的长度为O，则不读取任何字节并返回 0，如果因为流位于文件末尾而没有可用的字节，则返回 -1;
			
			例子：
				FileInputStream fis = new FileInputStream("d:\\Share\\errorlog.txt");
				len = fis.read(buf);
					从 fis流 所关联的 d:\\Share\\errorlog.txt 文件中读取数据，并将读取出来的数据写入 buf数组 中，
				返回值是实际写入 buf数组 的字节个数，如果读取到文件的结尾，则返回 -1;
				
		
		public int read(byte[] b, int off, int len) throws IOException
			从输入流中最多读取 len 个字节的数据并存入 byte 数组中;
			
			b表示读取的数据要存入的数组的名字;
			
			off表示第一个读出的数据要存入的位置，是下标;
			
			len表示最多能读取的字节数;
			
			将从输水流所关联到的设备中读取的第一个字节存储在元索 b[off] 中，下一个字节存储在 b[off+1] 中，依次类推，读取的字节数最多等子len;
			
			尝试读取 len 个字节，但读取的字节也可能小于该值。以整数形式返回实际读取的字节数;
			
			如果读到了文件的末尾，则返回-1;
	

		Void close() throws IOException
			关闭此输入流并释放与该流关联的所有系统资源
			
		long skip(long n) throws IOException
			跳过和丢弃此输入流中数据的n个字节。
			(这个用的很少)

			
			
	OutputStream 流中常用的方法
		void write(int b) throws IOException
			向输出流中写入一个字节数据，该字节数据为参数b的低8位
		
		void write(byte[] b) throws IOException
			将一个字节类型的数组中的数据写入输出流
		
		void write(byte[] b, int off, int len) throws IOException
			将一个字节类型的数组中的从指定位置(off) 开始的 len个字节写入到输出流
		
		void close() throws IOException
			关闭流释放内存资源
		
		void flush() throws IOException
			将输出流中缓冲的数据全部写出到目的地
			
			
			
	Reader 流的常用方法
		int read() throws IOException
			读取一个字符并以整数的形式返回（0～255), 如果返回-1已到输入流的末尾
		
		int read(Char[] cbuf) throws IOException
			读取一系列字符并存储到一个数组 buffer, 返回实际读取的字符数，如果读取前已到输入流的末尾返回-1
		
		int read(char[] cbuf, int offset, int length) throws IOException
			最多读取 length个字符, 并存储到一个数组 buffer，从length位置开始返回实际读取的字符数，如果读取前以到输入流的末尾返回-1
		
		void close() throws IOException
			关闭流释放内存资源
		
		long skip(long n) throws IOException
			跳过 n 个字符不读，返回实际跳过的字节数
			
			
			
	Writer 流中常用方法
		void write(int c) throws IOException
			向输出流中写入一个字符数据，该字节数据为参数b的低16位

		void write(char[] cbuf) throws IOException
			将一个字符类型的数组中的数据写入输出流
			
		void write(char[] cbuf, int offset, int length) throws IOException
			将一个字符类型的数组中的从指定位置 (offset) 开始的
			length 个字符写入到输出流
		
		void write(String string) throws IOException
			将一个字符串中的字符写入到输出流

		void write(String string, int offset, int length) throws IOException
			将一个字符串从 offset 开始的 length 个字符写入到输出流
			
		void close() throws IOException
			关闭流释放内存资源
			
		vold flush() throws IOException
			将输出流中缓冲的数据全部写出到目的地






*/