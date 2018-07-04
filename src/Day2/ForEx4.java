package Day2;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 10과 15의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소 공배수 : 두 수의 공배수중 최소인 공배수
		 * 공배수 : 두 수의 배수 중 공통적인 배수
		 * 배수 : 배수를 정수로 수를 나누어서 나머지가 0인 수
		 * 10 : 10, 20, 30, 40, 50 ........
		 * 15 : 15. 30. 45, 60, 75 ........
		 * 10과 15의 공배수 : 30, 60, 90 ..
		 * 10과 15의 최소 공배수 : 30
		 * */
		
		/* 1. 두 정수를 저장할 변수 num1과 num2, 반복문에 사용할 반복문에 사용할 변수 i를 지정한다.
		 * 2. i는 num1부터 num1*num2까지 i는 1씩 증가한다.
		 * 3. i가 num1의 배수이고, i가 num2의 배수이면 i를 출력
		 * -> i를 num1으로 나누었을 때 나머지가 0이고,
		 *    i가 num2으로 나누었을 때 나머지가 0이면
		 *    i를 출력(공배수)
		 *    a가 b의 배수 = b는 a의 약수 = a를 b로 나누었을 때 나머지가 0.
		 *    */
		
		int num1 = 1000, num2 = 1500, i = 0;
		int cnt = 0; //해당 반복문이 몇번이나 실행되었는지 보여주는 것
		for(i = num1; i<=num1*num2; i++){
			cnt++;
			if(i % num1 == 0 && i % num2 == 0)//여기에서 ;(세미콜론)을 찍어버리면, if구문에서 아예 끝나버린다. 반복문이 사라지는 것
				{System.out.println("단순: "+i);
			break;
			}
		}
		System.out.println("단순 반복횟수 : "+cnt);
		cnt = 0;

		for(i = num1; i<=num1*num2; i+=num1){//초기조건에 아예 num1의 배수로 설정해놓았기에, 1씩 증가하면서 비교할 필요가 없다.
			// 반복횟수가 조금 줄어든다.
			cnt++;
			if(i % num2 == 0)
				{System.out.println("조금 생각: "+i);
			break;
			}
		}
		System.out.println("조금 반복횟수 : "+cnt);
		cnt = 0; //계속 입력해주는 이유는 cnt 값을 초기화하기 위해서이다.
		
		int tmpNum = num1;
		int div = num2;
		if(num2 > num1){
			tmpNum = num2;
			div = num1;
		}
		
		for(i = tmpNum; i<=num1*num2; i+=tmpNum){//num1이나 num2에서 더 큰 숫자로 실행하자.
			// 반복횟수가 많이 줄어든다.
			cnt++;
			if(i % div == 0)
				{System.out.println("많이 생각: "+i);
			break;
			}
		}
		System.out.println("많이 반복횟수 : "+cnt);
	}

}
