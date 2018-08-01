package Day6;

import java.util.Scanner;

import jdk.nashorn.internal.ir.GetSplitState;

public class BaseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 숫자 야구 게임의 룰 컴퓨터 vs 사용자
		 * 컴퓨터는 문제를 출제 : 랜덤으로 1~9사이의 중복되지 않는 숫자 3개를 선택 
		 * 사용자 : 컴퓨터가 선택한 숫자 3개를 순서와 함께 맞춰야 한다. 
		 * EX) 컴퓨터 : 135(답)
		 *     사용자 : 125
		 *     컴퓨터 : 1S1B
		 *     사용자 : 248
		 *     컴퓨터 : 3 out
		 *     사용자 : 135
		 *     컴퓨터 : 3S
		 *              정답입니다.
		 *              프로그램을 종료하겠습니다.
		 *     S : 해당 숫자가 있고 해당 순서가 일치할 때
		 *     B : 해당 숫자가 있고 해당 순서가 일치하지 않을 때 */
		
		int com[] = createRandomArray(1/* min */, 9/* max */, 3/* size */);
		int user[] = new int[3];
		int ball = 0;
		int strike = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("정답");
		printArray(com);
		
		while(strike != 3){
			System.out.print("숫자 3개를 띄어쓰기하여 입력하세요.");
			user[0] = scan.nextInt();
			user[1] = scan.nextInt();
			user[2] = scan.nextInt();
			
			strike = getStrike(com, user);
			ball = getBall(com, user);
			
			printResult(strike, ball);
			
		}
		scan.close();
		System.out.println("정답입니다.");
		System.out.println("프로그램을 종료합니다.");
	
	}
	
	public static int randomInt(int min, int max){
		if(min > max){
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	public static int isDuplicate(int arr[], int num, int cnt){
		if(cnt > arr.length){
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++){
			if(arr[i]==num){
				return i;
			}
		}
		return -1; //-1번지라는 개념은 없기 때문에
	}
	
	public static int[] createRandomArray(int min, int max, int size){
		if(min > max){
			return null;
		}
		if(max-min+1 < size){
			return null;
		}
		if(size < 0){
			return null;
		}
		int arr[] = new int[size];
		int cnt = 0;
		for(; cnt<arr.length; ){
			int tmp = randomInt(min, max);
			if(isDuplicate(arr,tmp,cnt) == -1){
				arr[cnt] = tmp;
				cnt++;  
			}
		}
		return arr;
	}
	
	public static void printArray(int arr[]){
		for(int tmp:arr){
			System.out.printf("%2d ", tmp);
		}
		System.out.println();
	}
	
	/* 스트라이크가 몇개인지 확인하는 메소드를 생성하세요.
	 * 메소드명 : getStrike
	 * 매개변수 : int com[], int user[]
	 * 리턴타입 : int */
	public static int getStrike(int com[], int user[]){
		int cnt = 0;
		for(int i = 0; i<com.length; i++){
/*			if(com[i] == user[i]){
				cnt++
*/			if(isDuplicate(com, user[i], com.length) == i){
				cnt++;
			}
		}
		return cnt;
	}

	/* 볼이 몇개인지 확인하는 메소드를 생성하세요.
	 * 메소드명 : getBall
	 * 매개변수 : int com[], int user[]
	 * 리턴타입 : int */
	public static int getBall(int com[], int user[]){
		int cnt = 0;
		for(int i = 0; i < com.length; i++){
			int tmp = isDuplicate(com, user[i], com.length/* =3 */);
			if(tmp != -1 && tmp != i){ // tmp != 1 :  값은 있지만 tmp != i 위치가 맞지 않을 때
				cnt++;
			}
		}
		return cnt;
	}
	
	
	public static void printResult(int strike, int ball){
		if(strike != 0){
			System.out.print(strike+"S");
		}
		if(ball != 0){
			System.out.print(ball+"B");
		}
		if(strike == 0 && ball == 0){
			System.out.print("3O");
		}
		System.out.println();
	}
	
}
