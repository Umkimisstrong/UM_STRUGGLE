/* ====================================
    ■■■ 예외(Exception) 처리 ■■■
=====================================*/

// Test152.java 파일과 비교

// ※ throw	(예외를 발생시킬때 쓰는것)	cf ) throws (예외를 없앨때 쓰는것)


class Demo
{
	private int value;

	public void setValue(int value)	throws Exception
	{
		if (value <= 0)
		{
			//return;		// 메소드 종료의 return
			throw new Exception("치킨은 맛있다.");

		}
		this.value = value;
	}


	public int getValue()
	{
		return value;
	}

}

public class Test153
{
	public static void main(String[] args)	// throws Exception
	{
		Demo ob = new Demo();
		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);		
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}