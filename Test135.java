/* ===================================================
      �� �� ��  �ڹ��� �ֿ�(�߿�) Ŭ���� �� �� ��
====================================================*/

// Wrapper Ŭ����  
import java.math.BigDecimal;

public class Test135
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		BigDecimal b = a.movePointLeft(3);	// �Ҽ����� �������� �̵�
		System.out.println("ó�� ��� : " + b);
		//ó�� ��� : 123456.789123456789
		
		// ������ ����(��ü �Ӽ� Ȯ�� , �ݿø�, ���� ���� ó���Ѵ�.)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println("ó�� ��� : " + c);
		// ó�� ��� : 1000.000000000

		//BigInteger ��ü�� ��ȯ
		System.out.println(a.toBigInteger());
		// ó�� ��� : 123456789

		
	}
}
/*
ó�� ��� : 123456.789123456789
ó�� ��� : 1000.000000000
123456789
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
