/*
	实现 泛型 后的 Test_HashMap_2.java

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
		hm_1.put(10001, new Student(10001, "赵云", 28));	//容器中只能放对象，10001将会被自动封装为Integer;
		hm_1.put(10002, new Student(10002, "关羽", 32));
		hm_1.put(10003, new Student(10003, "张飞", 33));
		hm_1.put(10004, new Student(10004, "刘备", 35));
		
		//遍历
		System.out.println("hm_1容器中的所有值：");
		Set<Integer> s = hm_1.keySet();
		Iterator<Integer> it = s.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println(hm_1.get(key));
		}
		
		System.out.println("直接查找容器中的值：");
		System.out.println(hm_1.get(10001));
		System.out.println(hm_1.get(10005));	//不存在则返回null;
	}
}