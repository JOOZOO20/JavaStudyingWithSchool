
//***************************
// ���ϸ�: Circle .java
// �ۼ���: ������
// �ۼ���: 2021.04.22
// ����: ���� ��Ÿ���� Circle Ŭ������ �����ϰ� �̸� �̿��ϴ� ���α׷��� java ����
//***************************

public class Circle {
	private double r; //�������� ��Ÿ���� ���� r ���� 
	private double x; //x ��ǥ�� ��Ÿ���� ���� x ���� 
	private double y ;//y ��ǥ�� ��Ÿ���� ���� y ���� 
	
	// r���� ���� setter �޼ҵ�
	public double setR(double r) {
		if (r>0){
			this.r=r;
		}else {
			this.r=1.0;
		}
		return this.r;
	}
	// x���� ���� setter �޼ҵ�
	public double setX(double x) {
		this.x=x;
		return this.x;
	}
	// y���� ���� setter �޼ҵ�
	public double setY(double y) {
		this.y=y;
		return this.y;
	}
	
	//x�� ���� getter�޼ҵ�
	public double getX() {
		return this.x;
		}
	//y�� ���� getter�޼ҵ�
	public double getY() {
		return this.y;
	}
	
	// �����̵��� x���� ���� move �޼ҵ�
	public double moveX(double x) {
		this.x+=x;
		return this.x;
	}
	// �����̵��� y���� ���� move �޼ҵ�
	public double moveY(double y) {
		this.y+=y;
		return this.y;
	}
	
	// ������ ����ϴ� area �޼ҵ�
	public double area() {
		return 3.14*r*r;
	}

	
	
}
