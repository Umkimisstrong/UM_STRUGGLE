/* =======================================
   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================== */

// Random Ŭ����

/*
�� java.util.Random Ŭ������
   
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵
   ������ �����ϴ� �޼ҵ�����
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ���
   �߰����� ������ �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.

   -- ����������� ���̳����°� �����ε� �������̵�
   -- �ڵ��׽�Ʈ : �ζ� ��ȣ ������(�ܰ�)

*/

// �ζ� ��ȣ ������(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ�
// 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 3 5 12 24 31 41
// 1 2  8 49  2  9
// 5 6 4 23 5  7
// 10 22 33 42 9 3
// 59 32 22 11 2 1

// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Random;	
import java.util.Arrays;	// java util�� Arrays Ŭ���� ����

class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
    private int[] num;

	Lotto ()
	{
		num = new int[6];
	}
	
	// getter
	public int[] getNum()
	{

		return num;
	}

	public void start()
	{	
		Random rd = new Random();
		int n;
		int cnt = 0;
		
		jump:
		while(cnt<6)	// 0 1 2 3 4 5 
		{
			n = rd.nextInt(45)+1;	// 1 ~ 45	   ���� : 10 / 10(������ jump�ε��ư��� 10�ƴѼ� ���ö����� �����ݺ�)

			for (int i = 0;i < cnt ;i++ )
			{
				if (num[i]==n)
				{
					continue jump;
				}
			}
			num[cnt++] = n;		// num[0] num[1] num[2] num[3] num[4] num[5] 
		}
		sorting();
	}
	
	// ���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);
	}
}





public class Test148
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();

		for (int i =1 ;i<=5 ;i++ )
		{
			
			// �ζǰ��� ����
			lotto.start();

			for (int n : lotto.getNum() )
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}
	}
}