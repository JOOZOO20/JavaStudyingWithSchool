import java.util.Scanner;

//***************************
		// ���ϸ�: Exchange .java
		// �ۼ���: ������
		// �ۼ���: 21.04.08
		// ����: [hw6_1] �ݾ� ȯ��, ������ �� ���� �׼��� �Է� �޾� ���� ����, �� ����, ��õ ����, õ ����,
		// 500, 100, 50, 10, 1��¥�� ���� �� ��� ��ȯ�Ǵ��� ����϶�.
		//***************************

public class Exchange {
	
	public static void main(String[] args) {
		
		System.out.println("hw6_1: ������");
		System.out.print("�ݾ��� �Է��Ͻÿ� : ");
		Scanner sc = new Scanner(System.in);
		int charge = sc.nextInt(); //������� �ݾ��� charge ������ �Է¹���.
		int other = charge; //other ������ �����ϰ�, charge�ݾװ� �����ϰ���.
		charge/=50000;	//����ؾ��� ���������� �ż� ���
		
		//if���� Ȱ���Ͽ� �ż��� 0�� ���, ���ڸ� ������� �ʵ��� ��
		if (charge!=0) {
			System.out.println("�������� : "+charge+"��");
		}
		other%=50000; //other������ ���������� ������ �Ž������� ���ܵ�.
		
		
		charge=other/10000; //other�������� �������� �ż��� �����.
		if (charge!=0) {
			System.out.println("������ : "+charge+"��");
		}
		other%=10000; //other������ �������� ������ �Ž������� ���ܵ�.
		
		
		charge=other/5000; //other�������� ��õ������ �ż��� �����.
		if (charge!=0) {
			System.out.println("��õ���� : "+charge+"��");
		}
		other%=5000; //other������ ��õ������ ������ �Ž������� ���ܵ�.
		
		
		charge=other/1000; //other�������� õ������ �ż��� �����.
		if (charge!=0) {
			System.out.println("õ���� : "+charge+"��");
		}
		other%=1000; //other������ õ������ ������ �Ž������� ���ܵ�.
		
		
		charge=other/500; //other�������� ������� ������ �����.
		if (charge!=0) {
			System.out.println("����� : "+charge+"��");
		}
		other%=500; //other������ ����� ������ ������ �Ž������� ���ܵ�.
		
		
		charge=other/100; //other�������� ����� ������ �����.
		if (charge!=0) {
			System.out.println("��� : "+charge+"��");
		}
		other%=100; //other������ ��� ������ ������ �Ž������� ���ܵ�.
		
		
		charge=other/50; //other�������� ���ʿ��� ������ �����.
		if (charge!=0) {
			System.out.println("���ʿ� : "+charge+"��");
		}
		other%=50; //other������ ���ʿ� ������ ������ �Ž������� ���ܵ�.
		
		
		charge=other/10; //other�������� �ʿ��� ������ �����.
		if (charge!=0) {
			System.out.println("�ʿ� : "+charge+"��");
		}
		other%=10; //other������ �ʿ� ������ ������ �Ž������� ���ܵ�.
		
		
		charge=other/1; //other�������� �Ͽ��� ������ �����.
		if (charge!=0) {
			System.out.println("�Ͽ�: "+charge+"��");
			
		}
		
		sc.close();
	}
			
}
		
		
		
