/*
	ArrayList 和 LinkedList 的比较
	
		ArrayList和LinkedList都实现了List接口中的方法，但两者内部实现不同;
		
		ArrayList底层采用数组完成，
		而LinkedList则是以一般的双向链表（double一linkedlist）完成，其内每个对象除了数据本身外，
		还有两个引用，分别指向前一个元素和后一个元素;
		
		如果我们经常在List的开始处增加元素，或者在List中进行插入和删除操作，我们应该使用LinkedList，否则的话，使用ArrayList将更加快速;
		
		ArrayList存取速度快，插入删除慢;
		LinkedList存取速度慢，插入删除速度快;

*/