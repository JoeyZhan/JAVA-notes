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
	public int p = 10;
	public float[] score = new float[p];
	public Scanner sc = new Scanner(System.in);
	public float sum, avg, t;
}

class B extends A_student_a implements It_student_f
{
	public void input()
	{
		System.out.printf("����������¼���ѧ������: ");
		p = sc.nextInt();
		
		for (i=1; i<=p; ++i)
		{
			System.out.printf("�������" + i + "��ѧ���ķ�����");
			score[i-1] = sc.nextFloat();
		}
	}
	
	public void output()
	{
		System.out.printf("\nѧ���ɼ��Ӵ�С����\n");
		for (i=1; i<=p; ++i)
		{
			System.out.printf("��" + i + "��ѧ���ķ���Ϊ��" + score[i-1] + "\n");
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
		System.out.printf("\n" + p + "��ѧ�����ܷ���Ϊ��" + sum + "\n");
		System.out.printf(p + "��ѧ����ƽ����Ϊ��" + avg + "\n");
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