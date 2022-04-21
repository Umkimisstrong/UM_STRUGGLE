/*=========================
  ����Ŭ���� ��ޡ���
=========================*/

// �߻� Ŭ����(Abstract)

/*
�� �߻� Ŭ����(abstract)��

   ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
   ���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
   �޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.


�� ���� �� ����
	
	[��������������] abstract class Ŭ������
	{
		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
	}

�� Ư¡

    Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
	�� Ŭ������ Ŭ���� �տ� ��abstract��Ű���带 �ٿ�
	�߻� Ŭ������ ����ؾ� �ϸ�,
	�߻� Ŭ������ ������ ��쿡��
	�ҿ����� ������ Ŭ���� �̹Ƿ� ��ü�� ������ �� ����.
	�߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
	��ü�� ������ �� ���� ���̴�.

	��, �߻� Ŭ������ ���������� ������ �� ���� ������
	����� ���ؼ��� �����ϸ�
	�߻� Ŭ�������� ��ӹ��� ����Ŭ����������
	�ݵ�� �߻� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�.


�� ��abstract�� Ű�����
    Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� �������� ��� �Ұ��� �ϴ�.
*/



// �߻� Ŭ����
abstract class SortInt117
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	
	
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	
	protected final int compare(int i, int j)
	{
		int x= value[i];
		int y = value[j];
		if (x==y)
			return 0;

		else if (x>y)
		{
			return 1;
		}
		else
			return -1;
	}
	
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}

// SortInt117 ��ӹ޾Ƽ� �߻�Ŭ������ �Ǿ���.
// sorting() �� Override �ϸ� �������� ���ư���.
public  class Test117 extends SortInt117
{
	int i, j;
	static int[] data = {7, 10, 3, 8, 7};
	
	@Override
	public void sorting()
	{
		for (i = 0;i<dataLength()-1 ;i++ )
		{
			for (j=i+1;j<dataLength() ;j++ )
			{
				if (compare(i, j)>0)
				{
					swap(i, j);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n : data )
			System.out.printf("%4d", n);
		System.out.println();
		

		Test117 ob = new Test117();
		ob.sort(data);



		System.out.print("Sorted Data : ");
		for (int n : data )
			System.out.printf("%4d", n);
		System.out.println();
	}
}