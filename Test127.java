/* ===================================
    �� �� ��  Ŭ���� ��� �� �� ��  
=================================== */

// ��ø Ŭ���� 

/*
�� Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)
   
   - awt �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
   - Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
     ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.


�� ���� �� ����
   
   new ���� Ŭ������ ������()
   {
	   �������������� �ڷ��� �޼ҵ�()
	   {
		   ...;
	   }
   };	�����ݷ�!! Ȯ���ض�
*/

class Test3	// extends Object
{
	
	/*
	Object Ŭ������ �����...

	public String toString()    �� Object�� �����ִ� ������ �޼ҵ�
	{
		...;
	}
	*/
	public Object getString()
	{
		return new Object()
		{
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};
	}
}
public class Test127
{
	public static void main(String[] args)
	{
		Test3 ob = new Test3();

		System.out.println(ob.toString());
		// ==>Test3@15db9742

		System.out.println(ob.getString());
		// �͸��� Ŭ����...

	}
}