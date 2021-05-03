
//***************************
// 파일명: CircleTest .java
// 작성자: 차희주
// 작성일: 2021.04.22
// 내용: 원을 나타내는 Circle 클래스를 정의하고 이를 이용하는 프로그램의 메인 클래스
//***************************

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("hw8_1: 차희주");
		Circle circle1 = new Circle(); //Circle의 객체 circle1 생성
		Circle circle2 = new Circle(); //Circle의 객체 circle2 생성
		
		//circle1의 반지름을 1.2, 좌표를 (3, 4)로 설정
		circle1.setR(1.2); 
		circle1.setX(3); 
		circle1.setY(4); 
		
		//circle2의 반지름을 -1.2, 좌표를 (-3, -4)로 설정
		circle2.setR(-1.2);
		circle2.setX(-3);
		circle2.setY(-4);
		
		//circle1을 x축으로 10, y축으로 20만큼 이동
		circle1.moveX(10);
		circle1.moveY(20);
		
		// circle2도 x축으로 10, y축으로 20만큼 이동
		circle2.moveX(10);
		circle2.moveY(20);

		// circle1, circle2 에게 각자의 현재 x, y좌표와 면적을 물어보아 알아내어 출력
		System.out.println("circle1의 면적: "+circle1.area()+", 좌표: ("+circle1.getX()+", "+circle1.getY()+")");
		System.out.println("circle2의 면적: "+circle2.area()+", 좌표: ("+circle2.getX()+", "+circle2.getY()+")");
		

	}

}


