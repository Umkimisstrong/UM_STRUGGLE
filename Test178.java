/* ===========================================
     ■■■ 자바의 기본 입출력(I/O) ■■■
=========================================== */

// Reader Writer 실습

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;


public class Test178
{
	public void process(InputStream is)
	{
		int data;
		System.out.println("문자열 입력(종료 : Ctrl+z)");

		try
		{
			// 핵심 ↓
			Reader rd = new InputStreamReader(is);		// is = System.in(매개변수)
														// InputStreamReader에 태워서
														// Reader(문자기반) 의 객체로 만든다.  (입력)태울 준비
			Writer wt = new OutputStreamWriter(System.out);	// OutputStreamWriter에 태워
			// 핵심	↑										// Writer(문자기반)의 객체로 만든다. (출력)태울 준비
			while ((data = rd.read()) != -1)	// 문자기반의 문자가 null 값이 아니면
			{
				wt.write(data);					// Writer의 객체에 태우고
				wt.flush();						// 태운걸 밖으로 밀어준다.(출력)
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		
	}

	public static void main(String[] args)
	{	
		Test178 ob = new Test178();
		ob.process(System.in);
	}
}

/*
문자열 입력(종료 : Ctrl+z)
123123
123123
나는
나는
바보다
바보다
^Z
계속하려면 아무 키나 누르십시오 . . .
*/