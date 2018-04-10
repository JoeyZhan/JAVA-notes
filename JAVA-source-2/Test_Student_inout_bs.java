import java.util.*;

interface It_student_f
{
	public abstract void input();
	public abstract void output();
	public abstract void sum_avg();
	public abstract void b_s();
}

abstract class A_student_a
{
	public int i, j;
	public int p = 100;
	public float[] score = new float[p];
	public Scanner sc = new Scanner(System.in);
	public float sum, avg, t;
}

class B extends A_student_a implements It_student_f
{
	public void input()
	{
		System.out.printf("请输入所需录入的学生人数: ");
		p = sc.nextInt();
		
		for (i=1; i<=p; ++i)
		{
			System.out.printf("请输入第" + i + "个学生的分数：");
			score[i-1] = sc.nextFloat();
		}
	}
	
	public void output()
	{
		System.out.printf("\n学生成绩从大到小排序：\n");
		for (i=1; i<=p; ++i)
		{
			System.out.printf("第" + i + "名学生的分数为：" + score[i-1] + "\n");
		}
	}
	
	public void b_s()
	{
		for (i=0; i<p-1; ++i)
		{
			for(j=0; j<=p-1-i; ++j)
			{
				if (score[j] < score[j+1])
				{
					t = score[j];
					score[j] = score[j+1];
					score[j+1] = t;
				}
			}
		}
	}
	
	public void sum_avg()
	{
		for (i=1; i<=p; ++i)
		{
			sum = sum + score[i-1];
		}
		
		avg = sum/p;
		System.out.printf("\n" + p + "个学生的总分数为：" + sum + "\n");
		System.out.printf(p + "个学生的平均分为：" + avg + "\n");
	}
}

public class Test_Student_inout_bs
{
	public static void main(String[] args)
	{
		B bb_1 = new B();
		bb_1.input();
		bb_1.b_s();
		bb_1.output();
		bb_1.sum_avg();
	}
}

/*
	2018-04-10 22:58:14
	
	待解决问题：14，15，25行的代码，动态内存分配的问题；
*/
