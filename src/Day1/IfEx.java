package Day1;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 조건문의 최소한의 기본형태
		 * 
		 * if(조건식1){
		 * 		실행문; // 조건식1이 참일 때, 실행된다.
		 * }
		 * 
		 * else if(조건식2){
		 * 		실행문2; // 조건식1이 거짓이고, 조건식2가 참일 경우 실행됨.
		 * }
		 * 
		 * else{
		 * 		실행문3; // 조건식1과 조건식 2가 거짓일 때 실행됨.
		 * }
		 * 
		 * if와 else if의 순서가 중요하다!!!
		 * 위에서 부터 차례대로 결과를 도출하면서 내려오기 떄문에 순서가 매우 중요하다.
		 * 만약 아래의 예시에서 %2를 하여 짝수입니다가 먼저 나온다면,
		 * 도출된 결과는 짝수라고 나오기 때문이다.
		 * 
		 */
		
		// 
		
		int num = 0;
		if(num == 0) {
			System.out.println(num+"는 0 입니다.");
		// 만약 num가 0이라면, 콘솔에 0입니다를 출력하세요.
		} else if((num % 2) == 0){
			System.out.println(num+"는 짝수입니다.");
		// 만약 num가 0이 아니고, num를 2로 나누었을 때 0과 같다면, 콘솔에 짝수입니다를 출력하세요.
		} else{
			System.out.println(num+"는 홀수입니다.");
		// 만약 num이 0이 아니고, num을 2로 나누었을 때 0과 같지 않다면,
		// 콘솔에 홀수를 출력하세요.
		}
		
		
		
	}

}
