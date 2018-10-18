import java.io.*;
import java.net.*;

public class Test_TCP_Servers
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(5128);
	/*
		5128是端口号，表示该服务器程序在监听666端口是否有客户端程序的连接,
		new出的 ServerSocket 对象 ss 并不会自动监听客户端有没有向 5128端口 发送请求，
		要想监听 5128端口 是否有客户端的请求，则必须的调用ss对象的accept方法,
		如果本程序只有8行这一行的代码的话，本程序运行时将无任何输出结果并会立即终止; 
	*/
		
		while(true)
		{
			Socket s = ss.accept();
		/*
			accept()功能：等待客户端的连接，没有连接，则继续监听，程序停滞不前，
			如果接收到客户端的一个连接，则自动将该连接封装为一个Socket对象，程序将不再阻塞，而是继续放下执行;
			这里的 s 实际是链接到客户端的 s ，服务器端的 s.getInputStream() 和客户端的 s.getOutputStream() 实际是同一根管道;
			accept()是阻塞式方法，如果接收不到客户端的连接，则程序将停止不前; 
		*/
			System.out.printf("连接成功!\n");
			
			DataInputStream dis = new DataInputStream(s.getInputStream());	//通过Socket对象可以获得InputStream和OutputStream两个管道;
			
			System.out.println(dis.readUTF());	//readUTF()方法也是阻塞式方法，如果接收不到客户端数据，则程序将停止不前;
			dis.close();
			s.close();
		}
		
	}
}