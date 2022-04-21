/*===============================
  �� �� �� Ŭ���� ��� �� �� ��
===============================*/

// ��ø Ŭ����

class Test2
{
	static int a = 10;	// ���� ����, Test2�� �������, static ����(class Ŭ���� ����)
	int b = 20;			// ���� ����, Test2�� �������, non-static(instance �ν��Ͻ� ����)

	void write()	// �� ù ��° write() �޼ҵ�
	{
		System.out.println("write()...��");
		final int c = 20; // ��������, ���ȭ�� ����(���� ������ �ʴ� ����)
		int d = 40;       // ��������, ���� ���÷� ���� �� �ִ� ����


		class LocalTest
		{
			void write()   // �� �� ��° write() �޼ҵ�
			{
				System.out.println("write()...��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				System.out.println("d : " + d); 
			}
		}

		// �� ���� c �� ���� d �� �� �� �������� ������..
		//    c �� final �����̱� ������
		//    �� ��° write() �޼ҵ忡�� ���� �����ϴ���
		//    ������ ������ ������� �� �ִ�.
		//    �ݸ鿡 d�� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//    LocalTest Ŭ������ �ν��Ͻ� ���� ������
		//    ������ ���� �� �� ���� ������
		//    �� d�� � ���� ����ִ��� ������� �� ���� ������
		//    �� ���� d�� �����ϴ� ���� ���� �� �ֵ��� ���������� ó��.

		//d=10;
		//d -= 30;

		LocalTest lt = new LocalTest();
		lt.write();


		//d+=10;



	}

}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test125
{
	public static void main(String[] args)
	{	
		Test2 ob1 = new Test2();
		ob1.write();	// -- ù��° write()�޼ҵ�
		/*
		write()...��
		write()...��
		a : 10
		b : 20
		c : 20
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

		
	}
}