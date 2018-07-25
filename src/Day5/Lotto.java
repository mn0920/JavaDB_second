package Day5;

public class Lotto {

	public static void main(String[] args) {
		/* �������� �ߺ��Ǵ� �ζǹ�ȣ�� �����ϴ� �ڵ带 �̿��Ͽ�,
		 * �ߺ����� �ʴ� �ζ� ��ȣ�� �����ϴ� �ڵ带 �ۼ��ϼ���. */
		int arr[] = new int[6];
		int i;
		int min = 1, max = 6;
		int cnt = 0; // ������� ������ �ߺ����� ���� ��ȣ�� ����
		for(i=0; i<arr.length; i++){
			arr[i] = 0;
		}
		arr = createRandomArray(min, max, 6);
		if(arr == null){
			System.out.println("�ζ� ��ȣ ������ ����");
		}else{
			printArray(arr);
		}
	}
		
//		for(; cnt<arr.length; ){
//			int tmp = randomInt(min, max);
//			if(!isDuplicate(arr,tmp,cnt)){  // 1. tmp �� arr�� �ߺ��� ���� ������,
//				arr[cnt] = tmp;         // 2. tmp�� arr�� ����(������ �� ����)
//				cnt++;                  // 3. cnt�� �ϳ� ����
//			}
//		}
		/* ������ �迭 ��� */
//		for(i=0; i<arr.length; i++){
//			System.out.print(arr[i]+" ");
//		}
		
		
//		for(i = 0; i<6; i++){
//			arr[i] = i;
//		}

		/* �迭 arr�� num�� ���� �ִ��� ������ Ȯ���ϴ� �ڵ带 �ۼ��غ�����.
		 * ������ �ִٰ� ���, ������ ���ٰ� ���.
		 * - �ݺ����� �̿��Ͽ� �迭 arr�� 0�������� 5������ ���� �ϳ��� �����ͼ�
		 * num�� ������ �ݺ����� ���� �����Ѵ�.
		 * - �ݺ����� ����Ǹ�, ����ǰ� �� ���� i�� 6�̸� ����.
		 * - 6�� �ƴϸ� ������ ����Ѵ�.*/
//		int num = 6;
////		for(i=0;i<6;i++){
////			if(arr[i]==num){
////				break;
////			}
//		if(!isDuplicate(arr, num)){
//			System.out.println("����");			
//		}else{
//			System.out.println("����");
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
		for(int i=0; i<cnt; i++){
			if(arr[i]==num){
				return true;
			}
		}
		return false;
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
		if(max-min+1 < size){
			return null; // �ߺ��� �� �ۿ� ���� ��Ȳ���� ���Ǵ� if���̴�.
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
