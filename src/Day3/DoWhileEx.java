package Day3;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		do while 문의 특징
		do{
				실행문;
				증감연산;
		}while(조건식);
		
		- 조건식이 참이든 거짓이든 상관없이 무조건 한 번은 실행한다.
*/		
		/* 무조건 한 번은 실행해야할 필요가 있을 떄 사용하고, 잘 사용하지 않는게 좋다. */
		
		char mode = 'q';
		Scanner scan = new Scanner(System.in); //ctrl+shife+o - 간편하게 인폴트 하는 방법
		do{
			System.out.println("메뉴");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 출력");
			System.out.println("q. 프로그램 종료");
			System.out.println("메뉴를 선택하세요");
			mode = scan.next().charAt(0);
		}while(mode != 'q');
		

	}

}
