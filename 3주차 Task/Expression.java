import java.util.Scanner;

public class Expression {
	public static void main(String[] args) {
		System.out.println("hw5_1: 차희주");
		System.out.println("***************************");
		System.out.println("파일명: Expression.java");
		System.out.println("작성자: 차희주");
		System.out.println("작성일: 21.03.31");
		System.out.println("***************************");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //변수 x를 입력받음.
		int y = sc.nextInt(); //변수 y를 입력받음.
		int z = sc.nextInt(); //변수 z를 입력받음.
		
		boolean x1 = (x!=0); 
		boolean x2 = (x%2==0);
		boolean x3 = (x>y) && (x<z);
		int x4 = x%y;
		int x5 = x<<y;
		
		System.out.print("x는 0이다. : ");
		//'x는 0이다'에 해당하는 조건문 실행
		if (x1==true) {
			System.out.println(x1);
		}else {
			System.out.println(x1);
		}
		
		System.out.print("x는 짝수가 아니다. : ");
		//'x는 짝수가 아니다.'에 해당하는 조건문 실행
		if (x2==true) {
			System.out.println(x2);
		}else {
			System.out.println(x2);
		}
		
		System.out.print("x는 y보다 크고 z보다 작다. : ");
		//'x는 y보다 크고 z보다 작다.'에 해당하는 조건문 실행
		if (x3==true) {
			System.out.println(x3);
		}else {
			System.out.println(x3);
		}
		
		//'x를 y로 나눈 나머지'를 출력하는 문장
		System.out.print("x를 y로 나눈 나머지  : ");
		System.out.println(x4);
		//'x를 y비트만큼 왼쪽으로 시프트'한 결과를 출력하는 문장
		System.out.print("x를 y비트만큼 왼쪽으로 시프트  : ");
		System.out.println(x5);
		

	}

}
