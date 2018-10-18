/*
	ObjectInputStream 和 ObjectOutputStream (对象的序列化)
		
		对象的序列化
			所谓序列化是指：把一个Object对象直接转化为字节流，然后把这个字节流直接写入本地硬盘或网络中;
			如果要想把某个对象序列化，则必须的实现Serializable接口;
		
			Serializable接口中并没有任何方法，该接口被称为标记接口，如果一个类实现了Serializable接口，
			潜在含义就是告诉编译器这个类是允许被序列化的，如果程序中存在序列该对象的代码，
			编译器就会自动进行相应的处理已完成该对象的序列化，
			如果该对象没有实现Serializable接口，程序中却存在该对象被序列化的代码，编译器编译时就会报错！
			
			在Java中transient修饰的成员变量在对象序列化时不被序列化;
*/

import java.io.*;

public class Test_ObjectInput_OutputStream
{
	public static void main(String[] args)
	{
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		student stu_1 = new student("Lebron_James", "123456", 88.8f);		//注意88.8f不能改为88.8 
		student stu_2 = null;
		
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream("Test_Out_data.txt"));
			oos.writeObject(stu_1);
			
			ois = new ObjectInputStream(new FileInputStream("Test_Out_data.txt"));
			stu_2 = (student)ois.readObject();
			
			System.out.println("Name: " + stu_2.s_name);
			System.out.println("Number: " + stu_2.s_number);
			System.out.println("Score: " + stu_2.s_score);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("无法找到文件！");
			System.exit(-1);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.exit(-1);
		}
		finally
		{
			try{
				oos.close();
				ois.close();
			}
			catch (Exception e)
			{	
				e.printStackTrace();
				System.exit(-1);
			}
		}
	}
}

class student implements Serializable
{
	public String s_name = null;
	public String s_number = null;
	public float s_score = 0;
	//transient public float s_score = 0;	//表示sscore成员不能被序列化，所谓不能被序列化就是指：
										//“该成员调用 ObjectOutputStream 的writeObject()时不会被保存，调用ObjectInputStream的readObject()方法时不会被读取”
	
	public student(String s_name, String s_number, float s_score)
	{
		this.s_name = s_name;
		this.s_number = s_number;
		this.s_score = s_score;
	}
}