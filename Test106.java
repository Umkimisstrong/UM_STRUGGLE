/* ===================================================
    ���� �޼ҵ� �ߺ�����(Method Overloading) ����
====================================================*/
// Method Overloading�� ������ ���¿� �Ұ����� ����

public class Test106
{
	public static void main(String[] args)
	{
		
		
	}

	public static void print() {}
	//public static void print() {}    // -- (��)
	public static void print(int i) {}
	//public static void print(int j) {}  // -- (��)
	public static void print(char c) {}  // �Ǳ� �Ǵµ� �ڵ� ����ȯ ��Ģ�� Ȯ���ؾ���
	public static void print(int i, int j) {}
	public static void print(double d) {}
	//public static void print(double e) {return 10.0}    // -- ���� �Ұ�
	//public static double print(double e) {return 10.0;} // -- (��) check ~!!!
	

}