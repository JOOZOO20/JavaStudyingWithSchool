package hw07;

//***************************
//파일명: Car2.java
//작성자: 차희주
//작성일: 2021.04.15
//내용: p.151 CarTest.java 예제를 참고하여
//자동차 클래스 Car2를 다음과 같이 정의하고 이용하는 프로그램을 작성하는 문제의 Car2.java파일이다.
//***************************

public class Car2 {
	
	String color; //색상
	int speed; //현재 속도
	int gear; //현재 기어
	
	void print() {
		System.out.println("("+color+","+speed+","+gear+")");
	}	// 색상, 현재 속도, 현재기어 정보를 출력하는 메소드 print를 선언
	
	int speedUp() {
	    speed+=1;
	    return speed;
	}	// 속도를 1 증가하고 변경된 속도를 리턴하는 속도증가(speedUp)메소드 선언	
	
	int speedDown() {
		 if (speed!=0) {
			speed-=1;
			return speed;
		}else {
			return speed;
		}
	}	//  속도를 1 감소하고 변경된 속도를 리턴(원래 속도가 0이면 감속하지 말고 그대로 0)하는 속도감소(speedDown)메소드 선언
	
	int changeGear(int userGear) {
		gear=userGear;
		return gear;
	} // 매개변수로 받은 값으로 기어를 변경하고 기어를 리턴하는 기어변속(changeGear)메소드 선언

}
