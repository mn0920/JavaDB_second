package Day3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* 배열을 이용하여 학생 5명의 성적을 키보드를 통해 받고,
		 * 키보드를 통해 입력받은 점수를 출력하는 코드를 작성하세여*/
/*		1. 배열선언
		2. Scanner을 이용한 scan선언
		3. 반복문을 이용하여 학생 점수를 키보드로 받음
		4. 반복문을 이용하여 입력받은 학생의 점수를 출력*/
		int score[] = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < score.length; i++){//여기서는 무조건 i를 0으로 지정해주어야한다. 왜냐하면 배열을 0으로 잡아주었기 떄문에
			System.out.println("학생 "+(i+1)+"의 점수를 입력하세요 : ");
			score[i] = scan.nextInt();
		}
		for(int i = 0; i < score.length;i++){
			System.out.println("학생 "+(i+1)+"의 점수 : "+score[i]);
		}
		
		
		/* 학생들의 평균을 구하는 코드를 작성하세요 */
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < score.length; i++){ //score1.length = score1배열이 갖고 있는 길이
			sum = sum + score[i];  // sum += score[i]; 으로 줄여 쓸 수 있다.
			avg = avg + (double)score[i]/score.length; //avg += (double)score[i]/score.length; 으로 줄여쓸 수 있다.
		}
			System.out.println("학생들의 평균 점수 : " + sum/5.0);
			System.out.println("학생들의 평균 점수 : " + (double)sum/score.length);
			System.out.println("학생들의 평균 점수 : " + avg);
	}
	
		
		
}


