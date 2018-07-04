package Day2;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*    정수의 약수를 구하는 코드를 작성하세요.
		 * 정수를 1부터 자기 자신까지 나누어서 나머지가
		 * 0이 되면, 그 수는 정수의 약수이다.
		 * 
		 * 1. 정수를 저장할 변수 num와 반복문에서 사용할 i를 선언한다.
		 * 2. i를 1부터 num까지 하나씩 증가하여 반복한다.
		 * 3. num을 i로 나누었을 때 나머지가 0이면 콘솔에 i를 출력한다.*/
		
		int num = 234, i = 0;
		System.out.print(num+"의 약수 : ");
		for(i=1; i<=num; i++){
			if(num % i == 0){
				System.out.print(i+" ");
				// println 에서 ln을 빼주면 엔터기능이 사라져서 가로로 나온다.
			}
		}
		System.out.println();
		
		/* 두 수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대공약수 : 두 수의 공약수 중 가장 큰 수
		 * 공약수 : 두 수의 약수중 공통인 약수
		 * 약수 : 나누어 떨어지는 수로 4의 약수는 1, 2, 4
		 * 8과 12의 최대 공약수
		 * 8 : 1, 2, 4, 8
		 * 12: 1, 2, 3, 4, 6, 12
		 * 8과 12의 공약수 : 1, 2, 4
		 * 8과 12의 최대 공약수 : 4
		 * 
		 * 1. 두 정수를 저장할 변수 num1과 num2를 선언
		 * 2. i는 1부터 num1까지 하나씩 증가하며 반복
		 * 3. num1을 i로 나누었을 때 나머지가 0이고,
		 *    num2를 i로 나누었을 때 나머지가 0이면
		 *    콘솔에 i를 출력한다.*/
		
		int num1 = 8;
		System.out.print(num1+"의 약수 : ");
		for(i=1; i<=num1; i++){
			if(num1 % i == 0){
				System.out.print(i+" ");
			}
		}
		
		System.out.println();

		int num2 = 12;
		System.out.print(num2+"의 약수 : ");
		for(i=1; i<=num2; i++){
			if(num2 % i == 0){
				System.out.print(i+" ");
			}
		}
		

		System.out.println();

		int gcd = 1; // gcd : 최대공약수라는 의미
		System.out.print(num1+"과 "+num2+"의 공약수 : ");
		for(i=1; i<=num1; i++){
			if(num1 % i ==0 && num2 % i == 0){
				gcd = i;
			}
		}		
		System.out.print(gcd);
		//최소공배수 : lcm
		

		System.out.println();

		
		
	}

}
