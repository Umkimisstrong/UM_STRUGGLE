/*==============================================
   �� �� �� ���� �帧�� ��Ʈ��(���) ����
==============================================*/

// ���� �����Ӱ� ��Ʈ�� �ϵ� ���� �帧�� ��Ʈ�� �ؾ��Ѵ�.
// if ��
// if ~ else �� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if~else��, ���ǿ�����, ����if(if�� ��ø),
//	  switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���,
//	  Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.


// �� ������ �Է¹޾� Ȧ��/¦�� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
//	  ��, ���� if ������ ����Ѵ�.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String res;
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(br.readLine());

		if(num%2==0 && num !=0)
		{
			res = "¦��";
		}
		else if (num%2!=0)
		{
			res = "Ȧ��";
		}
		else if (num == 0)
		{
			res = "0���ڳ�.. ��������";
		}
		else
			res = "�ֱ׷��ϴ�ü";

		System.out.println(">> ���.. : " + num + " �� " + res);


		
		


	}
}