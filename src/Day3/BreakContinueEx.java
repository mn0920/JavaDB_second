package Day3;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("break문 예제");
		for(int j = 1;j<=5;j++){
			for(int i = 1;i<=5;i++){
				System.out.println("j="+j+", i"+i);
				if(i==4){
					break;//if+break는 바로 위에있는 반복문에서 빠져나간다.
				}
			}
		}
		
		System.out.println("이름이 있는 for문 break문 예제2");
		Test:
		for(int j = 1;j<=5;j++){
			for(int i = 1;i<=5;i++){
				System.out.println("j="+j+", i"+i);
				if(i==4){
					break Test;//if+break는 바로 위에있는 반복문에서 빠져나간다.
				}
			}
		}
		
		System.out.println("continue문 예제");
		for(int j = 1;j<=5;j++){
			for(int i = 1;i<=5;i++){
				if(i==4){
					continue;//continue는 skip같은 것이다
				}
				System.out.println("j="+j+", i"+i);
			}
		}
		
		/*1부터 100까지 짝수의 합을 continue문을 이용하여 작성하세요*/
		
		System.out.println("1부터 100까지 짝수의 합");
		int sum = 0;
		for(int i = 1;i<=100;i++){
			if(i%2==0)
				sum += 1;
		}
		System.out.println("1부터 100까지의 짝수의 합" + sum);
			
	
	
		System.out.println("continue 1부터 100까지 짝수의 합");
		sum = 0;
		for(int i = 1;i<=100;i++){
			if(i%2==1)
				continue;//continue는 skip같은 것이다
			sum += 1;
		}
		System.out.println("1부터 100까지의 짝수의 합" + sum);
	}
}
