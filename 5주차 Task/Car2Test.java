package hw07;

//***************************
//���ϸ�: Car2Test.java
//�ۼ���: ������
//�ۼ���: 2021.04.15
//����: p.151 CarTest.java ������ �����Ͽ�
// �ڵ��� Ŭ���� Car2�� ������ ���� �����ϰ� �̿��ϴ� ���α׷��� �ۼ��ϴ� ������
// ���� Ŭ������ Car2Test.java�����̴�.
//***************************

public class Car2Test {

	public static void main(String[] args) {
		System.out.println("hw7_1: ������");
		
		Car2 myCar = new Car2(); // Car2�� ��ü ����
		
		myCar.color="red"; // myCar�� color �ʵ� ����
		myCar.speed=0; // myCar�� speed �ʵ� ����
		myCar.gear=1; // myCar�� gear�ʵ� ����
		myCar.print(); // myCar�� print�޼ҵ� ȣ��
		
		for(int i=0;i<20;i++) {
			myCar.speedUp();
		}myCar.print(); // myCar�� �ӵ����� �޼ҵ带 20�� ȣ���ϰ� ��ü�� print�޼ҵ带 ȣ����.
		
		myCar.changeGear(2);
		myCar.print(); // myCar�� ���� �޼ҵ带 ȣ���Ͽ� �� 2�� �����ϰ� ��ü�� print�޼ҵ带 ȣ����.
		
		for(int i=0;i<20;i++) {
			myCar.speedUp();
		}myCar.print(); // myCar�� �ӵ����� �޼ҵ带 20�� ȣ���ϰ� ��ü�� print�޼ҵ带 ȣ����.
		
		for(int i=0;i<50;i++) {
			myCar.speedDown();
		}myCar.print(); // myCar�� �ӵ����� �޼ҵ带 20�� ȣ���ϰ� ��ü�� print�޼ҵ带 ȣ����.
	}

}
