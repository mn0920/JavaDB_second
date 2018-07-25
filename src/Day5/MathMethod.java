package Day5;

import java.util.Scanner;

public class MathMethod {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* main메소드에 있는 num1, num2와
		 * GCD메소드에 있는 num1과 num2는 서로 다른 변수이다.*/
		
		/* 메소드를 사용하는 이유
		 * 1. 코드 중복을 최소화
		 * 2. 메소드를 재사용
		 * */
		
		/* 최대공약수를 구하는 코드를 작성하세요. */
		/* 1. 두 수의 약수를 구한다.
		 * 2. 약수는 나누어서 나머지가 0이 되는 수이다.
		 * 3. 두 수의 약수중 공통적인 수이면서 가장 큰 수=최대공약수*/
		int num1, num2;
		int gcd = 1;
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("num1의 값을 입력해주세요");
		num1 = scan.nextInt();
		System.out.print("num2의 값을 입력해주세요");
		num2 = scan.nextInt();
		
//		for(i=1;i<=num1;i++){
//			if(num1%i == 0 && num2 % i == 0){
//				gcd = i;
//			}
//		}
		gcd = GCD(num1, num2);
		System.out.println(num1+"과 "+num2+"의 최대공약수는 "+gcd);
		
//		int lcm = LCM(num1, num2);
//		System.out.println(num1+"과 "+num2+"의 최소공배수는 "+lcm);
		
		int lcm = LCM2(num1, num2);
		System.out.println(num1+"과 "+num2+"의 최소공배수는 "+lcm);
		
	}
	
	/* 1. 메소드명 : theGreatestCommonDenominator(GCD)
	 * 2. 매개변수 : num1, num2
	 * 3. 리턴타입 : int gcd
	 * */
	public static int GCD(int num1, int num2){
		int i;
		int gcd =1;
		for(i=1;i<=num1;i++){
			if(num1%i == 0 && num2 % i == 0){
				gcd = i;
			}
		}
		return gcd;
		}
		
		/* 1. 메소드명 : theLeastCommonMultiple(LCM)
		 * 2. 매개변수 : int num1, int num2
		 * 3. 리턴타입 : int
		 * 최소공배수 : lcm = A*B/gcd */		
	public static int LCM(int num1, int num2){
		int i = 0;
		for(i=num1; i<= num1*num2;i+=num1){
			if(i%num2==0){
				return i;
			}
		}
		return 1;
	}
	
	public static int LCM2(int num1, int num2){
		return num1*num2/GCD(num1,num2);
	}
	
}
