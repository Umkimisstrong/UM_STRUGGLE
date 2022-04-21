/*=========================================
    ���� ���� (Sort) �˰��� ����
========================================*/

// �� ����
//    ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
//    ������ ���� �л����� ���� ������ ����� �ο��Ͽ�
//    ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1, ���� ����) : �̾Ƹ� 90
// �̸� ���� �Է�(2, ���� ����) : ������ 87
// �̸� ���� �Է�(3, ���� ����) : ������ 86
// �̸� ���� �Է�(4, ���� ����) : ������ 75
// �̸� ���� �Է�(5, ���� ����) : ��μ� 70
/*
-----------------
1�� �̾Ƹ� 90
2�� ������ 87
3�� ������ 86
4�� ������ 75
5�� ��μ� 70
-----------------
����Ϸ��� �ƹ� Ű�� ��������...

*/


import java.util.Scanner;

public class Test112
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int getScore;
		String k;



			System.out.print("�ο� �� �Է� : ");
			a = sc.nextInt();

		// �л� �� ��ŭ�� ����, �̸�, ���� �迭 ����
		String [] names = new String[a];
		int [] ranks = new int [a];
		int [] score = new int [a];


		for (int i =1;i<=a ;i++ )
		{
			System.out.printf("�̸� ���� �Է�(%d, ���� ����) : ", i);
			k = sc.next();
			getScore = sc.nextInt();

			names [i-1] = k;
			score [i-1] = getScore;
		}

		// �� �� ��  ��  ��
		// 60 80 70 100 90
		// 1  1  1   1   1
		
		// ���� 1�� �ʱ�ȭ
		for (int i = 0;i < score.length ;i++ )
		{
			ranks[i]=0;
		}

		int n = 1;

		// ���� �� �ؼ� -> ������������ �������� ������� �ڸ��ٲ�

		for (int i = 0;i<score.length-1 ;i++ )
		{
			for (int j = 1;j<score.length ;j++ )
			{
				if (score[i] > score [j])
				{

					score[i] = score[i]^score[j];
					score[j] = score[j]^score[i];
					score[i] = score[i]^score[j];
					
					String str;
					str = names[i];
					names[i] = names[j];
					names[j] = str;

				}
			}
		}
		
		for (int i =0;i < score.length ; i++ )
		{
			ranks[i] += n;
			n++;
		}
		
		// 60 70 80 90 100 ���� ���ĿϷ�
		// ��ũ�� �ش� ����� 1���� ~ ��������ŭ �����й�
		System.out.println();

		for (int i = 0 ;i<a; i++ )
		{
			System.out.printf("%d��, %s, %d", ranks[i], names[a-i-1], score[a-i-1]);
			System.out.println();
		}

	}
}

// ���� ���

/*
�ο� �� �Է� : 3
�̸� ���� �Է�(1, ���� ����) : �Ŷ�� 100
�̸� ���� �Է�(2, ���� ����) : �ʱ��� 80
�̸� ���� �Է�(3, ���� ����) : ¥�İ�Ƽ 120

1��, ¥�İ�Ƽ, 120
2��, �Ŷ��, 100
3��, �ʱ���, 80
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

