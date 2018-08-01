package Day5;

public class Lotto {

	public static void main(String[] args) {
		/* �������� �ߺ��Ǵ� �ζǹ�ȣ�� �����ϴ� �ڵ带 �̿��Ͽ�,
		 * �ߺ����� �ʴ� �ζ� ��ȣ�� �����ϴ� �ڵ带 �ۼ��ϼ���. */
		int arr[] = null; // �ڵ� ������ȣ
		int arr2[] = null; // ��÷��ȣ(���ʽ� ��ȣ)
		int i;
		int min = 1, max = 45;
		int size = 6;
/*		int cnt = 0; // ������� ������ �ߺ����� ���� ��ȣ�� ����
		// ������� ���������� ������� ���� �� ���.
		for(i=0; i<arr.length; i++){
			arr[i] = 0;
		}                            */
		arr = createRandomArray(min, max, size);
		if(arr == null){
			System.out.println("�ζ� ��ȣ ������ ����");
		}else{
			sort(arr, size);
			printArray(arr);
		}
		// ��÷��ȣ �迭�� ����� ������.
		arr2 = createRandomArray(min, max, size+1);
		if(arr2 == null){
			System.out.println("�ζ� ��ȣ ������ ����");
		}else{
			sort(arr2, size); // size�� ���� ������, ���ʽ� ��ȣ�� ���� ������ �ȵǰ� �ϱ� �����̴�.
			printArray(arr2);
		}
		System.out.println(countCheck(arr, arr2));
		printRank(arr, arr2);
	
	}
		
/*		for(; cnt<arr.length; ){
			int tmp = randomInt(min, max);
			if(!isDuplicate(arr,tmp,cnt)){  // 1. tmp �� arr�� �ߺ��� ���� ������,
				arr[cnt] = tmp;         // 2. tmp�� arr�� ����(������ �� ����)
				cnt++;                  // 3. cnt�� �ϳ� ����
			}
		}
		 ������ �迭 ��� 
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		
		for(i = 0; i<6; i++){
			arr[i] = i;
		}*/

		/* �迭 arr�� num�� ���� �ִ��� ������ Ȯ���ϴ� �ڵ带 �ۼ��غ�����.
		 * ������ �ִٰ� ���, ������ ���ٰ� ���.
		 * - �ݺ����� �̿��Ͽ� �迭 arr�� 0�������� 5������ ���� �ϳ��� �����ͼ�
		 * num�� ������ �ݺ����� ���� �����Ѵ�.
		 * - �ݺ����� ����Ǹ�, ����ǰ� �� ���� i�� 6�̸� ����.
		 * - 6�� �ƴϸ� ������ ����Ѵ�.*/
/*		int num = 6;
//		for(i=0;i<6;i++){
//			if(arr[i]==num){
//				break;
//			}
		if(!isDuplicate(arr, num)){
			System.out.println("����");			
		}else{
			System.out.println("����");
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
	/* �ּҰ��� �ִ��� �Է¹޾� �ּҰ��� �ִ밪 ���̿� �ִ� ������ ���� �����ϴ� �޼ҵ�
	 * 1. �޼ҵ�� : randomInt
	 * 2. �Ű����� : �ּҰ�(int min), �ִ밪(int max)
 	 * 3. ����Ÿ�� : ������ ����(int)
	 * */
	
	public static int randomInt(int min, int max){
		if(min > max){ // �� ���� ������ �ٲ� �� ���� �ڵ�
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	/* �迭 arr�� num�� ���� �ִ��� ������ Ȯ���ϴ� �ڵ带 �ۼ��غ�����.
	 * ������ �ִٰ� ���, ������ ���ٰ� ���.
	 * - �ݺ����� �̿��Ͽ� �迭 arr�� 0�������� 5������ ���� �ϳ��� �����ͼ�
	 * num�� ������ �ݺ����� ���� �����Ѵ�.
	 * - �ݺ����� ����Ǹ�, ����ǰ� �� ���� i�� 6�̸� ����.
	 * - 6�� �ƴϸ� ������ ����Ѵ�.*/
	
	/* main �޼ҵ忡�� �ۼ��� �ڵ带 �̿��Ͽ� �迭 arr�� num�� ����
	 * ���� �ִ��� �������� �Ǻ��ϴ� �޼ҵ带 ���弼��.
	 * 1. �޼ҵ�� : isDuplicate
	 * 2. �Ű����� : �迭 arr(int arr[]), num(int num)
	 * 3. ����Ÿ�� : boolean(������ true, ������ false)
	 * */
	public static boolean isDuplicate(int arr[], int num, int cnt){
		if(cnt > arr.length){
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++){
			if(arr[i]==num){
				return true; // �ߺ�
			}
		}
		return false; // �ߺ����� ���� ��
	}
	
	/* �ߺ����� �ʴ� ������ ���� �����Ͽ� �迭�� �����ϴ� �޼ҵ带 �ۼ��ϼ���.
	 * 1. �޼ҵ�� : createRandomArray
	 * 2. �Ű����� : �ּҰ�(min), �ִ�(max), ������ �迭�� ����(cnt)
	 * 3. ����Ÿ�� : int[]
	 *  */
	public static int[] createRandomArray(int min, int max, int size){
		if(min > max){
//			int tmp = min;
//			min = max;
//			max = tmp;
			return null; // �ϰ� �� �� �Է��߾�, �� �� ���� ����.
		}
		if(max-min+1 < size){ // �迭�� ������ ������ ������ ���� �� ���� ��
			return null; // �ߺ��� �� �ۿ� ���� ��Ȳ���� ���Ǵ� if���̴�.
		}
		if(size < 0){
			return null;
		}
		int arr[] = new int[size]; // ���� ������ ���� ������ �ڵ�
		int cnt = 0;
		for(; cnt<arr.length/* ���⼱ size�� ���� ��*/; ){ // ���ѷ��� �������� ������.
			int tmp = randomInt(min, max);
			if(!isDuplicate(arr,tmp,cnt)){ // cnt : ������� �����Ǽ� ����� ��
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
*/		for(int tmp:arr){ // �̺κ��� ���� for��
		    //System.out.print(tmp+" ");
			System.out.printf("%2d ", tmp); // ������ �� ����
		}
		System.out.println();
	}
	
	/* �� �迭�� �־����� �� ���� ��ȣ�� � �ִ��� ��ȯ�ϴ� �޼ҵ带 ���弼��.
	 * �޼ҵ�� : countCheck
	 * �Ű����� : int arr[], int arr2[]
	 * ����Ÿ�� : int
	 * */
	public static int countCheck(int arr[], int arr2[]){
		// arr2 �� �ִ� ������ 7��° ���ڴ� üũ�� ���� �ʴ´�.
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
	
	
	/* �ι迭�� ���Ͽ� ���� ������ ���� ����� ����ϴ� �޼ҵ带 ���弼��.
	 * 1 : 6, 
	 * 2�� : 5�� + ���ʽ� ��ȣ ��ġ. 
	 * 3�� : 5��
	 * 4�� : 4��
	 * 5�� : 3��
	 * �� : 2 ����
	 *  �޼ҵ�� : printRank
	 *  �Ű����� : int arr[], int arr2[]
	 *  ����Ÿ�� : void  
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
			System.out.println("1� ��÷�Ǿ����ϴ�.");
		}else if(cnt == 5){
			if(isBonus){
				System.out.println("2� ��÷�Ǿ����ϴ�.");
			}else{
				System.out.println("3� ��÷�Ǿ����ϴ�.");
			}
		}else if(cnt == 4){
			System.out.println("4� ��÷�Ǿ����ϴ�.");
		}else if(cnt == 3){
			System.out.println("5� ��÷�Ǿ����ϴ�.");
		}else{
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}
	
	/* ���� ���� ������ ū ���� �����ϴ� �޼ҵ� */
	public static void sort(int arr[], int size){
		/* �츮�� ����� ���� ���� ���� : ���� �ִ� ���� �񱳸� �Ѵ�.
		 * �տ� �ִ� ���� �ڿ� �ִ� ������ ũ�� ���� ��ȯ */
		for(int i=0; i<size-1; i++){
			for(int j=0; j<size-1-i;j++){
				if(arr[j] > arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
}
