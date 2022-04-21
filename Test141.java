/*=================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
===================================*/

//StringBuffer 클래스

public class Test141
{
	public static void main(String[] args)
	{
		String s1 = "123456789";
		s1 = (s1 +"123").replace('2', 'A');
		System.out.println(s1);
		// 123456789
		// 123456789123
		// 1A34567891A3


		StringBuffer s2 = new StringBuffer("123456789");
		s2.delete(0,3).replace(1,3,"24").delete(4,6);
		//123456789.delete(0,3).replace(1,3,"24").delete(4,6);
		//456789.replace(1,3,"24").delete(4,6);
		//424789.delete(4,6);
		//4247
		
		System.out.println(s2);//4247

		StringBuffer s3 = new StringBuffer("123456789");
		String s4 = s3.substring(3,6);
		//123456789.substring(3,6); 인덱스 3부터 6전까지
		System.out.println(s4);
		//456

		StringBuffer s5 = new StringBuffer("123456789");
		s5.delete(0,3).delete(1,3).delete(2,5).insert(1,"24");
		//"123456789".delete(0,3).delete(1,3).delete(2,5).insert(1,"24");
		// 456789.delete(1,3).delete(2,5).insert(1,"24");
		// 4789.delete(2,5).insert(1,"24");
		// 47.insert(1,"24");
		// 4247

		System.out.println(s5);
		//4247
	
	}
}