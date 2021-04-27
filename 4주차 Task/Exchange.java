import java.util.Scanner;

//***************************
		// 파일명: Exchange .java
		// 작성자: 차희주
		// 작성일: 21.04.08
		// 내용: [hw6_1] 금액 환산, 정수로 된 돈의 액수를 입력 받아 오만 원권, 만 원권, 오천 원권, 천 원권,
		// 500, 100, 50, 10, 1원짜리 동전 각 몇개로 변환되는지 출력하라.
		//***************************

public class Exchange {
	
	public static void main(String[] args) {
		
		System.out.println("hw6_1: 차희주");
		System.out.print("금액을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int charge = sc.nextInt(); //사용자의 금액을 charge 변수에 입력받음.
		int other = charge; //other 변수를 선언하고, charge금액과 동일하게함.
		charge/=50000;	//출력해야할 오만원권의 매수 계산
		
		//if문을 활용하여 매수가 0일 경우, 문자를 출력하지 않도록 함
		if (charge!=0) {
			System.out.println("오만원권 : "+charge+"매");
		}
		other%=50000; //other변수에 오만원권을 제외한 거스름돈을 남겨둠.
		
		
		charge=other/10000; //other변수에서 만원권의 매수를 계산함.
		if (charge!=0) {
			System.out.println("만원권 : "+charge+"매");
		}
		other%=10000; //other변수에 만원권을 제외한 거스름돈을 남겨둠.
		
		
		charge=other/5000; //other변수에서 오천원권의 매수를 계산함.
		if (charge!=0) {
			System.out.println("오천원권 : "+charge+"매");
		}
		other%=5000; //other변수에 오천원권을 제외한 거스름돈을 남겨둠.
		
		
		charge=other/1000; //other변수에서 천원권의 매수를 계산함.
		if (charge!=0) {
			System.out.println("천원권 : "+charge+"매");
		}
		other%=1000; //other변수에 천원권을 제외한 거스름돈을 남겨둠.
		
		
		charge=other/500; //other변수에서 오백원의 개수를 계산함.
		if (charge!=0) {
			System.out.println("오백원 : "+charge+"개");
		}
		other%=500; //other변수에 오백원 단위를 제외한 거스름돈을 남겨둠.
		
		
		charge=other/100; //other변수에서 백원의 개수를 계산함.
		if (charge!=0) {
			System.out.println("백원 : "+charge+"개");
		}
		other%=100; //other변수에 백원 단위를 제외한 거스름돈을 남겨둠.
		
		
		charge=other/50; //other변수에서 오십원의 개수를 계산함.
		if (charge!=0) {
			System.out.println("오십원 : "+charge+"개");
		}
		other%=50; //other변수에 오십원 단위를 제외한 거스름돈을 남겨둠.
		
		
		charge=other/10; //other변수에서 십원의 개수를 계산함.
		if (charge!=0) {
			System.out.println("십원 : "+charge+"개");
		}
		other%=10; //other변수에 십원 단위를 제외한 거스름돈을 남겨둠.
		
		
		charge=other/1; //other변수에서 일원의 개수를 계산함.
		if (charge!=0) {
			System.out.println("일원: "+charge+"개");
			
		}
		
		sc.close();
	}
			
}
		
		
		
