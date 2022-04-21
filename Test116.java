/*====================================
	  ���� Ŭ���� ��� ����
====================================*/

// ���(Inheritance)

/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư¡
   - �� �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.

   - �� �ݵ�� ��� ���谡 �־�� �Ѵ�.

   - �� �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
     ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	 ���� ���, ���� Ŭ������ �޼ҵ� �������������ڰ� ��protected���� ���
	 ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	 ���� Ŭ���� �޼ҵ��� �������������ڴ� ��protected�� �Ǵ� ��public�� �̾�� �Ѵ�.

                                  ��> ������ü�� �Ұ�
                                ---------
   - �� ��static��, ��final��, ��private�� �޼ҵ�� �������̵�(Overriding)�� �� ����.
         --------   -------
	ź������<��		  ��> ��ӽ����ٶ� ������Ų��.

   - �� Exception �� �߰��� �Ұ��� �ϴ�.
     ��, ���� �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	 ���ο� Exception�� �߰��ϴ� ���� �Ұ��� �ϴ�.
*/

// �θ�, ���� super Ŭ����
class SuperTest116
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
}


// �ڽ�, ���� sub Ŭ����
class SubTest116 extends SuperTest116
{

	/*
	private int a = 5;    ----------- X                          
	--------------------------- ��� ��� ------------------------
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
	*/
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c);  ����   error: a has private access in SuperTest116

		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);

		//System.out.println("Sub print() �޼ҵ� : " + b);  = 100
		//System.out.println("Sub print() �޼ҵ� : " + this.b); = 100
		//System.out.println("Sub print() �޼ҵ� : " + super.b); = 10
		//- ���� b �� ���� ����� ���� �ٸ� b �� ���� �� ����� �̷������.
		//  ���� Ŭ�������� ����� b, ���� Ŭ�������� ����� b

		// System.out.println("Sub print() �޼ҵ� : " + c); = 20
		// System.out.println("Sub print() �޼ҵ� : " + this.c); = 20
		// System.out.println("Sub print() �޼ҵ� : " + super.c); = 20
		//- ���� c �� �����ϴµ� �ƹ��� ����� ������ ����.
		//  ����Ŭ�������� ����� c
	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() �޼ҵ� : " + a + " : " + b + " : " + c);
		//-- ����Ŭ�������� ����� ���� a ���� ������ �� ����.
		//   private a(�������������� ����)
		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);
	}
}


// main () �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test116
{
	public static void main(String[] args)
	{

		// ���� Ŭ����(SubTest116) �ν��Ͻ� ����
		SubTest116 st = new SubTest116();
		st.print();
		// Sub print() �޼ҵ� : 100 : 20

		st.write();
		// Super write() �޼ҵ� : 5 : 10 : 20
		// Sub write() �޼ҵ� : 100 : 20
		
		System.out.println("---------------------------------------------- ���м�");

		System.out.println(st.b);
		// 100
		
		System.out.println(((SuperTest116)st).b);
		// 10

		((SuperTest116)st).write();
		// Sub write() �޼ҵ� : 100 : 20

		// ������(���ۺθ�).... �ܺ� Ŭ�������� �θ�Ŭ������ ���� ȣ�Ⱑ��, �θ�Ŭ������ �޼ҵ�� ȣ��Ұ���
		// �޼ҵ� : ������ �ȉ�
		// ���� : ������ ��
	}
}