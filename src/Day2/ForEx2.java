package Day2;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1부터 10사이에 홀수만 출력하는 코드를 for문을 이용하여 작성하세요
		 * 
		 * 1. 반복문에 사용할 변수 i를 선언
		 * 2. 반복문은 i가 1부터 10까지 반복하며 i는 하나씩 증가한다.
		 * 3. i를 2로 나누었을 떄 나머지가 1과 같다면 i를 출력
		 * */
		
			//IF구문을 사용했을 때
		System.out.println("if구문 사용");
		int i = 1;
		for (i = 1; i <= 10; i++)
			if ((i %2) == 1){
				System.out.println(i);
			}
			
				//if구문을 사용하지 않았을 때
		{
		System.out.println("if구문 미사용");	
		for (i = 1; i <= 10; i+=2)
			System.out.println(i);
			}
		
		
		/*    1부터 10까지의 합을 구하는 예제를 작성하세요.
		 * 1. 반복문에서 사용할 변수 i와 합계를 저장할 변수 sum을 선언한다.
		 * 2. 반복문은 1부터 10까지 i가 하나씩 증가하며 반복한다.
		 * 3. sum에다가 i를 더해서 다시 sum에 저장한다.
		 * 4. 반복문이 종료되면 합계를 출력*/
		{
		int sum = 0;
		for (i = 1; i <= 10; i++){
			sum = sum + i;} //sum은 기존의 sum+i이다.(?)
			System.out.println("1부터 10까지의 합 : "+sum);
			}
		
		/*    구구단 7단을 출력하는 코드를 작성하세요.
		 * 출력예시
		 * 7 x 1 = 7
		 * 7 x 2 = 14 이런방식으로다가 쭉.*/
		
		
		int i1 = 0;
		for (i1 = 0; i1 <= 63; i1+=7){
			System.out.println("구구단 7단 : "+i1);
			}
		
		
		int x = 1;
		int y = 7;
		for (x = 1; x <= 9; x++){
			y = x * 7;
			System.out.println("7 X "+ x + "=" +y);
			}
		
		//쌤 답
		for (i=1; i<10;i++){
			System.out.println("7 X "+ i + "=" +7*i);
		}/* 저 int 선언을 안에다가 입력을 했기 때문에, (이를 지역변수라고한다)
		    저 반복문 안에서만 int값이 설정된다. 이 밖에서는 사용 안 됨*/
		
		}
	
	}
