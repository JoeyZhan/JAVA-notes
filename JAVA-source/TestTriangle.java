//java�еĺ���Ҳ�������� �����߼��������ľ���һ���������ִ�еĲ���

class Triangle
{
	int a, b, c;
	
	int perimeter()			//����Ҫ�����βΣ���Ϊzhouchang����������a b c��һ���л����壬�˴˵�Ȼ�����໥����
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
						//��java��double �� float ����%f���
						//��C��,double��%lf���, float ��%f���
	}
}

/*
	������Ϊ�����class triangle�� c�����е� �ṹ�� struct ���ƣ����ṹ��ֻ�ܶ������ͣ��޷��������������֮��Ĳ�������java����Ŀ��ԣ� 
*/
