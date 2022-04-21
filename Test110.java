/*==================================
  ���� ����(sort) �˰����� ����
==================================*/

/*
�� ����
   : �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
   : ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
     �� ���� ����... �˻��ϱ� ����

�� ������ ����
   : ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ����,  . . . . .

// ���� ����(Bubble Sort)

// ���� ��)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62		-- �������� �����ϰ�����.. �����ұ�?
*/
public class Test110
{
	public static void main(String[] args)
	{
	int [] a = {52, 42, 12, 62, 60};		
	
	/*
	52, 42, 12, 62, 60
	--  --
	42, 52, 12, 62, 60
	    --  --
	42, 12, 52, 62, 60
     		--  --   
	42, 12, 52, 60, 62
	----------------------- 1ȸ��
	42, 12, 52, 60, 62
	--  --
	12, 42, 52, 60, 62
	    --  --    
	12, 42, 52, 60, 62
		        --  --
	----------------------- 2ȸ��
	12, 42, 52, 60, 62
	--  --
	12, 42, 52, 60, 62
	    --  --
    ----------------------- 3ȸ��
	12, 42, 52, 60, 62

	*/




	for (int n  : a )
		System.out.printf("%4d", n);
	System.out.println();


	//-------------------------------------
	// Bubble Sort

	for (int i = 1 ; i < a.length ; i++)			// �ڿ��� �� ����� �ϳ��� �ٿ��ִ� ����
	{												//  1      2     3     4

		for (int j = 0; j < a.length-i ; j++ )		//  0123   012   01    0 (�񱳱����ڸ�) vs 1234    123    12    1
		{
			if (a[j] > a[j+1])
			{
				a[j] = a[j]^a[j+1]; 
				a[j+1] = a[j+1]^a[j];
				a[j] = a[j]^a[j+1];
				

				

			}
		}
		
	}


	for (int k  : a )
		System.out.printf("%4d", k);
	System.out.println();
	}
}

// ���� ��� 
/*
  52  42  12  62  60
  12  42  52  60  62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/