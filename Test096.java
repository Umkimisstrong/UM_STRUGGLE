/*=====================
   ���� �迭 ����
=====================*/

// �迭�� �迭(2���� �迭)

// �� ����
//	  �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//	  ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//	  �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)

/*
	A	
	C	B	
	D	E	F	
	J	I	H	G	
	K	L	M	N	O

	00 
	10 11
	20 21 22
	30 31 32 33
	40 41 42 43 44

����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test096
{
	public static void main(String[] args)
	{
		char [][] arr = new char[5][5];

		char k = 'A';


		for (int i = 0;i < arr.length ;i++ )
		{
			for (int j = 0;j < arr[i].length ;j++ )
			{
				if (j>i)
				{
					arr[i][j] = ' ';
				}
				else
				{
					if (i%2!=0)				
					{
						arr[i][i-j] = k;		// �������� ���ĺ�ä���

					}
					else
					arr[i][j] = k;			
				k++;
				}
		
			}
		}

		for (int i = 0;i < arr.length ;i++ )
		{
			for (int j = 0;j < arr[i].length ;j++ )
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}

	}
}

// ���� ���

/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/