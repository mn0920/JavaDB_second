package Day4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num=10;
//		System.out.printf("num : %d\n", num);
//		/* printf에는 서식문자를 꼭 넣어줘야한다.
//		 * 서식문자
//		 * %d : 정수형
//		 * %f, F1f : 실수형
//		 * %c : 문자형
//		 * %s : 문자열
//		 * */
//		System.out.println("num : "+num);
		
		
		/* 조건문 
		 * if문, switch case문
		 * swuch case문으로 작성된건 전부 if문으로 바꿀 수 있다. 반대는 안 되지만
		 * 
		 * if(조건식){
		 * 		실행문1;
		 * }else if(조건식){
		 * 		실행문2;
		 * }else{
		 * 		실행문3;
		 * }*/
		
		/* 문제, 정수형 변수 num가 홀수이면 홀수입니다.
		 * 짝수이면 짝수입니다. 를 출력하는 코드를 작성*/
		
//		int num = 1;
//		if(num%2==0){ //조건식에서는 논리연산자나, 비교연산자를 사용한다.
//			System.out.println(num+"는 짝수입니다.");
//		}else{ //else if(num%2==1)
//			System.out.println(num+"는 홀수입니다.");
//		}
		
		/* switch(변수값){   값은 변수값과 똑같이 정수상수와 문자 상수만 올수있다.
		 * case 값1:
		 *      실행문1;
		 *      break;
		 * case 값2:
		 *      실행문2;
		 *      break;
		 * default :
		 *      실행문3;
		 * }
		 * */
//		int month = 2;
//		switch(month){
//		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
//			System.out.println("마지막날 : 31일");
//			break;
//		case 2 :
//			System.out.println("마지막날 : 28일");
//			break;
//		default :
//			System.out.println("마지막날 : 30일");
//		}
		
		
		/* for(1초기화;2조건식;4증감연산){
		 * 		3실행문;
		 * }     1,2,3,4 순으로 실행이 된다.
		 * 초기화는 반복문이 실행될 때, 처음 한 번만 실행
		 * 조건식이 참이면, 실행문, 증감연산, 조건식 비교 순으로 반복
		 * 조건식이 거짓이면 반복문 종료*/
		
		/*1부터 10까지 출력하는 코드를 작성*/
//		int = i;
//		for(i=1;i<=10;i++){
//			System.out.print(i+1+" ");
//		}
		
		/* 1부터 10까지의 합을 출력하는 코드를 작성하세요.*/
//		int i = 0;
//		int sum = 0;
//		for(i = 1; i<=10; i++){
//			sum = sum+i;
//		}System.out.println("1부터 10까지의 합 : "+sum);

		/* 정수 넘버가 소수인지 아닌지 판별하는 코드를 작성하세요.*/
		/* 반복문 변수 : i , 정수 : num 
		 * i가 1부터 num까지 하나씩 증가하여 반복문을 실행하는데,
		 * num을 i로 나누었을 때, 나머지가 0이면(i가 num의 약수이면)
		 * 약수의 갯수를 하나씩 증가한다. 반복문이 다 끝나고 나서
		 * 약수의 갯수가 2개이면 소수, 아니면 합성수로 출력*/
		
//		int cnt = 0;
//		int num = 10;
//		for(int i = 1; i<=num;i++){
//			if(num %i == 0)
//				cnt++;
//		}
//		if(cnt == 2){
//		System.out.println(num+"는 소수입니다.");
//		}else{
//			System.out.println(num+"는 합성수입니다.");
//		}
		
		/* 소수를 구하는 다른 방법
		 * 소수의 약수는 나를 제외한다면 1이다.
		 * 나를 제외한 약수 중 가장 큰 수가 1*/		
//		int i, num = 13, div = 0;
//		for(i=num-1; i>0; i--){
//			if(num % i == 0){
//				div = i;
//				break;
//			}
//		}
//		if(div == 1){
//			System.out.println(num+"는 소수");
//		}else{
//			System.out.println(num+"는 합성수");
//		}
	
		/* 최대 공약수를 구하는 코드를 작성하세요. */
		/*두 수 num1, num2, 반복문 변수 i, 공약수 gcd
		 * i가 1부터 num1까지 반복하고 i가 num1과 num2의 약수이면 공약수 변수에 i를 저장.
		 * 반복문이 다 종료된 후 공약수를 출력하면 그게 최대 공약수이다.*/
		
//		int num1 = 12, num2 = 8;
//		int gcd = 1; // 어떠한 최대 공약수이든 1보다 크거나 같기 때문이다.
//		int i = 1;
//		for(i = 2; i<=num1; i++){
//			if(num1%i == 0 && num2%i == 0){ //i가 num1의 약수이고 i가 num2의 약수이면
//				gcd = i;
//			}
//		}System.out.println(gcd+"는"+num1+"과"+num2+"의 최대공약수");
		
		/* 다른 방법 */
//		for(i=num1; i>=2; i--){
//			if(num1%i == 0 && num2%i == 0){
//				gcd = i;
//				break;
//			}
//		}System.out.println(gcd+"는 "+num1+"과 "+num2+"의 최대공약수");
		
		/* 문제 다음 코드를 실행 했을 때 반복횟수와 반복문 종료 후 i의 값은?
		 *  실행하지 말고 결과를 예상하세요*/
//		int i = 0;
//		int cnt = 0;
//		for(i = 0; i<10;i+=2){
//			cnt++;
//		}// 내 예상 = 4번 반복, 종료 후 i의 값 : 8
//		System.out.println("반복횟수 : "+cnt);
//		System.out.println("종료 후 i : "+i);
//		//답 : 반복횟수 : 5, 종료 후 i는 10
		
		
		/* 최소 공배수를 구하는 코드를 작성해보세요. */
//		num1의 배수들과 num2의 배수들 중에서 공통된 배수들 중에서 가장 작은 배수.
//		그럴려면 num1의 값이 있어야하겠고, num2의 값도 있어야하겠지.
//		그리고 for문을 진행할 i의 값도 있어야 하겠고.
//		최소 공배수는 아무리 못해도 num1과 num2를 곱한 수일테고.
		
		/* 두 수 : num1, num2
		 * 반복문 변수 : i
		 * 최소 공배수 : lcm
		 * i는 num1에서 num1*num2까지 num1씩 증가하면서 반복
		 * 반복문안에서 i가 num1의 배수이고, i가 num2의 배수이면
		 * lcm에 i를 저장하고 반복문을 강제 종료한다.
		 * 반복문이 종료되고 lcm을 출력하면 최소공배수가 출력된다.*/
		
//		int i = 1, num1 = 3, num2 = 9, lcm = 0;
//		for(i=num1;i<=num1*num2;i+=num1){
//			if(i%num1==0&&i%num2==0){ //i를 num1의로 나누었을 때 0이면, i(배수)를 num1(3)으로 나누었을 때 나머지가 0이면 i는 num1의 배수
//			lcm = i;
//			break;}
//		}System.out.println(lcm);

		/*
		 * ****
		 * ****
		 * ****
		 * ****
		 * */
		

//		for(int i=1;i<=4;i++){
//			for(int j=1;j<=4;j++){
//				System.out.print("*");
//			}System.out.println();
//		}
		

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print("*");
			}System.out.println();
		}

		System.out.println();
		
		
		/*
		 * *     i: 1, *의 갯수: 1
		 * **    i: 2, *의 갯수: 2
		 * ***   i: 3, *의 갯수: 3
		 * ****  i: 4, *의 갯수: 4
		 *       *의 갯수는 i개 만큼만 찍으면 된다.*/
		/* 밖의 for문이 세로, 안의 for문이 가로
		 * 안의 for문은 *찍고, *을 찍고나면 마지막에 줄바꾸기를 해야함*/
		
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println();

		
		/* i + 별의 갯수 = 6 = 6-1
		 * *****  i : 1   공백갯수: 0   별의 갯수: 5
		 *  ****  i : 2   공백갯수: 1   별의 갯수: 4
		 *   ***  i : 3   공백갯수: 2   별의 갯수: 3
		 *    **  i : 4   공백갯수: 3   별의 갯수: 2
		 *     *  i : 5   공백갯수: 4   별의 갯수: 1
		 * */
		
		for(int i=1;i<=5;i++){
			for(int j=0;j<=i-1;j++){
				System.out.print(" ");
			}for(int j=1;j<=6-i;j++){
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println();
		

		for(int i=1;i<=num;i++){
			for(int j=0;j<=i-1;j++){
				System.out.print(" ");
			}for(int j=1;j<=num+1-i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println();
		
		/* i + 별의 갯수 = 6 = 6-1
		 * *****  i : 5   공백갯수: 0   별의 갯수: 5
		 *  ****  i : 4   공백갯수: 1   별의 갯수: 4
		 *   ***  i : 3   공백갯수: 2   별의 갯수: 3
		 *    **  i : 2   공백갯수: 3   별의 갯수: 2
		 *     *  i : 1   공백갯수: 4   별의 갯수: 1
		 *                    5(num)-i             i
		 * */

		for(int i=num;i>=1;i--){
			for(int j=0;j<=num-i;j++){
				System.out.print(" ");
			}for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		

		System.out.println();
		
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){ // 이번엔 공백과 별을 합쳐서 num개 만큼만 찍기때문에, 공백과 별은 if가 함
				if(j<=i-1){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}System.out.println();
		}
		
		System.out.println();
		
		/*
		 *   *  1              공백의 갯수: 2   별의 갯수: 1
		 *  **  2              공백의 갯수: 1   별의 갯수: 2
		 * ***  3              공백의 갯수: 0   별의 갯수: 3
		 *  **  4              공백의 갯수: 1   별의 갯수: 2
		 *   *  5              공백의 갯수: 2   별의 갯수: 1
		 * num= 5  (num+1)/2    Math.abs(3-i)    3-Math.abs(3-i)
		 * */

		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=(num+1)/2;j++){
				if(j<=Math.abs((num+1)/2-i)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		/*
		 *   *  1  공백의 갯수: 2   별의 갯수: 1
		 *  **  2  공백의 갯수: 1   별의 갯수: 2
		 * ***  3  공백의 갯수: 0   별의 갯수: 3
		 * ***  4  공백의 갯수: 0   별의 갯수: 3
		 *  **  5  공백의 갯수: 1   별의 갯수: 2
		 *   *  6  공백의 갯수: 2   별의 갯수: 1
		 * */
		
	}
}
