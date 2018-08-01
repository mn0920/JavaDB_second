package Day6;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10, num2 = 20;
		int arr[] = new int[3];
		/* 일반 변수(a)를 이용하여 메소드 활용한 결과를 확인하기 위한 예제 
		 * = 일반변수(a)를 메소드의 매개변수로 이용하면 메소드안에서 
		 * 매개변수의 값이 수정되어도 메소드를 호풀한 곳에서의 일반변수(a)는 
		 * 바뀌지 않는다. 
		 * = 일반변수 : int, char, double등의 자료형으로 만든 변수 */
		System.out.println("num1 : "+num1+", num2 : "+num2);
		swap(num1, num2);
		System.out.println("num1 : "+num1+", num2 : "+num2);
		
		/* 참조 변수를 이용하여 메소드 활용한 결과를 확인하기 위한 예제 
		 * = 참조변수를 메소드의 매개변수로 이용하면, 메소드 안에서
		 * 매개변수의 값이 수정되면 메소드를 호출한 곳에서의 참조변수도
		 * 바뀐다.
		 * - 참조변수 : 배열, 객체처럼 new를 통해 생성되는 것들  */
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.println();
		swap(arr);
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	
	/* 메소드를 만들 때 재활용 할 수 있도록 만드는 것이 중요하다. 즉, 고정을 하지 말 것*/
	
	/* 위와 같은 상황을 "메소드 오버로딩이라고 부른다."
	 * 메소드 오버로딩 : 동일한 이름의 메소드가 여러개 있는 상황
	 * 두가지 조건 중 하나를 만족해야 사용가능 하다.
	 * 1. 매개변수의 갯수가 다른 경우
	 * 2. 매개변수의 갯수가 같지만, 자료형이 다른 경우 
	 * - 메소드 오버라이딩에서 중요한 것은 매개변수이다.
	 *   리턴 타입은 아무런 영향이 없다. */
	
	public static int sum(int num1, int num2){
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3){
		return num1+num2+num3;
	}
	public static double sum(double num1, double num2){
		return num1+num2;
	}
/*	public static double sum(int num1, int num2){
		return num1+ num2;
	} - 매개변수 중복*/
/*	public static int sum(int a, int b){
		return a+b;
	} - 매개변수 중복(정의가 중요한 것이 아니라, 자료형이 중요한 것이다.)*/
	
	public static void swap(int num1, int num2){
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
	}
	
	 public static void swap(int arr[]){
		 for(int i = 0; i<arr.length; i++){
			 arr[i] = i;
		 }
	 }
	
}
