/* ===================================================
      �� �� ��  �ڹ��� �ֿ�(�߿�) Ŭ���� �� �� ��
====================================================*/

// �� Test128.java �� ��~!!

// import java.lang.*;
public class Test129	// extends Object
{
	/*
	...

	public String toString()
	{
		...;
	}

	...
	*/

	@Override
	public String toString()
	{
		return "�������� toString()...";
	}
	public static void main(String[] args)
	{
		Test129 ob = new Test129();

		System.out.println(ob.toString());
		//==> �������� toString()...

		System.out.println(ob);
		//==> �������� toString()...
	}
	
}