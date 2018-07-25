package Day5;

public class Lotto {

	public static void main(String[] args) {
		/* 랜덤으로 중복되는 로또번호를 생성하는 코드를 이용하여,
		 * 중복되지 않는 로또 번호를 생성하는 코드를 작성하세요. */
		int arr[] = new int[6];
		int i;
		int min = 1, max = 6;
		int cnt = 0; // 현재까지 생선된 중복되지 않은 번호의 갯수
		for(i=0; i<arr.length; i++){
			arr[i] = 0;
		}
		arr = createRandomArray(min, max, 6);
		if(arr == null){
			System.out.println("로또 번호 생성에 실패");
		}else{
			printArray(arr);
		}
	}
		
//		for(; cnt<arr.length; ){
//			int tmp = randomInt(min, max);
//			if(!isDuplicate(arr,tmp,cnt)){  // 1. tmp 가 arr와 중복된 값이 없으면,
//				arr[cnt] = tmp;         // 2. tmp를 arr에 저장(번지는 잘 생각)
//				cnt++;                  // 3. cnt를 하나 증가
//			}
//		}
		/* 생성된 배열 출력 */
//		for(i=0; i<arr.length; i++){
//			System.out.print(arr[i]+" ");
//		}
		
		
//		for(i = 0; i<6; i++){
//			arr[i] = i;
//		}

		/* 배열 arr에 num의 값이 있는지 없는지 확인하는 코드를 작성해보세요.
		 * 있으면 있다고 출력, 없으면 없다고 출력.
		 * - 반복문을 이용하여 배열 arr의 0번지부터 5번지의 값을 하나씩 가져와서
		 * num과 같으면 반복문을 강제 종료한다.
		 * - 반복문이 종료되면, 종료되고 난 후의 i가 6이면 없음.
		 * - 6이 아니면 있음을 출력한다.*/
//		int num = 6;
////		for(i=0;i<6;i++){
////			if(arr[i]==num){
////				break;
////			}
//		if(!isDuplicate(arr, num)){
//			System.out.println("없음");			
//		}else{
//			System.out.println("있음");
//		}
		
		
		/* 0 <= x < 1 
		 * 0 <= 10*x < 10
		 * 1 <= 10*x+1 <11
		 * */
//		int min = 1, max = 10;
//		for(int i =0; i<10; i++){
//			int num = (int)(Math.random()*(max-min+1)+min);
//			int num = randomInt(min, max);
//			System.out.println(num);
//		}
	
	/* 최소값과 최댓값을 입력받아 최소값과 최대값 사이에 있는 랜덤한 수를 생성하는 메소드
	 * 1. 메소드명 : randomInt
	 * 2. 매개변수 : 최소값(int min), 최대값(int max)
 	 * 3. 리턴타입 : 랜덤한 정수(int)
	 * */
	
	public static int randomInt(int min, int max){
		if(min > max){ // 두 수의 순서를 바꿀 때 쓰는 코드
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	/* 배열 arr에 num의 값이 있는지 없는지 확인하는 코드를 작성해보세요.
	 * 있으면 있다고 출력, 없으면 없다고 출력.
	 * - 반복문을 이용하여 배열 arr의 0번지부터 5번지의 값을 하나씩 가져와서
	 * num과 같으면 반복문을 강제 종료한다.
	 * - 반복문이 종료되면, 종료되고 난 후의 i가 6이면 없음.
	 * - 6이 아니면 있음을 출력한다.*/
	
	/* main 메소드에서 작성한 코드를 이용하여 배열 arr에 num와 같은
	 * 값이 있는지 없는지를 판별하는 메소드를 만드세요.
	 * 1. 메소드명 : isDuplicate
	 * 2. 매개변수 : 배열 arr(int arr[]), num(int num)
	 * 3. 리턴타입 : boolean(있으면 true, 없으면 false)
	 * */
	public static boolean isDuplicate(int arr[], int num, int cnt){
		for(int i=0; i<cnt; i++){
			if(arr[i]==num){
				return true;
			}
		}
		return false;
	}
	
	/* 중복되지 않는 랜덤한 수를 생성하여 배열에 저장하는 메소드를 작성하세요.
	 * 1. 메소드명 : createRandomArray
	 * 2. 매개변수 : 최소값(min), 최댓값(max), 생성할 배열의 갯수(cnt)
	 * 3. 리턴타입 : int[]
	 *  */
	public static int[] createRandomArray(int min, int max, int size){
		if(min > max){
//			int tmp = min;
//			min = max;
//			max = tmp;
			return null; // 니가 잘 못 입력했어, 나 일 안할 거임.
		}
		if(max-min+1 < size){
			return null; // 중복될 수 밖에 없는 상황에서 사용되는 if문이다.
		}
		int arr[] = new int[size];
		int cnt = 0;
		for(; cnt<arr.length; ){
			int tmp = randomInt(min, max);
			if(!isDuplicate(arr,tmp,cnt)){
				arr[cnt] = tmp;
				cnt++;  
			}
		}
		return arr;
	}
	
	public static void printArray(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
