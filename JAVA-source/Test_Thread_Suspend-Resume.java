/*
	Thread (线程) 的用法_8
	
	Thread 的控制_5
		线程的 suspend(挂起) 和 resume(恢复):	(已过时，有问题的方法)
			suspend(挂起)
				暂时停止当前运行中的线程, 使之转入阻塞状态, 并且不会自动恢复运行;
				
			resume(恢复)
				使得一个已挂起的线程恢复运行;
				
		方法:
			public final void suspend();
			public final void resume();
			
		suspend()方法挂起线程时并不释放其锁定的资源, 这可能会影响其他线程的运行, 且容易导致线程的死锁, 已不提倡使用;
			
*/