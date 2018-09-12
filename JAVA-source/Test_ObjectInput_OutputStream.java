/*
	ObjectInputStream �� ObjectOutputStream (��������л�)
		
		��������л�
			��ν���л���ָ����һ��Object����ֱ��ת��Ϊ�ֽ�����Ȼ�������ֽ���ֱ��д�뱾��Ӳ�̻�������;
			���Ҫ���ĳ���������л���������ʵ��Serializable�ӿ�;
		
			Serializable�ӿ��в�û���κη������ýӿڱ���Ϊ��ǽӿڣ����һ����ʵ����Serializable�ӿڣ�
			Ǳ�ں�����Ǹ��߱�������������������л��ģ���������д������иö���Ĵ��룬
			�������ͻ��Զ�������Ӧ�Ĵ�������ɸö�������л���
			����ö���û��ʵ��Serializable�ӿڣ�������ȴ���ڸö������л��Ĵ��룬����������ʱ�ͻᱨ��
			
			��Java��transient���εĳ�Ա�����ڶ������л�ʱ�������л�;
*/

import java.io.*;

public class Test_ObjectInput_OutputStream
{
	public static void main(String[] args)
	{
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		student stu_1 = new student("Lebron_James", "123456", 88.8f);		//ע��88.8f���ܸ�Ϊ88.8 
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
			System.out.println("�޷��ҵ��ļ���");
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
	//transient public float s_score = 0;	//��ʾsscore��Ա���ܱ����л�����ν���ܱ����л�����ָ��
										//���ó�Ա���� ObjectOutputStream ��writeObject()ʱ���ᱻ���棬����ObjectInputStream��readObject()����ʱ���ᱻ��ȡ��
	
	public student(String s_name, String s_number, float s_score)
	{
		this.s_name = s_name;
		this.s_number = s_number;
		this.s_score = s_score;
	}
}