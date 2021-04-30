package hw07;

//***************************
//파일명: Car2Test.java
//작성자: 차희주
//작성일: 2021.04.15
//내용: p.151 CarTest.java 예제를 참고하여
// 자동차 클래스 Car2를 다음과 같이 정의하고 이용하는 프로그램을 작성하는 문제의
// 메인 클래스인 Car2Test.java파일이다.
//***************************

public class Car2Test {

	public static void main(String[] args) {
		System.out.println("hw7_1: 차희주");
		
		Car2 myCar = new Car2(); // Car2의 객체 생성
		
		myCar.color="red"; // myCar의 color 필드 변경
		myCar.speed=0; // myCar의 speed 필드 변경
		myCar.gear=1; // myCar의 gear필드 변경
		myCar.print(); // myCar의 print메소드 호출
		
		for(int i=0;i<20;i++) {
			myCar.speedUp();
		}myCar.print(); // myCar의 속도증가 메소드를 20번 호출하고 객체의 print메소드를 호출함.
		
		myCar.changeGear(2);
		myCar.print(); // myCar의 기어변속 메소드를 호출하여 기어를 2로 변경하고 객체의 print메소드를 호출함.
		
		for(int i=0;i<20;i++) {
			myCar.speedUp();
		}myCar.print(); // myCar의 속도증가 메소드를 20번 호출하고 객체의 print메소드를 호출함.
		
		for(int i=0;i<50;i++) {
			myCar.speedDown();
		}myCar.print(); // myCar의 속도감소 메소드를 20번 호출하고 객체의 print메소드를 호출함.
	}

}
