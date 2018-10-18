/*
	����
	
	�������������ƴ����������ӿ��е��������͡�
	
	Comparable<T> �ӿ��������·���:
		int compareTo(T o)
		
	Ҫ������ ����Comparable�ӿڵ��������ͣ��������� ���� ��ʵ�֣���������:
	class Student implements Comparable<Student>
	{
		......
		......
		
		public int compareTo(Student s)		//���ڷ��������˴�����������ͣ�����ӦΪ����Ա�����Ƶ��������ͣ���Student;
		{									//����д�� Object;					
		}
	}
*/

import java.util.*;

class Student implements Comparable<Student>	
{
	private int id;
	private String name;
	private int age;
	
	public Student()
	{
	}
	
	public Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return id + "-" + name + "-" + age;
	}
	
	//�ββ���д��Object ob �����дΪ Student ob �������ʱ�ᱨ��
	//������Ϣ�ǣ���Student ���ǳ���ģ�����δ���� java.lang.Comparable �еĳ��󷽷� compareTo(Student)��
//	public int compareTo(Object ob)  //�������Ǵ����
//	{
//		Student s = (Student)ob;
//		return this.id = s.id;
//	}
	
	public int compareTo(Student s)
	{
		return this.id - s.id;
	}
}

public class Test_Generics_1
{
	public static void main(String[] args)
	{
		List<Student> li = new ArrayList<Student>();
		li.add(new Student(1001, "�ŷ�", 35));
		li.add(new Student(1004, "����", 28));
		li.add(new Student(1002, "����", 33));
		li.add(new Student(1003, "����", 36));
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
	}
}