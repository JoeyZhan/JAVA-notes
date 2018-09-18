/*
	Collections���з������÷�_����_1

*/

import java.util.*;

public class Test_Collections_1
{
	public static void main(String[] args)
	{
		List lt = new LinkedList();
		
		for (int i = 0; i<7; ++i)
		{
			lt.add("A" + i);
		}
		System.out.println("lt: " + lt);
		
		Collections.shuffle(lt);	//��lt�����ڵĶ�������������;
		System.out.println("�����: " + lt);
		
		Collections.sort(lt);	//����Ĭ��Ϊ���������Ҫ�������ȵ���Collections.sort(); �ٵ���Collections.reverse();
		System.out.println("�����(����): " + lt);
		
		Collections.reverse(lt);	//����
		System.out.println("���ú�: " + lt);
		 
		System.out.println("�۰����a5: " + Collections.binarySearch(lt, "A5"));		//�۰����
		//��ʱlt����Ϊ����״̬������binarySearch()���������;
		
		Collections.sort(lt);
		System.out.println("���������: " + lt);
		
		System.out.println("�۰����a5: " + Collections.binarySearch(lt, "A5"));
		//ʹ��Collections.binarySearch()������ǰ���ǣ��������Ķ����ѱ����������;
		
		Collections.fill(lt, "A666");	//��дlt����"A666"������д���������ж���; �������������еĶ��󶼱��: "A666";
		System.out.println(lt);
	}
}

/*	2018-09-17 20:08:50
	���н��:	lt: [A0, A1, A2, A3, A4, A5, A6]
				�����: [A3, A0, A1, A2, A4, A5, A6]
				�����(����): [A0, A1, A2, A3, A4, A5, A6]
				���ú�: [A6, A5, A4, A3, A2, A1, A0]
				�۰����a5: -8
				���������: [A0, A1, A2, A3, A4, A5, A6]
				�۰����a5: 5
				[A666, A666, A666, A666, A666, A666, A666]

*/