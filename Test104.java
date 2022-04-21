/* ===============================
   ����Ŭ������ �ν��Ͻ� ����
============================== */

// Ŭ������ �ν��Ͻ� Ȱ��

// 1 ~ 3 ������ ������ �߻����Ѽ�
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���� ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// �� ���� ������ �� 1 : ����, 2 : ����, 3 : ��

// ���� ��)
// 1:����    2:����     3:��    �� �Է�(1~3) : 4
// 1:����    2:����     3:��    �� �Է�(1~3) : -2
// 1:����    2:����     3:��    �� �Է�(1~3) : 2

// - ��  �� : ����
// - ��ǻ�� : ��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.util.Random;

class RpsGame
{

	private int user;
	private int com;
	
	String [] game = {"����", "����", "��"};

	private void computer()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;
	
	}//end of void computer

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����   2:����   3:��   �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user>3 || user<1);


	}//end of void input

	public void gaming()
	{
		computer();
		System.out.printf("- ���� : %s%n", game[user-1]);
		System.out.printf("- ��ǻ�� : %s%n", game[com-1]);

	}// end of void gaming

	public void output()
	{
		
		if (user == com)
		{	
			System.out.println();
			System.out.println(">> ��� : ���º�");
		}
		else if ((user==1 && com == 2) || (user==2 && com == 3) || (user==3 && com == 1))
		{
			System.out.println();
			System.out.println(">> ��� : �� ��");
		}
		else if ((user==1 && com == 3)|| (user==2 && com ==2) || (user==3 && com==2))
		{
			System.out.println();
			System.out.println(">> ��� : ���� ��");
		}
	}//end of void output

}  // end of class RpsGame



public class Test104
{
	public static void main(String[] args)
	{
		
		RpsGame rg = new RpsGame();
		rg.input();
		rg.gaming();
		rg.output();
	}
	
}// end of class Test104

// ���� ���

/*
1:����   2:����   3:��   �� �Է�(1~3) : 1

 - ���� : ����
 - ��ǻ�� : ����

>> �º� ���� ��� : ���º�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
1:����   2:����   3:��   �� �Է�(1~3) : 2

 - ���� : ����
 - ��ǻ�� : ����

>> �º� ���� ��� : ���� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
1:����   2:����   3:��   �� �Է�(1~3) : 3

 - ���� : ��
 - ��ǻ�� : ����

>> �º� ���� ��� : ��ǻ�� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/