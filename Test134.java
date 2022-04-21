/* ===================================================
      ¡á ¡á ¡á  ÀÚ¹ÙÀÇ ÁÖ¿ä(Áß¿ä) Å¬·¡½º ¡á ¡á ¡á
====================================================*/

// Wrapper Å¬·¡½º

import java.math.BigInteger;


public class Test134
{
	public static void main(String[] args)
	{
		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		
		//BigInteger c = a + b;
		//System.out.println(c);	-- ¿À·ù

		// ´õÇÏ±â
		BigInteger c = a.add(b);
		System.out.println("µ¡¼À °á°ú : " + c);
		// µ¡¼À °á°ú : 246913578246913578

		BigInteger d = a.subtract(b);
		System.out.println("»¬¼À °á°ú : " + d);
		//»¬¼À °á°ú : 0

		BigInteger e = a.multiply(b);
		System.out.println("°ö¼À °á°ú : " + e);
		// °ö¼À °á°ú : 15241578780673678515622620750190521

		BigInteger f = a.divide(b);
		System.out.println("³ª´°¼À °á°ú : " + f);
		//³ª´°¼À °á°ú : 1
		
		BigInteger g = new BigInteger("2");
		System.out.println("2ÀÇ 3½Â : " + g.pow(3));
	


	}
}

/*
µ¡¼À °á°ú : 246913578246913578
»¬¼À °á°ú : 0
°ö¼À °á°ú : 15241578780673678515622620750190521
³ª´°¼À °á°ú : 1
2ÀÇ 3½Â : 8
*/