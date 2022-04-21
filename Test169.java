/* ========================================================================
	    ¡á¡á¡á ÄÃ·º¼Ç ÇÁ·¹ÀÓ¿öÅ©(Collection Framework) ¡á¡á¡á
=========================================================================*/

// String[] ¡æ List : Arrays.asList()
// List ¡æ String[] : List.toArray()

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test169
{
	public static void main(String[] args)
	{
		List<String> mList = new ArrayList<String>();
		mList.add("1");
		mList.add("2");
		mList.add("3");
		
		// ®c!
		// List ¡æ String[]
		String[] sArrays = mList.toArray(new String[mList.size()]);
		for (String s : sArrays )
			System.out.print(s + " ");
		System.out.println();
		// 1 2 3

		// ®c!@
		// String[] ¡æ List
		List<String> mNewList = Arrays.asList(sArrays);
		// ¡Ø ¡ºArrays.asList()¡»ÀÇ ¹ÝÈ¯ ÀÚ·áÇüÀº List
		for (String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		// 1 2 3
	}
}