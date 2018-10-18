/*
	Array (数组) 的用法_2

	引用类型(指针)数组
		引用类型元素组成的一维数组在使用过程中一般存在着两级的指向关系，这是理解多维不等长数组的基础;
*/

class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void display()
	{
		System.out.printf("DATE: %d-%d-%d\n", day, month, year);
	}
}

public class Test_Array_2
{
	public static void main(String[] args)
	{
		int i;
		Date[] day = new Date[12];		//注意！！！这里是定义了一个数量为12的引用类型的变量，用来存储 Date类 的指针;
										//与 Date day = new Date(); 不一样;		
		for(i=0; i<day.length; ++i)
		{
			//day[i].Date(1+i, 1+i, 1999+i);	//error		31行是定义了一个数量为12的引用类型的变量，用来存储 Date类 的指针;
			day[i] = new Date(1+i, 1+i, 1999+i);
			day[i].display();
		}
	}
}

/*
	运行结果：
		DATE: 1-1-1999
		DATE: 2-2-2000
		DATE: 3-3-2001
		DATE: 4-4-2002
		DATE: 5-5-2003
		DATE: 6-6-2004
		DATE: 7-7-2005
		DATE: 8-8-2006
		DATE: 9-9-2007
		DATE: 10-10-2008
		DATE: 11-11-2009
		DATE: 12-12-2010
*/