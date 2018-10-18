/*
	LayoutManager (布局管理器)
	
		容器对其中所包含组件的排列方式，包括组件的位置和大小设定，被称为容器的布局(Layout);
		
		为了使图像用户界面具有良好的平台无关性，Java语言提供了布局管理器来管理容器的布局，而 不建议直接设置组件在容器中的位置和尺寸;
		
		每个容器都有一个默认的布局管理器，当容器需要对某个组件进行定位或判断其大小尺寸时，就会自动调用其对应的布局管理器;
		
	AWT 常见布局管理器:
		BorderLayout	(Frame默认管理器)
		FlowLayout		(Panel默认管理器)
		GridLayout		
		
	总结:
		
		Frame是一个顶级窗口，Frame的缺省布局管理器为BorderLayout;
		
		Panel 无法单独显示，必须添加到某个容器中;
		Panel 的缺省布局管理器为FlowLayout;
		
		当把 Panel 作为一个组件添加到某个容器中后，该 Panel 仍然可以有自己的布局管理器;

		使用布局管理器时，布局管理器负责各个组件的大小和位置，因此用户无法在这种情况下设置组件大小和位置属性，
		如果试图使用Java语言提供的 setLocation()，setSize()，setBounds()等方法，则都会被布局管理器覆盖;
		
		如果用户确实需要亲自设置组件大小或位置，则应取消该容器的布局管理器，
		方法：
			setLayout(null);
*/