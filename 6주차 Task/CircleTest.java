
//***************************
// ���ϸ�: CircleTest .java
// �ۼ���: ������
// �ۼ���: 2021.04.22
// ����: ���� ��Ÿ���� Circle Ŭ������ �����ϰ� �̸� �̿��ϴ� ���α׷��� ���� Ŭ����
//***************************

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("hw8_1: ������");
		Circle circle1 = new Circle(); //Circle�� ��ü circle1 ����
		Circle circle2 = new Circle(); //Circle�� ��ü circle2 ����
		
		//circle1�� �������� 1.2, ��ǥ�� (3, 4)�� ����
		circle1.setR(1.2); 
		circle1.setX(3); 
		circle1.setY(4); 
		
		//circle2�� �������� -1.2, ��ǥ�� (-3, -4)�� ����
		circle2.setR(-1.2);
		circle2.setX(-3);
		circle2.setY(-4);
		
		//circle1�� x������ 10, y������ 20��ŭ �̵�
		circle1.moveX(10);
		circle1.moveY(20);
		
		// circle2�� x������ 10, y������ 20��ŭ �̵�
		circle2.moveX(10);
		circle2.moveY(20);

		// circle1, circle2 ���� ������ ���� x, y��ǥ�� ������ ����� �˾Ƴ��� ���
		System.out.println("circle1�� ����: "+circle1.area()+", ��ǥ: ("+circle1.getX()+", "+circle1.getY()+")");
		System.out.println("circle2�� ����: "+circle2.area()+", ��ǥ: ("+circle2.getX()+", "+circle2.getY()+")");
		

	}

}


