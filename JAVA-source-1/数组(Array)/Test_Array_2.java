/*
	Array (����) ���÷�_2

	��������(ָ��)����
		��������Ԫ����ɵ�һά������ʹ�ù�����һ�������������ָ���ϵ����������ά���ȳ�����Ļ���;
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
		Date[] day = new Date[12];		//ע�⣡���������Ƕ�����һ������Ϊ12���������͵ı����������洢 Date�� ��ָ��;
										//�� Date day = new Date(); ��һ��;		
		for(i=0; i<day.length; ++i)
		{
			//day[i].Date(1+i, 1+i, 1999+i);	//error		31���Ƕ�����һ������Ϊ12���������͵ı����������洢 Date�� ��ָ��;
			day[i] = new Date(1+i, 1+i, 1999+i);
			day[i].display();
		}
	}
}

/*
	���н����
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