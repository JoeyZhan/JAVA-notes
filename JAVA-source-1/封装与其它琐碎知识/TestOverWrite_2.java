/*
	���෽������д_2_ʵ��
	
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
		String strInfor = super.getInfor() + "\nSchool: " + school;		//����super���÷�����ȷ�ģ����ôӸ���̳й�������ͨ�����������ǹ��췽����
		
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
	
	���н����
		Name: Lebron James
		Age: 34
		School: Cleveland Cavaliers

*/
