/*
	Buffered (缓冲流)
	
	缓冲流概述
		
		缓冲流就是带有缓冲区的输入输出流;
	
		缓冲流可以显著的减少我们对io访问的次数，保护我们的硬盘！
		
		缓冲流本身就是处理流（处理流也叫包裹流），缓冲流必须得依附于节点流（节点流也叫原始流）;
		
		处理流是包裹在原始节点流上的流，相当于包括在管道上的管道;
		
	
	缓冲流构造方法
	
		缓冲流要 "套接" 在相应的节点流之上，对读写的数据提供了缓冲的功能，提高了读写的效率，同时增加了一些新的方法。
		J2SDK提供了四种缓存流，其常用的构造方法为:
			BufferedReader(Reader in)
			BufreredReader(Reader in, int sz)	//sz为自定义缓存区的大小;
			
			BufferedWriter(Writer out)
			BufferedWrlter(Writer out, int size)
			
			BufferedInputStream(InputStream in)
			BufferedInputStream(InputStream in, int size)
			
			BufferedOutputStream(OutputStream out)
			BufferedOutputStream(OutputStream out, int size)
			
		缓冲输入流支持其父类的mark和reset方法;
		BufferedReader提供了readLine 方法用于读取一行字符串（以＼r或＼n分隔）;
		BufferedWriter提供了newLine 用于写入一个行分隔符;
		对于输出的缓冲流，写出的数据会先在内存中缓存，使用flush方法将会使内存中的数据立刻写出;
		
	
	BufferedInputStream 和 BufferedOutputStream
	
		BufferedInputStream：带缓冲的输入流，允许一次向程序中读入多个字节的数据;
		BufferedOutputStream：带缓冲的输出流，允许一次向硬盘写入多个字节的数据;
		
		BufferedInputStream 和 BufferedOutputStream 都是包裹流，必须的依附于 InputStream 和 OutputStream;
		例子：
			利用 BufferedInputStream 和 BufferedOutputStream 完成大容量文件的复制，这远比单纯利用 FileInputStream 和 FileOutputStream 要快得多;

		BufferedInputStream流中有
			public int read(byte[] b)
			方法用来把从当前流关联到的设备中读取出来的数据存入一个byte数组中
			
		BufferedOutputStream流中有
			public int write(byte[] b)
			方法用来把byte数组中的数据输出到当前流所关联到的设备中
			
		如果我们希望用BufferedInputStream和BufferedOutputStream完成“将一个设备中的数据导入另一个设备中”，
		我们就应该定义一个临时的byte类型的数组，用这个临时数组作为输入流与输出流进行交互的中转枢纽！

	
	BufferedReader 和 BufferedWriter
		
		Reader、FileReader、InputStream、FileInputStream、BufferedInputStream 流中都没有 readLine 方法;
		
		DataInputStream 流 中有readLine方法，但己经被标记为过时;
		
		BufferedReader流中有readLine方法，并且该方法是可以正确被使用的;
		
		BufferedReader流中有readLine是个非常有用的方法, BufferedReader是个要经常使用的流;
		
		利用BufferedReader和BufferedWriter可以提高读写文本文件内容的速度;






		
	
	
*/