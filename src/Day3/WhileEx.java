package Day3;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		while문 조건
		초기화;
		While(조건식){
		 	실행문;
			증감연산;
		}*/
		
		int i = 1; //초기화
		while(i<=5){ // 조건식
			System.out.println("Hello World"); //실행문
			i++; //증감연산
		}

		// while문을 for문으로 바꾸기
		//초기화 부분을 조건식 앞에 가져다가 붙이기
		for(i = 1;i<=5;i++){ // 조건식
			System.out.println("Hello World"); //실행문
			//증감연산 부분을 조건식 뒤로 붙이기
		}
		
/*		표준입력
		표준입력을 사용하려면 Scanner라는 것을 만들어야한다.
		-> Scanner scan = new Scanner(System.in)
		Scanner를 작성하면 밑에 빨간색 줄이 나오는데,
		Scanner에 마우스를 가져다가 대서 "java.util"를 클릭한다.*/
		
/*		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("num = "+num);
		double num2 = scan.nextDouble();
		System.out.println("num2 = "+num2);
		char ch = scan.next().charAt(0);
		System.out.println("ch = "+ch);
		scan.close(); // Scanner를 끄는 역할을 한다.
*/		
		//next라는 것은 문자열을 입력받는 애다.
		
		Scanner scan = new Scanner(System.in);
		char mode = 'a';
		while(!(mode == 'q' || mode == 'Q')){
				System.out.print("프로그램을 종료하려면 q 또는 Q를 눌러주세요. : ");
				mode = scan.next().charAt(0);
			}
			System.out.println("프로그램을 종료합니다.");
			scan.close();
		
	}

}
