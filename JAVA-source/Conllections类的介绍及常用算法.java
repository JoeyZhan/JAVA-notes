/*
	Collections 类常用算法
	
		Collection 接口的实现类，如ArrayList、LinedList 本身并没有提供排序，倒置，查找等方法，这些方法是由
		Collections 类来实现的，该类有很多 public static 方法，可以直接对 Collection 的接口的实现类进行操作;
	
		类java.util.Collections 提供了一些静态的方法实现了基于List容器的一些常用算法;
		
			void sort(List) 
				对List容器内的元素排序;
				
			void shuffle(List)
				对List容器内的对象进行随机排序;
				
			void reverse(List)
				对List容器内的对象进行逆序排序;
				
			void fill(List, Object)
				用一个特定的对象重写整个List容器;
				
			void copy(List dest, List src)
				将src List容器内容拷贝到dest List容器中;
			
			int binarySearch(List, Object)
				对于顺序的List容器，采用折半查找的方法查找特定对象;

*/