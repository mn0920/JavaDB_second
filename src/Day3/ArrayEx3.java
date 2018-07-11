package Day3;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 정수의 약수를 배열에 저장하는 코드를 작성하세여.
		 * 배열을 10개짜리로 하고, 약수의 10개 이상인 수들은
		 * 10개 까지만 구한다.*/
		/*약수를 출력하는 코드를 작성하고, 출력하기 전에 배열에 집어넣으면 된다.*/
		/* 1.   필요한 변수 선언
		 * 1-1. 10개짜리 배열 div선언, 반복문 변수 i선언 정수 num선언
		 * 2.   i는 1부터 num보다 작거나 같을 때까지 하나씩 증가하면서 반복문 실행
		 * 3.   반복문 안에서는 i가 num의 약수이면 i를 출력
		 * 3-1. i가 num의 약수라는 의미는 num을 i로 나누었을 때 나머지가 0이라는 의미 */
		
		int div[] = new int[10]; // 1번
		int i = 0;
		int num = 12;
		int cnt = 0; // 약수의 갯수를 저장하는 변수
		i = 1; // 2번
		while(i<=num){
			if(num % i ==00){
//				System.out.println(i);
				div[cnt] = i; // 약수 i를 배열 div에 저장을 하는데, 위치는 현재까지 찾은 약수의 갯수번지에 저장
				cnt++;// 저장한 후에는 약수의 갯수를 하나 증가한다.
				if(cnt == 10)
					break;
				// 이렇게 하는 이유는, 전제조건이 약수의 갯수를 최대 10개 구하기로 했기 때문에
				// 10개를 구하면 멈춤
			}
			i++;
		}
		i = 0;
		while(i<cnt){
			System.out.print(div[i]+" ");
			i++;
			
		}
		
	}

}
