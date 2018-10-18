/*
	HashSet 类

	本程序功能：重写equals和hashCode方法 使容器中不出现重复内容的对象; 
*/

import java.util.*;

class student
{
	private int id = 0;
	private String name = null;
	
	public student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return id + "-" + name;
	}

	public boolean equals(Object o)
	{
		student s = (student)o;
		return this.id == s.id && this.name == s.name;
	}
	
	public int hashCode()
	{
		return id * name.hashCode();
	}
}

public class Test_Set_HashSet_1
{
	public static void main(String[] args)
	{
		Set s = new HashSet();
		s.add(new student(1001, "Lebron"));
		s.add(new student(1001, "Lebron"));
		s.add(new student(1002, "Jordan"));
		s.add(new student(1003, "Love"));		
		s.add(new student(1003, "Love"));		
		s.add(new student(1005, "Dwade"));		
		s.add(new student(1005, "Dwade"));		
		s.add(new student(1004, "Curry"));		
		s.add(new student(1006, "Pual"));

		System.out.println(s);
	}
}