/*
	父类方法的重写_2_实例
	
*/

class Person
{
	private String name;
	private int age;
	
	public Person()
	{
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getInfor()
	{
		return "Name: " + name + "\nAge: " + age;
	}
}

class Student extends Person
{
	private String school;
	
	public Student()
	{
	}
	
	public Student(String name, int age, String school)
	{
		super(name, age);
		this.school = school;
	}
	
	public void setSchool(String school)
	{
		this.school = school;
	}
	
	public String getInfor()
	{
		String strInfor = super.getInfor() + "\nSchool: " + school;		//这里super的用法是正确的，调用从父类继承过来的普通方法，而不是构造方法；
		
		return strInfor;
	}
}

public class TestOverWrite_2
{
	public static void main(String[] args)
	{
		Student stu_1 = new Student("Lebron James", 34, "Cleveland Cavaliers");
		
		System.out.printf(stu_1.getInfor());
	}
}

/*
	2018-03-28 18:46:22
	
	运行结果：
		Name: Lebron James
		Age: 34
		School: Cleveland Cavaliers

*/
