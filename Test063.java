/* ===============================================
	�� �� �� ���� �帧�� ��Ʈ��(���) �� �� ��	
=================================================*/

// �ݺ���(for ��) �ǽ�
// ���� for �� (�ݺ����� ��ø)�� Ȱ���� ����� �ǽ�

// �� ����
//	  ������ ���� ������ ��µ� �� �ֵ���
//	  �ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

//	  ���� ��)
/*
		*
	   **
	  ***
	 ****
	*****

*/
public class Test063
{
	public static void main(String[] args)
	{
	
		for (int a=0;a<=4 ;a++ )	// (��� �� ����) �� 5���ϴ� ����   
		{
			for (int j=4; j>=0; j--)	// ���� + '*' �� �����ϴ� ���� 
			{
				if(j>a)					// ������ 4 / 3 / 2 / 1 / 0 ����
					System.out.print(" ");
				else					//  '*'�� 1 / 2 / 3 / 4 / 5 ����
				{
				System.out.print("*");
				}
			}
			
		
		System.out.println();		
		}

	}
}

// ���� ���

/*
    *
   **
  ***
 ****
*****
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/