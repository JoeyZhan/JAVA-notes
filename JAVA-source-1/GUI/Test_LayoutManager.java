/*
	LayoutManager (���ֹ�����)
	
		������������������������з�ʽ�����������λ�úʹ�С�趨������Ϊ�����Ĳ���(Layout);
		
		Ϊ��ʹͼ���û�����������õ�ƽ̨�޹��ԣ�Java�����ṩ�˲��ֹ����������������Ĳ��֣��� ������ֱ����������������е�λ�úͳߴ�;
		
		ÿ����������һ��Ĭ�ϵĲ��ֹ���������������Ҫ��ĳ��������ж�λ���ж����С�ߴ�ʱ���ͻ��Զ��������Ӧ�Ĳ��ֹ�����;
		
	AWT �������ֹ�����:
		BorderLayout	(FrameĬ�Ϲ�����)
		FlowLayout		(PanelĬ�Ϲ�����)
		GridLayout		
		
	�ܽ�:
		
		Frame��һ���������ڣ�Frame��ȱʡ���ֹ�����ΪBorderLayout;
		
		Panel �޷�������ʾ���������ӵ�ĳ��������;
		Panel ��ȱʡ���ֹ�����ΪFlowLayout;
		
		���� Panel ��Ϊһ��������ӵ�ĳ�������к󣬸� Panel ��Ȼ�������Լ��Ĳ��ֹ�����;

		ʹ�ò��ֹ�����ʱ�����ֹ����������������Ĵ�С��λ�ã�����û��޷���������������������С��λ�����ԣ�
		�����ͼʹ��Java�����ṩ�� setLocation()��setSize()��setBounds()�ȷ������򶼻ᱻ���ֹ���������;
		
		����û�ȷʵ��Ҫ�������������С��λ�ã���Ӧȡ���������Ĳ��ֹ�������
		������
			setLayout(null);
*/