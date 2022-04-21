/*==============================
    ���� Ŭ���� ��� ����
==============================*/

// ���(Inheritance)

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5.00


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Aclass
{
	protected int x, y;
	protected char op;


	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
}


// Aclass �� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{
	/*
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
	*/

	Bclass()
	{
		
	}

	boolean input() throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



		System.out.print("������ �� ���� �Է�(���� ����) : ");	// "20 15"
		String temp = br.readLine();
		
		// �� ���ڿ�. ���ڿ�Ŭ������ ���� �޼ҵ�Ȱ�� ����
		//    ���ڿ�.subString / ���ڿ�.length .........

		//    ���ڿ�.split("������"); 
		//    ���ڿ�.split("\\s"); ��   // -- ������ : �������� ���
		//    ex) "10 20 30 40 50".split("\s");
		//      == ��ȯ �� {"10", "20", "30", "40", "50"} ��Ҹ� ���ڷ� ���ϴ� �迭

		//    ex) "010-1234-1234".split("-");
		//      == ��ȯ �� {"010", "1234", "1234"}



		String [] strArr = temp.split("\\s");

		if (strArr.length !=2)
			return false;
		// -- false�� ��ȯ�Ͽ� input() �޼ҵ� ����
		// �� ������ ������ ���
		// �Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
		// ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.


		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		if (op != '+' && op != '-' && op != '*' && op != '/')
		{
			return false;
		}


		return true;
	}// end of input()

	double calc()
	{


		double db = 0;

		/*
		switch (op)
		{
			case '+' : db = x + y; break;
			case '-' : db = x - y; break;
			case '*' : db = x * y; break;
			case '/' : db = (double)x / y; break
		}
		*/
	
		if (op == '+')
		{
			db = x+y;
		}
		else if (op == '-')
		{
			db = x-y;
		}
		else if (op == '*')
		{
			db = x*y;
		}
		else if (op == '/')
		{
			db=x/y;
		}


		return db;
	}// end of calc()
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test115
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input()) 
		{
			System.out.println("Error!!");
			return;
		}

		double result = ob.calc();

		ob.write(result);
	}
}