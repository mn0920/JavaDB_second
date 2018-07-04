package Day2;

public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 소수 : 약수가 1과 자기자신인 수가 소수
		 * => 방법1 : 약수가 2개
		 *    방법2 : 자기 자신을 빼고 처음으로 구한 약수가 1이면
		 * 소수 : 2, 3, 5, 7, 11, 13, 17...
		 * */
		
		/*   방법1
		 * 1. 정수를 저장할 변수 num와 약수의 갯수를 저장할
		 *    변수 cnt와 반복문 변수 i를 선언 및 초기화
		 * 2. i는 1부터 num까지 하나씩 증가하면서 반복
		 * 3. i가 num의 약수이면 약수의 갯수 1개씩 증가
		 *   -> num를 i로 나누었을때 나머지가 0이면.
		 * 4. 반복문이 종료된 후 약수의 갯수가 2개이면,
		 *    소수가 아닌 합성수로 출력*/
		
		int num = 321, cnt = 0, i = 0;
		for(i = 1; i<=num; i++){
			if(num % i == 0){
				cnt++;
			}
		}
		if(cnt==2){//이것의 의미는 카운트 된 것이 2라면, "는 소수"를 출력해라.
			System.out.println(num+"는 소수");
		}else{
			System.out.println(num+"는 합성수");
		}
		
		/*   방법2
		 * 2. i는 num-1부터 1까지 하나씩 감소하면서 반복 : 본인을 제외한 처음 약수를 판별하는 것
		 * 3. num를 i로 나누었을 때, 나머지가 0이면 반복문 종료.
		 * 4. i가 1이면 소수, 아니면 합성수입니다.*/
		
		for(i = num-1; i >= 1; i--){//얘는 빼기 때문에 일보다 크거나 같아야한다.
			if(num % i ==0){
				//이때 i가 num을 제외한 가장 큰 약수이다.
				break;
			}
		}
		// i가 1이면 num을 제외한 약수가 1이라는 의미이고.
		//이는 약수가 2개라는 의미이므로 소수이다.
		if(i == 1){
			System.out.println(num+"는 소수");
		}else{
			System.out.println(num+"는 합성수");
		}
	}

}


		/*   무한 루프
		 * - for(;;){
		 *    };
		 * 
		 * - for(i = 1; i > 0; i++){
		 *    }System.out.println(i");
		 * 
		 *    변수초기화
		 * - for(num = 15, i = num; i >= 1; i++)
		 *     이런식으로 안에 다가 넣을 수도 있다.그러면 그 구문안에서만 변수가 초기화 된다.
		 * */