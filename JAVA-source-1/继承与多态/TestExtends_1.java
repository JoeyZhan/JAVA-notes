/*
	extends(�̳�) ���÷�_1

	�﷨��class ���� extends �̳�����
*/

class human
{
	public String name = "Lebron";
	public int age = 23;
}

class student extends human		//�̳�human������
{
	public double score = 98;
}

class graduate extends student		//�̳�student������
{
	public String teacher = "LBJ";
}

public class TestExtends_1
{
	public static void main(String[] args)
	{
		graduate gd = new graduate();
		System.out.printf("%s %d %f %s", gd.name, gd.age, gd.score, gd.teacher);
	}
}

/*
	2018-03-25 23:00:32
	
	���ʣ�String��ʲô��˼��
*/