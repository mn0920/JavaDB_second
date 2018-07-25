package Day5;

import java.util.Scanner;

public class MethodEx1 {
		// 메소드는 class안에만 있으면 된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메소드 : 특정 기능을 하도록 모아놓은 코드 
		 * 메소드 입력(매개변수)과 출력(리턴타입)이 필요하다.
		 * 그런데 상황에 따라서 입력과 출력이 필요 없을 수 도 있다.
		 * 메소드의 기본 형태
		 * public static void main(String[] args)
		 * [접근제한자(public)] [static] 출력(void) 메소드이름(main)(매개변수들(String[] args)){
		 * 		구현;
		 * }
		 * 자판기로 예시
		 * 기능(메소드)   : 음료 자판기
		 * 입력(매개변수) : 돈, 선택메뉴
		 * 출력(리턴타입) : 선택된 음료수
		 * */
//		 System.out.println("Hello world"); //입력은 있지만 출력은 없고
//		 Scanner scan = new Scanner(System.in);  //출력은 있지만 입력은 없다. 
//		 int num = scan.nextInt();
		 
		 /* 두 수와 연산자가 주어졌을 떄 산술연산을 하는 코드를 작성하세요. */

		 
		 int num1 = 3, num2 = 5;
		 char op = '/';
		 double res = 0.0;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("num1을 입력해주세요");
		 num1 = scan.nextInt();
		 System.out.println("num2을 입력해주세요");
		 num2 = scan.nextInt();
		 System.out.println("연산자를 입력하세요");
		 op = scan.next().charAt(0);
		 /* op가 +라면 
		  * num1과 num2를 더한 후 그 결과를 res에 저장한다.
		  * op가 +가 아니라 - 라면 
		  * num1과 num2를 뺀 후 그 결과를 res에 저장한다.
		  * op가 +, -도 아니고 * 라면 
		  * num1과 num2를 곱한 후 그 결과를 res에 저장한다.
		  * op가 +, -, *도 아니고 %라면
		  * num1을 num2 나눈 나머지를 res에 저장한다.
		  * op가 +, -, *도 아니고 /라면
		  * num1을 num2 나눈 나눈 후 res에 저장한다.*/
//		 if(op == '+'){
//			 res = num1 + num2;			 
//		 }else if(op == '-'){
//			 res = num1 - num2;
//		 }else if(op == '*'){
//			 res = num1 * num2;
//		 }else if(op == '%'){
//			 res = num1 % num2;
//		 }else if(op == '/'){
//			 res = (double)num1 / num2;
//		 }else{
//			 System.out.println("연산자를 잘못입력하였습니다.");
//		 }
//		위에 있는 것을 지웠는데 작동이 된다는 것은 우리가 만든 메소드가 일을 한다는 증거임!
		 res = calculate(num1, num2, op);
		 //num1, num2, op(매개변수)
		 //res (리턴타입)
		 System.out.println(""+num1+op+num2+"="+res);	 
	}
		 
		 // 접근제한자 메소드이름(매개변수들){
		 //     구현
		 //  }
		 public static double calculate(int num1, int num2, char op){
			 double res = 0.0;
			 if(op == '+'){
				 res = num1 + num2;			 
			 }else if(op == '-'){
				 res = num1 - num2;
			 }else if(op == '*'){
				 res = num1 * num2;
			 }else if(op == '%'){
				 res = num1 % num2;
			 }else if(op == '/'){
				 res = (double)num1 / num2;
			 }else{
				 System.out.println("연산자를 잘못입력하였습니다.");
			 }			 
			 return res;
		 }
}
