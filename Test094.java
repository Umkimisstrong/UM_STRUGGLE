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
	A	B	C	D	E
	F	G	H	I	J
	K	L	M	N	O
	P	Q	R	S	T
	U	V	W	X	Y
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test094
{
	public static void main(String[] args)
	{
				// �迭�� �迭 ���� �� �ʱ�ȭ

		int [][] arr = new int[5][5];		// int �� �迭�� ����, �Ŀ� ��� �� ���������� ǥ��

				
		int n = 65;

		for (int i = 0;i<arr.length ;i++ )
		{
			for (int j = 0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
					n++;
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
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/