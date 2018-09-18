/*
	Comparable 接口
	
	为何要使用Comparable接口？
	
		基本类型数据 和 string类型数据，它们彼此的比较标准Java语言本身已经提供好了;
		
		用户自定义类对象之间比较的标准，Java语言本身是没有提供的;
		
		所以如果一个容器中含有用户自定义类型的数据，并且我们需要对容器中元素进行排序，或查找某一元素时，
		我们就必须得制定容器中元素与元素之间比较的标准;
		
		凡是需要进行对象比较/排序的场合均可考虑实现Comparable接口;

	所有可以“排序”的类都实现了java.lang.Comparable接口，Comparable接口中只有一个方法:
		public int compareTo(Object obj);
		该方法:
			返回 0 表示  this==obj;
			返回正数表示 this>obj;
			返回负数表示 this<obj;
	
		实现了 Comparable接口 的类通过实现 ComparaTo() 方法从而确定该类对象的排序方法;
		
*/

import java.util.*;

class NBA implements Comparable
{
	private int id = 0;
	private String name = null;
	
	public NBA(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return id + "-" + name;
	}
	
	@Override
	public int compareTo(Object o)		//此类为用户自定义类，所以需要用户重写Comparable接口中的 compareTo()方法，来指定对象排序的标准;
	{
		NBA nba = (NBA)o;
		
		if (this.id < nba.id)
			return -1;
		else if (this.id == nba.id)
			return 0;
		else
			return 1;
	}
}

public class Test_Comparable_comparableTo
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		
		l.add(new NBA(1000, "Lebron"));
		l.add(new NBA(1003, "DWADE"));
		l.add(new NBA(1005, "LOVE"));
		l.add(new NBA(1001, "JORDAN"));
		l.add(new NBA(1004, "CURRY"));
		
		Collections.sort(l);		//如要将 用户自定义的类 进行排序，需在该 自定义类 重写Comparable接口中的 compareTo()方法，详细内容参考 46行;
		System.out.println(l);
	}
}

/*	2018-09-18 21:36:45
	运行结果:
		[1000-Lebron, 1001-JORDAN, 1003-DWADE, 1004-CURRY, 1005-LOVE]
		
	本程序排序允许内容重复，想不重复请使用Set;
*/











