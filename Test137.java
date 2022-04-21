/* ===================================================
      �� �� ��  �ڹ��� �ֿ�(�߿�) Ŭ���� �� �� ��
====================================================*/

// Wrapper Ŭ����  

public class Test137
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		/*
		2147483647
		-2147483648
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/


		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		/*
		9223372036854775807
		-9223372036854775808
		*/


		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		/*
		1.7976931348623157E308
		4.9E-324
		*/

		System.out.println();

		System.out.println("1 : " + 3.0/0);
		// 1 : Infinity
		System.out.println("2 : " + -3.0/0);
		// 2 : -Infinity
		
		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		/*
		3 : true
		4 : false ( ���� ���Ѱ� ���� ������ �ٸ���)
		*/

		// ��Double.isInfinite()�� �������� �ƴ��� Ȯ���ϴ� �޼ҵ�
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		// 5 : true ( ���� ���ѵ� �����̴� )
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		// 6 : true ( ���� ���ѵ� �����̴� )

		System.out.println("7 : " + (3.0/0 + -3.0/0));
		// 7 : NaN     (�� Not a Number)
		System.out.println("8 : " + (0.0/0));
		// 8 : NaN

		System.out.println("9 : " + (0.0/0 == 0.0/0));
		// 9 : false
		// �� NaN(Not a Number) ���� ������ ����
		//    �� == �� �� �����ڸ� ���� �� ������ �����ϰ� �Ǹ�
		//    ����� ������ �� false ���� ��ȯ..
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		// 10 : true


		// ��Double.isNaN()�� NaN���� �ƴ��� Ȯ���ϴ� �޼ҵ�
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.1+2.2));
		/*
		11 : true
		12 : false		
		*/


	}
}