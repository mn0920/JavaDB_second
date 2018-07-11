package Day3;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("무한 루프가 생성되는 경우");
		
		/* 1. 가장 기본적인 무한루프 만드는 법*/
		
/*		for( ; ;){
			System.out.println("Hello world");
		}*/
		
		/*주석처리할 때 편하게 하려면 블럭처리를 하고,  ctrl+/ or ctrl+shift+/ */
		
		System.out.println("hello world");
		/* 앞에 무한 루프가 있으면 여기까지 코드를 진행할 수 없기 때문에 무한 루프에 빠진다.*/
		
		/* 2. 잘못된 초기화로 인한 반무한루프
		 *     - 정확히 말하면, 무한 루프는 아니고 그냥 많이 실행할 뿐이다.(왜냐면 언젠가 도달하니까) */
/*		int i = 1;
		for(i=-10000000;i<=10;i++){
			System.out.println("Hello world");
		}*/
		
		/* 3. 질못된 조건식으로 인한 반무한루프 */
		/*int i = 1;
		for(i=1; i>=1;i++){ // i가 1보다 크거나 같다.
			System.out.println("hello world");
		}*/
		
		/* 4. 잘못된 증감연산으로 인한 무한 루프 */
/*   	int i = 1;
		for(i=1;i<=10; ){
			System.out.println("Hello world");
		}*/
		
		/* 5. 잘못된 증감연산으로 인한 반 무한루프 */
/*		int i = 1;
		for(i=1;i<=10;i--){
			System.out.println("Hello world");
		}*/

		
		System.out.println("반복문 실행히 한번도 안되는 경우");
		
		/* 1. 변수초기화를 잘못한 경우*/
/*		for(int i=11;i<=10;i++){
			System.out.println("hello world");
		}*/
		
		/* 2. 변수초기화를 하지 않은 경우 */
/*	    int i =0;
	    for(i=1;i<=10;i++){
	    	System.out.println("hello world");
	    }
	    for( ; i<=10; i++){ //앞에서 끝나서 i가 11이 됬는데 초기화가 안된상태로 10보다 작거나 같을 떄까지 하라고 했으니까
	    	System.out.println("hello world2");
	    }*/
	    
	    
		/* 3. 조건식을 잘못한 경우*/
	    for(int i = 1;i>=10;i++){
	    	System.out.println("hello world1");
	    }
	}

}
