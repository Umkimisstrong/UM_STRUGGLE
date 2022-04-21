/* ==========================
	  ���� �迭 ����
========================== */	 // �ټ���� ����.. �ٷ��� �ڵ带 �����ؾ��Ҷ�..?

// �迭 ����� �ʱ�ȭ

/*
�� �迭�� ����
	1. �迭�̶� ũ��� ������ ���� �Ϸ��� ���ҵ��� ��
	   ������ ���� ������ ���� �ڷ��� ����ü�� �ǹ��ϴ� ������
	   ���������� ������ ���� �ڷ�须�� ����
	   ���������� �ڷ���(Data Type)�� �ο����� �ʰ�
	   �ϳ��� �̸��� ������ �ϰ������� ó���� �������� ���ȴ�.

	2. �ڹٿ����� �迭�� ������ ���� ������ ���� ���ȴ�.
	   �迭 ���� �� �迭�� �޸� �Ҵ� �� �迭 ��� ����(�迭 ����� ���)

�� ���� �� ����

   �ڷ���[] ������;
   ������ = new �ڷ���[���ũ��];
   ������[�ε���] = ��;


   ��> �ϳ��� �ڷ���
   -----
   int[] arr;	= (���� �ǹ�) int arr[];

   arr = new int[3]	  �� int ���� ���� �� 3������ڴٴ� �ǹ�.
   --- 
   ��> �迭�� ����(reference)Ÿ��

   arr[0] = 10;
   arr[1] = 20;
   arr[2] = 30;

*/

public class Test081
{

	public static void main(String[] args)
	{
		// �迭 ����
		int[] arr;

		// �޸� �Ҵ�
		arr = new int[10];

		// �迭�� ������ ���� ����� ���ÿ�
		// �޸� �Ҵ� �� �ʱ�ȭ�� �����ϴ�.

		// int[] arr; arr = new int[10]; ������ �迭
		int[] arr2 = new int[10];
	    int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// �迭 ��� ���ٻ��

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		// �� ���� �Ҵ����� ���� ������ �迭 ������
		//	  �ڵ����� �ʱ�ȭ�ȴ�. �� 0(int �� �迭)

		int num = 10;
		System.out.println("num : " + num);
		//--==>> num : 10
		System.out.println("arr : " + arr);
		//--==>> arr : [I@15db9742
		//-- �޸� �ּڰ��� �ƴϰ�, �迭�� ����ϱ� ���� �ڹٰ� ���� ������ ����
		//   �迭������ �Ϲݺ���ó�� ����ؼ� ����ϴ� �������� �ۼ��ϰ� �Ǹ�
		//   �迭�� �� �濡 ����ִ� �����Ͱ� ��µǴ� ���� �ƴ϶�
		//	 �츮�� �˾ƺ� �� ���� �ڵ尡 ��µȴ�.
		//	 (�ڹٴ� �޸� �ּҰ��� ����ڰ� ���� �����ϴ� ���� ������� �ʱ� ����)

		System.out.println("arr[0] : " + arr[0]);
		//--==>> arr[0] : 1
		System.out.println("arr[1] : " + arr[1]);
		//--==>> arr[1] : 2
		System.out.println("arr[2] : " + arr[2]);
		//--==>> arr[2] : 3

		System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " "
			               + arr[4] + " " + arr[5] + " " + arr[6] + " " + arr[7]
							+ " " + arr[8] +" " +arr[9]);
		// --==>> 1 2 3 0 0 0 0 0 0 0

		// �ݺ����� Ȱ���Ͽ� �迭�� ��� ������ ��ü ���
		for (int i=0;i<10 ;i++ )	// i �� 0 1 2 3 4 5 6 7 8 9
		{
			// �׽�Ʈ
			//System.out.printf("%2d", arr[i]);

			System.out.printf("arr �迭�� %d��° �� : %2d\n", i, arr[i]);
			/*
			arr �迭�� 0��° �� :  1
			arr �迭�� 1��° �� :  2
			arr �迭�� 2��° �� :  3
			arr �迭�� 3��° �� :  0
			arr �迭�� 4��° �� :  0
			arr �迭�� 5��° �� :  0
			arr �迭�� 6��° �� :  0
			arr �迭�� 7��° �� :  0
			arr �迭�� 8��° �� :  0
			arr �迭�� 9��° �� :  0
			*/
		}

	}
}

//
/*
num : 10
arr : [I@15db9742
arr[0] : 1
arr[1] : 2
arr[2] : 3
1 2 3 0 0 0 0 0 0 0
arr �迭�� 0��° �� :  1
arr �迭�� 1��° �� :  2
arr �迭�� 2��° �� :  3
arr �迭�� 3��° �� :  0
arr �迭�� 4��° �� :  0
arr �迭�� 5��° �� :  0
arr �迭�� 6��° �� :  0
arr �迭�� 7��° �� :  0
arr �迭�� 8��° �� :  0
arr �迭�� 9��° �� :  0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/