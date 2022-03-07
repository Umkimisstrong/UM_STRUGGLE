/* ================================
  ���� ������ (Operator) ����
================================= */

// ���� ������ == ���� ������

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader �� readLine() �� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
// ����, ���ǿ�����(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.


// ���� ��)
// ������ ���� �Է� : N1
// -N �� ����
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// ������ ���� �Է� : 257
// 257 �� ���
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// ������ ���� �Է� : 257
// 0 �� ��
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		/* --------------------------------------------------------------------------

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		String strResult;


		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		strResult = (a==0) ? "0" : ((a>0) ? "���" : "����");

		System.out.printf("%d �� %s\n", a, strResult);

		----------------------------------------------------------------------------- */

		// �ֿ� ���� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		String strResult;

		// ���� �� ó��

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		/*
		n�� 0���� ũ�� �� true	�� n�� ���
					   �� false �� n�� 0���� �۴� �� ture �� n�� ����
					   							  �� false �� n�� ��
		*/
		
		// (n>0) ? ("���") : ((n<0) ? ("����") : ("��") );
		// "���";
		// "����";
		strResult = (n>0) ? ("���") : ((n<0) ? ("����") : ("��") );
		// strResult = "���";
		// strResult = "����";
		// strResult = "��";



		// ���� ��� ���
		System.out.println(n + " �� " + strResult);




	}
}

// ���� ���

/*
������ ���� �Է� : 1
1 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : -1
-1 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*
������ ���� �Է� : 0
0 �� 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/