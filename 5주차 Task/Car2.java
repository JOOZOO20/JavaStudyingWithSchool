package hw07;

//***************************
//���ϸ�: Car2.java
//�ۼ���: ������
//�ۼ���: 2021.04.15
//����: p.151 CarTest.java ������ �����Ͽ�
//�ڵ��� Ŭ���� Car2�� ������ ���� �����ϰ� �̿��ϴ� ���α׷��� �ۼ��ϴ� ������ Car2.java�����̴�.
//***************************

public class Car2 {
	
	String color; //����
	int speed; //���� �ӵ�
	int gear; //���� ���
	
	void print() {
		System.out.println("("+color+","+speed+","+gear+")");
	}	// ����, ���� �ӵ�, ������ ������ ����ϴ� �޼ҵ� print�� ����
	
	int speedUp() {
	    speed+=1;
	    return speed;
	}	// �ӵ��� 1 �����ϰ� ����� �ӵ��� �����ϴ� �ӵ�����(speedUp)�޼ҵ� ����	
	
	int speedDown() {
		 if (speed!=0) {
			speed-=1;
			return speed;
		}else {
			return speed;
		}
	}	//  �ӵ��� 1 �����ϰ� ����� �ӵ��� ����(���� �ӵ��� 0�̸� �������� ���� �״�� 0)�ϴ� �ӵ�����(speedDown)�޼ҵ� ����
	
	int changeGear(int userGear) {
		gear=userGear;
		return gear;
	} // �Ű������� ���� ������ �� �����ϰ� �� �����ϴ� ����(changeGear)�޼ҵ� ����

}
