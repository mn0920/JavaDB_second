package Day5;

public class Lotto {

	public static void main(String[] args) {
		/* 랜덤으로 중복되는 로또번호를 생성하는 코드를 이용하여,
		 * 중복되지 않는 로또 번호를 생성하는 코드를 작성하세요. */
		int arr[] = null; // 자동 생성번호
		int arr2[] = null; // 당첨번호(보너스 번호)
		int i;
		int min = 1, max = 45;
		int size = 6;
/*		int cnt = 0; // 현재까지 생선된 중복되지 않은 번호의 갯수
		// 노랑색은 선언했지만 사용하지 않을 때 뜬다.
		for(i=0; i<arr.length; i++){
			arr[i] = 0;
		}                            */
		arr = createRandomArray(min, max, size);
		if(arr == null){
			System.out.println("로또 번호 생성에 실패");
		}else{
			sort(arr, size);
			printArray(arr);
		}
		// 당첨번호 배열을 만들어 보세요.
		arr2 = createRandomArray(min, max, size+1);
		if(arr2 == null){
			System.out.println("로또 번호 생성에 실패");
		}else{
			sort(arr2, size); // size를 쓰는 이유는, 보너스 번호가 같이 정렬이 안되게 하기 위함이다.
			printArray(arr2);
		}
		System.out.println(countCheck(arr, arr2));
		printRank(arr, arr2);
	
	}
		
/*		for(; cnt<arr.length; ){
			int tmp = randomInt(min, max);
			if(!isDuplicate(arr,tmp,cnt)){  // 1. tmp 가 arr와 중복된 값이 없으면,
				arr[cnt] = tmp;         // 2. tmp를 arr에 저장(번지는 잘 생각)
				cnt++;                  // 3. cnt를 하나 증가
			}
		}
		 생성된 배열 출력 
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		
		for(i = 0; i<6; i++){
			arr[i] = i;
		}*/

		/* 배열 arr에 num의 값이 있는지 없는지 확인하는 코드를 작성해보세요.
		 * 있으면 있다고 출력, 없으면 없다고 출력.
		 * - 반복문을 이용하여 배열 arr의 0번지부터 5번지의 값을 하나씩 가져와서
		 * num과 같으면 반복문을 강제 종료한다.
		 * - 반복문이 종료되면, 종료되고 난 후의 i가 6이면 없음.
		 * - 6이 아니면 있음을 출력한다.*/
/*		int num = 6;
//		for(i=0;i<6;i++){
//			if(arr[i]==num){
//				break;
//			}
		if(!isDuplicate(arr, num)){
			System.out.println("없음");			
		}else{
			System.out.println("있음");
		}
*/		
		
		/* 0 <= x < 1 
		 * 0 <= 10*x < 10
		 * 1 <= 10*x+1 <11
		 * 
		int min = 1, max = 10;
		for(int i =0; i<10; i++){
			int num = (int)(Math.random()*(max-min+1)+min);
			int num = randomInt(min, max);
			System.out.println(num);
		}
*/	
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
		if(cnt > arr.length){
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++){
			if(arr[i]==num){
				return true; // 중복
			}
		}
		return false; // 중복되지 않을 때
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
		if(max-min+1 < size){ // 배열의 갯수가 랜덤한 수보다 양이 더 많을 때
			return null; // 중복될 수 밖에 없는 상황에서 사용되는 if문이다.
		}
		if(size < 0){
			return null;
		}
		int arr[] = new int[size]; // 실제 랜덤한 수가 나오는 코드
		int cnt = 0;
		for(; cnt<arr.length/* 여기선 size와 같은 것*/; ){ // 무한루프 형식으로 돌린다.
			int tmp = randomInt(min, max);
			if(!isDuplicate(arr,tmp,cnt)){ // cnt : 현재까지 생성되서 저장된 수
				arr[cnt] = tmp;
				cnt++;  
			}
		}
		return arr;
	}
	
	public static void printArray(int arr[]){
		/*for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
*/		for(int tmp:arr){ // 이부분은 향상된 for문
		    //System.out.print(tmp+" ");
			System.out.printf("%2d ", tmp); // 오른쪽 줄 맞춤
		}
		System.out.println();
	}
	
	/* 두 배열이 주어졌을 때 같은 번호가 몇개 있는지 반환하는 메소드를 만드세요.
	 * 메소드명 : countCheck
	 * 매개변수 : int arr[], int arr2[]
	 * 리턴타입 : int
	 * */
	public static int countCheck(int arr[], int arr2[]){
		// arr2 에 있는 마지막 7번째 숫자는 체크를 하지 않는다.
		int i=0, j=0;
		int size = 0;
		int cnt = 0;
		if(arr.length > arr2.length){
			size = arr.length;
		}
		else{
			size = arr.length;
		}
/*		for(i=0;i<size;i++){
			for(j=0; j<size; j++){
				if(arr[i] == arr[j]){
					cnt++;
				}
			}
*/			
		for(i=0; i<size; i++){
			if(isDuplicate(arr, arr2[i], size)){
				cnt++;
			}
		}
		return cnt;
	}
	
	
	/* 두배열을 비교하여 맞은 갯수에 따라 등수를 출력하는 메소드를 만드세요.
	 * 1 : 6, 
	 * 2등 : 5개 + 보너스 번호 일치. 
	 * 3등 : 5개
	 * 4등 : 4개
	 * 5등 : 3개
	 * 꽝 : 2 이하
	 *  메소드명 : printRank
	 *  매개변수 : int arr[], int arr2[]
	 *  리턴타임 : void  
	 *  */
	public static void printRank(int arr[], int arr2[]){
		int cnt = countCheck(arr, arr2);
		boolean isBonus = false;
		if(arr.length > arr2.length){
			isBonus = isDuplicate(arr2, arr[arr.length-1], arr2.length);
		}else{
			isBonus = isDuplicate(arr, arr2[arr2.length-1], arr.length);
		}
		
		if(cnt == 6){
			System.out.println("1등에 당첨되었습니다.");
		}else if(cnt == 5){
			if(isBonus){
				System.out.println("2등에 당첨되었습니다.");
			}else{
				System.out.println("3등에 당첨되었습니다.");
			}
		}else if(cnt == 4){
			System.out.println("4등에 당첨되었습니다.");
		}else if(cnt == 3){
			System.out.println("5등에 당첨되었습니다.");
		}else{
			System.out.println("당첨되지 않았습니다.");
		}
	}
	
	/* 수를 작은 수에서 큰 수로 정렬하는 메소드 */
	public static void sort(int arr[], int size){
		/* 우리가 사용할 것은 버블 정렬 : 앞에 있는 수가 뒤에 있는 보다 작으면 뒤로 보냄. */
		for(int i=0; i<size-1; i++){
			for(int j=0; j<size-1-i;j++){
				if(arr[j] > arr[j+1]){// 앞에 있는 수가 뒤에 있는 수보다 크면 서로 교환
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
}
