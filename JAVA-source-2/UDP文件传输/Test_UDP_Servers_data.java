/*
	UDP传输文件
	
	数据包大小受限制;
*/

import java.io.*;
import java.net.*;

public class Test_UDP_Servers_data
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds = new DatagramSocket(5218);	
		

		byte buf[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		try
		{
			while(true)	
			{
				ds.receive(dp);	
				
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Student_Management_System.c"));

				ByteArrayInputStream bais = new ByteArrayInputStream(dp.getData());
				DataInputStream dis = new DataInputStream(bais);

				byte buf_d[] = new byte[1024];
				int len = dis.read(buf_d);
				while(-1 != len)
				{
					bos.write(buf_d);
					len = dis.read(buf_d);
				}
				
				bos.flush();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			ds.close();	
		}
	}
}
//@JoeyChim-2018-10-16 18:23:03