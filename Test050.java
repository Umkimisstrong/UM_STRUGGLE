/*==============================================
  �� �� �� ���� �帧�� ��Ʈ��(���) �� �� ��
==============================================*/

// �ݺ���(while��) �ǽ�

// 1���� 100 ������ ������ ���� ���ϵ�...
// 10�� ����� �� ������... ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 1 ~ 10������ �� : xx
// 1 ~ 20������ �� : xx
//			:
// 1 ~ 100������ �� : xx
// ����Ϸ��� �ƹ� Ű�� ��������.....

public class Test050
{
	public static void main(String[] args)
	{
		int a=1;
		int sum=0;


		while(a<=100)
		{
			sum += a;
			// System.out.println("a : " + a + ", sum : " + sum);
			if(a%10==0)
			{
				 //System.out.println("a : " + a + ", sum : " + sum);// ���

				 System.out.printf("1 ~ %d ������ �� : %d%n",a, sum);
			}
			a++;

		}

	
	}
}


// ���� ���

/*
1 ~ 10 ������ �� : 55
1 ~ 20 ������ �� : 210
1 ~ 30 ������ �� : 465
1 ~ 40 ������ �� : 820
1 ~ 50 ������ �� : 1275
1 ~ 60 ������ �� : 1830
1 ~ 70 ������ �� : 2485
1 ~ 80 ������ �� : 3240
1 ~ 90 ������ �� : 4095
1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/