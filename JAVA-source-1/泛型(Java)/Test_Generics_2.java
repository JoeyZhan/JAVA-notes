/*
	ʵ�� ���� ��� Test_HashMap_2.java

*/

import java.util.*;

class Student
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
	
	public int hashCode()
	{
		return this.name.hashCode() * id * age;
	}
	
	public boolean equals(Object o)
	{
		Student std = (Student)o;
		return this.name.equals(std.name) && this.id == std.id && this.age == std.age;
	}
	
	public String toString()
	{
		return id + "-" + name + "-" + age;
	}
}

public class Test_Generics_2
{
	public static void main(String[] args)
	{
		HashMap<Integer, Student> hm_1 = new HashMap<Integer, Student>();
		hm_1.put(10001, new Student(10001, "����", 28));	//������ֻ�ܷŶ���10001���ᱻ�Զ���װΪInteger;
		hm_1.put(10002, new Student(10002, "����", 32));
		hm_1.put(10003, new Student(10003, "�ŷ�", 33));
		hm_1.put(10004, new Student(10004, "����", 35));
		
		//����
		System.out.println("hm_1�����е�����ֵ��");
		Set<Integer> s = hm_1.keySet();
		Iterator<Integer> it = s.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println(hm_1.get(key));
		}
		
		System.out.println("ֱ�Ӳ��������е�ֵ��");
		System.out.println(hm_1.get(10001));
		System.out.println(hm_1.get(10005));	//�������򷵻�null;
	}
}