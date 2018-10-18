/*
	Collection接口的子接口 —— List接口
	
		List 接口
		
			List接口是Collection的子接口，实现List接口的容器中的元素是有顺序的，而且可以重复;
			
			List容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序号存取容器中的元素;
			
			J2SDK所提供的 List 容器类有：
				ArrayList、LinkedList等;
				
			相关方法：
			
				Object get(int index);
				Object set(int index, Object element);
				void add(int index, Object element);
				Object remove(int index);
				int indexOf(Object o);
				int lastIndexOf(Object o);
*/