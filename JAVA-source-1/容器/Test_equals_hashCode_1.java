/*
	equals() �� hashCode() ����
	
	ʲô��������д equals()��hashCode()������
	
		Hashtable Hashset HashMap�������ͬʱʵ��equals()������hashCode()������ 
		Treeset��TreeMap����Ҫʵ��equals()������hashCode()����;
		

	Ԥ��֪ʶ��
		ɢ����
		
			Object�е�hashCode�����᷵�ظö�����ڴ���ʵ��ַ����������ʾ���������Ĳ���������ַ������ֵ���ǹ�ϣ��;
			
			��HashSet����Ӷ���ʱ��Hashset��ͨ���ö����hashCode()�������Ӧ��Ͱ��
			Ȼ���ٸ���equals()�����ҵ���Ӧ�Ķ�����������м����ڸö���������ӣ���������ڣ�����ӽ�ȥ��

			
	������дequals()��hashCode()����
	
		�����дequals()
			
			public boolean equals(Object Obj)
			{
				���this��Obj��������һ��һ����
					����true
				����
					����false
			}
			
		�����дhashCode()����
		public int hashCode()
		{
			return ��ǰ���л����������ݶ����hashCode()����;
		}


	equals()��hashCode()��������
		���ӣ�
			��ѧ����Ϣ����Hashset�����У�Ҫ���ܳ����ظ���ѧ����Ϣ������ѧ����Ϣȫ�����;	(Test_Set_HashSet_1.java)
		
		��ע��
			Hashset�в�û��public Object get(int index)������
			���Ҫ�����Hashset�������е�Ԫ�أ����Խ���iterator()������ʵ��;

		
		
		
		
		
		
		
		
*/