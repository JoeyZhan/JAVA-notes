/*
	Package(��) ���÷�_1
	
*/
package Test.Package;	//�Ѹ��ļ������е������Test�ļ����µ�Package�µ�main�ļ���;
//���Ҹ��ļ������е��� �������� ���� ��������������ϣ�

//���� Tset_Package_1 ���ֽ���� Test.Package.Test_Package_1;

//����ʱ��Ӧ���룺javac -d . Tset_Package_1.java;	
//ִ��ʱ��Ӧ���룺java Test.Package.Test_Package_1;

/*
	����������
	(һ)
	C:\Users\Source\Desktop>java Test_Package_1
	����: �Ҳ������޷��������� Test_Package_1
	
	(��)
	C:\Users\Source\Desktop>cd Test/Package

	C:\Users\Source\Desktop\Test\Package>java Test_Package_1
	����: �Ҳ������޷��������� Test_Package_1

*/

class A
{
	public void show()
	{
		System.out.printf("A�࣡\n");
	}
}

public class Test_Package_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.show();
	}
}