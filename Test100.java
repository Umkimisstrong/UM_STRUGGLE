/* =================================
   ���� Ŭ������ �ν��Ͻ�����
=================================*/

// ���� ���а�(information hiding) ��������������(access control specifiers, ����������, ����������, ...)

import java.util.Scanner;

class CircleTest2
{
	// ��� ����, �ν��Ͻ� ����, ���� ����
    //int num;

	// ��

	// ���� ����(Information Hiding)
	// ��private�� ���������������� ������						��  �� ���� private �� �����ϴ°�?? : �� ���� �޼ҵ�� �����Ͽ� ȣ���ϴ°�??? : 
																    // ��Ģ�� ���ؼ� ��Ʈ���� �����ϰ� �Ѵ�.
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
	// int �� �������� �� �ڵ� 0���� �ʱ�ȭ ����

	 private int num;

	 // getter / setter ����
	
	/*
	 int getNum()
	{
		return num;
	}
	void setNum(int num)
	{
		this.num = num;
	}
	*/
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		num = sc.nextInt();
	}

	double calArea()
	{
		return 	num * num * 3.141592;
	}

	void write(double area)
	{
		System.out.println("������ : " + num);
		System.out.println("���� : " + area);
	}











}


public class Test100
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();
		
		//ob1.num = 10;
		// ��
		//ob1.setNum(10);

		
		//System.out.println("���� ������ : " + ob1.num);
		// ���� ������ : 10
		//System.out.println("���� ������ : " + ob1.getNum);
		//ob1.setNum(10);
		//System.out.println("���� ������ : " + ob1.getNum());
		





		/*	private �����ϸ� : ���� �ȵǰ� ��µ� �ȵǰ�(���� ���ٺҰ�)

		Test100.java:37: error: num has private access in CircleTest2
                ob1.num = 10;		
                   ^
		Test100.java:38: error: num has private access in CircleTest2
                System.out.println("���� ������ : " + ob1.num)
		*/ 

		ob1.input();
		double result = ob1.calArea();
		ob1.write(result);

		/*
		������ �Է� : 1
	    ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

		

	} 
}

// ���� ���

/*
������ �Է� : 3
������ : 3
���� : 28.274328
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/