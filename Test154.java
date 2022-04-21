/* ====================================
    ■■■ 예외(Exception) 처리 ■■■
=====================================*/

// 잡은 예외 다시 던지기

// 잡은 예외를 다시 던지는 이유 :::::
// 
public class Test154
{
	public static void main(String[] args)	
	{
		Test154 ob = new Test154();
		try
		{
			int a = ob.getValue(-2);	// ⑦ 예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)				// ⑧ 예외 잡아내기
		{
			// ⑨ 잡아낸 예외 처리
			System.out.println("ⓑ printStackTrace...................");
			e.printStackTrace();
		}
	}

	public int getData(int data)	throws Exception
	{
		if (data < 0)
		{
			throw new Exception("data 가 0보다 작습니다.");
			// ① 예외 발생
		}
		return data + 10;
	}
									// ⑥ 잡아낸 예외를 다시 발생시킨 것을 던지기 가능하도록 처리
	public int getValue(int value)	throws Exception
	{
		int a = 0;
		try
		{
			a = getData(-2);	// ② 예외 발생
		}
		catch (Exception e)		// ③ 예외 잡아내기
		{
			// ④ 잡아낸 예외에 대한 처리
			System.out.println("ⓐ printStackTrace.....");
			e.printStackTrace();
			// check ~!!
			// ⑤ 잡아낸 예외를 다시 발생시키기
			throw e;
			//-- 
		}
		return a;
	}
}

