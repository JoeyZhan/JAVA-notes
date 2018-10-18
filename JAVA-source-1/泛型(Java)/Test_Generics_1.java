/*
	泛型
	
	泛型是用来限制传入容器、接口中的数据类型。
	
	Comparable<T> 接口中有如下方法:
		int compareTo(T o)
		
	要想限制 传入Comparable接口的数据类型，可以利用 泛型 来实现，具体如下:
	class Student implements Comparable<Student>
	{
		......
		......
		
		public int compareTo(Student s)		//由于泛型限制了传入的数据类型，所以应为程序员所限制的数据类型，即Student;
		{									//不能写成 Object;					
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
	
	//形参不能写成Object ob 必须得写为 Student ob 否则编译时会报错，
	//出错信息是：“Student 不是抽象的，并且未覆盖 java.lang.Comparable 中的抽象方法 compareTo(Student)”
//	public int compareTo(Object ob)  //本方法是错误的
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
		li.add(new Student(1001, "张飞", 35));
		li.add(new Student(1004, "赵云", 28));
		li.add(new Student(1002, "关羽", 33));
		li.add(new Student(1003, "刘备", 36));
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
	}
}