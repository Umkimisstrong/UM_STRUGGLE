/* ===========================================
     ＝＝＝ 切郊税 奄沙 脊窒径(I/O) ＝＝＝
=========================================== */

// Reader 叔柔

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test176
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in : 切郊 妊層 脊径 什闘顕 ≧ 郊戚闘 奄鋼 什闘顕
		// InputStreamReader : 郊戚闘 奄鋼 什闘顕 ≧ 庚切 奄鋼 什闘顕生稽
		//                   : 痕発背爽澗 蝕拝 呪楳
		// Reader            : 庚切 奄鋼 什闘顕 梓端

		Reader rd = new InputStreamReader(System.in);

		System.out.println("庚切伸 脊径(曽戟 : Ctrl+z)");

		while ((data = rd.read())!= -1)
		{
			ch = (char)data;
			//System.out.print(ch);
			System.out.write(ch);
		}
		// 庚切奄鋼生稽 石醸澗汽 庚切奄鋼生稽 窒径廃 井酔
		/*
		庚切伸 脊径(曽戟 : Ctrl+z)
		abcd
		abcd
		1234
		1234
		ぁいおし
		ぁいおし
		*/
	
		// 庚切奄鋼生稽 石醸澗汽 郊戚闘奄鋼生稽 窒径廃 井酔
		/*
		庚切伸 脊径(曽戟 : Ctrl+z)
		rkskfk
		rkskfk
		亜蟹?鐓?
		 ??D
		*/
	
	}
}