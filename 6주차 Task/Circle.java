
//***************************
// 파일명: Circle .java
// 작성자: 차희주
// 작성일: 2021.04.22
// 내용: 원을 나타내는 Circle 클래스를 정의하고 이를 이용하는 프로그램의 java 파일
//***************************

public class Circle {
	private double r; //반지름을 나타내는 변수 r 선언 
	private double x; //x 좌표를 나타내는 변수 x 선언 
	private double y ;//y 좌표를 나타내는 변수 y 선언 
	
	// r값에 대한 setter 메소드
	public double setR(double r) {
		if (r>0){
			this.r=r;
		}else {
			this.r=1.0;
		}
		return this.r;
	}
	// x값에 대한 setter 메소드
	public double setX(double x) {
		this.x=x;
		return this.x;
	}
	// y값에 대한 setter 메소드
	public double setY(double y) {
		this.y=y;
		return this.y;
	}
	
	//x에 대한 getter메소드
	public double getX() {
		return this.x;
		}
	//y에 대한 getter메소드
	public double getY() {
		return this.y;
	}
	
	// 평행이동한 x값에 대한 move 메소드
	public double moveX(double x) {
		this.x+=x;
		return this.x;
	}
	// 평행이동한 y값에 대한 move 메소드
	public double moveY(double y) {
		this.y+=y;
		return this.y;
	}
	
	// 면적을 계산하는 area 메소드
	public double area() {
		return 3.14*r*r;
	}

	
	
}
