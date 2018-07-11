package Day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열은 자료형이 같은 변수를 하나로 묶는 것으로,
		 * 동일한 목적의 변수이여야한다.*/
		
		int num1, num2, num3, num4, num5; // 메모리 용량을 잡을 때, 각자 랜덤으로 흩어져서 잡는다.
		int num [] = new int [5]; // (교재 182page) // 메모리 용량을 잡을 때 연속된 공간에 잡는다.
		 // 앞에 있는 num은 뒤에 있는 new int[5]의 주소를 갖고 있다.
		
/*		위에 있는 num1은 반복을 사용하기 어렵다.
		반면,
		1. 배열은 반복문을 이용하기 편하다.
		2. 배열의 값을 가져오기 위해서는 배열의 인덱스로 접근해야하는데,
		   인덱스의 시작 번지는 0번지이다. [] <-이것을 인덱스라고 한다.
  		     num[0] = 1; // 0번지에 1을 저장
		3. 배열의 마지막 인덱스(번지)는 배열의 크기 -1이다.
		   (만약, 내가 5까지 num을 잡고 싶다면, num[4]적으면 된다.)
*/
		for(int i = 0; i<num.length; i++){
			num[i] = i+1;
		}
		for(int i=0; i<num.length;i++){
			System.out.println("num["+i+"] : " + num[i]);
		}
		
		
		int []num1;
		int num2[];
		// 이때는 화면에 나타나는 것이 똑같다. 그러나 ','를 찍어서 두개로 한다면?
		int []num1, num3; // int[]가 공통으로 되어 num1, num3가 배열이 된다.
		int num2[], num4; // int가 공통으로 되어 num2는 배열, num4는 일반 변수가 됨
		num1 = new int[3]; // 선언하고 바로 할당하지 않아도 됨(나중에 배열을 선언 할 수 있다.)
/*		num1 : 배열
		num2 : 배열
		num3 : 배열
		num4 : 변수
*/
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		if(size >= 0)
			num1 = new int[size];
		scan.close();
		
		int num5[] = {1,2,3,4,5}; // 각 배열을 만들고 각 번지에 숫자를 집어 넣는 것
		System.out.println("초기화 예제");
		for(int i=0; i<num5.length;i++){
			System.out.println("num["+i+"] : " + num5[i]);
		}
		
/*		int num6[];
		num6 = {1,2,3,4,5}
		이렇게 사용할 수 없다. 배열 초기화는 선언 할 때에만 가능*/
		
		
	}

}
