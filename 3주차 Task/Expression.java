import java.util.Scanner;

public class Expression {
	public static void main(String[] args) {
		System.out.println("hw5_1: ������");
		System.out.println("***************************");
		System.out.println("���ϸ�: Expression.java");
		System.out.println("�ۼ���: ������");
		System.out.println("�ۼ���: 21.03.31");
		System.out.println("***************************");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //���� x�� �Է¹���.
		int y = sc.nextInt(); //���� y�� �Է¹���.
		int z = sc.nextInt(); //���� z�� �Է¹���.
		
		boolean x1 = (x!=0); 
		boolean x2 = (x%2==0);
		boolean x3 = (x>y) && (x<z);
		int x4 = x%y;
		int x5 = x<<y;
		
		System.out.print("x�� 0�̴�. : ");
		//'x�� 0�̴�'�� �ش��ϴ� ���ǹ� ����
		if (x1==true) {
			System.out.println(x1);
		}else {
			System.out.println(x1);
		}
		
		System.out.print("x�� ¦���� �ƴϴ�. : ");
		//'x�� ¦���� �ƴϴ�.'�� �ش��ϴ� ���ǹ� ����
		if (x2==true) {
			System.out.println(x2);
		}else {
			System.out.println(x2);
		}
		
		System.out.print("x�� y���� ũ�� z���� �۴�. : ");
		//'x�� y���� ũ�� z���� �۴�.'�� �ش��ϴ� ���ǹ� ����
		if (x3==true) {
			System.out.println(x3);
		}else {
			System.out.println(x3);
		}
		
		//'x�� y�� ���� ������'�� ����ϴ� ����
		System.out.print("x�� y�� ���� ������  : ");
		System.out.println(x4);
		//'x�� y��Ʈ��ŭ �������� ����Ʈ'�� ����� ����ϴ� ����
		System.out.print("x�� y��Ʈ��ŭ �������� ����Ʈ  : ");
		System.out.println(x5);
		

	}

}
