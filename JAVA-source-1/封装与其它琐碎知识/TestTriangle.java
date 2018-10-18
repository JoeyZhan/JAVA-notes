//java中的函数也叫做方法 方法逻辑意义代表的就是一个事物可以执行的操作

class Triangle
{
	int a, b, c;
	
	int perimeter()			//不需要定义形参，因为zhouchang函数和属性a b c是一个有机整体，彼此当然可以相互访问
	{
		return a+b+c;
	}
	
	double area()
	{
		double p = 1.0*(a+b+c) / 2;
		
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}
}

class TestTriangle
{
	public static void main(String[] args)
	{
		Triangle s = new Triangle();
		
		s.a = 3;
		s.b = 4;
		s.c = 5;
		
		System.out.printf("%d %f\n", s.perimeter(), s.area());
						//在java中double 和 float 都用%f输出
						//在C中,double用%lf输出, float 用%f输出
	}
}

/*
	个人认为这里的class triangle与 c语言中的 结构体 struct 相似，但结构体只能定义类型，无法在里面进行运算之类的操作，而java这里的可以； 
*/
