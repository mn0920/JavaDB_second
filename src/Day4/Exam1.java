package Day4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num=10;
//		System.out.printf("num : %d\n", num);
//		/* printf���� ���Ĺ��ڸ� �� �־�����Ѵ�.
//		 * ���Ĺ���
//		 * %d : ������
//		 * %f, F1f : �Ǽ���
//		 * %c : ������
//		 * %s : ���ڿ�
//		 * */
//		System.out.println("num : "+num);
		
		
		/* ���ǹ� 
		 * if��, switch case��
		 * swuch case������ �ۼ��Ȱ� ���� if������ �ٲ� �� �ִ�. �ݴ�� �� ������
		 * 
		 * if(���ǽ�){
		 * 		���๮1;
		 * }else if(���ǽ�){
		 * 		���๮2;
		 * }else{
		 * 		���๮3;
		 * }*/
		
		/* ����, ������ ���� num�� Ȧ���̸� Ȧ���Դϴ�.
		 * ¦���̸� ¦���Դϴ�. �� ����ϴ� �ڵ带 �ۼ�*/
		
//		int num = 1;
//		if(num%2==0){ //���ǽĿ����� �������ڳ�, �񱳿����ڸ� ����Ѵ�.
//			System.out.println(num+"�� ¦���Դϴ�.");
//		}else{ //else if(num%2==1)
//			System.out.println(num+"�� Ȧ���Դϴ�.");
//		}
		
		/* switch(������){   ���� �������� �Ȱ��� ��������� ���� ����� �ü��ִ�.
		 * case ��1:
		 *      ���๮1;
		 *      break;
		 * case ��2:
		 *      ���๮2;
		 *      break;
		 * default :
		 *      ���๮3;
		 * }
		 * */
//		int month = 2;
//		switch(month){
//		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
//			System.out.println("�������� : 31��");
//			break;
//		case 2 :
//			System.out.println("�������� : 28��");
//			break;
//		default :
//			System.out.println("�������� : 30��");
//		}
		
		
		/* for(1�ʱ�ȭ;2���ǽ�;4��������){
		 * 		3���๮;
		 * }     1,2,3,4 ������ ������ �ȴ�.
		 * �ʱ�ȭ�� �ݺ����� ����� ��, ó�� �� ���� ����
		 * ���ǽ��� ���̸�, ���๮, ��������, ���ǽ� �� ������ �ݺ�
		 * ���ǽ��� �����̸� �ݺ��� ����*/
		
		/*1���� 10���� ����ϴ� �ڵ带 �ۼ�*/
//		int = i;
//		for(i=1;i<=10;i++){
//			System.out.print(i+1+" ");
//		}
		
		/* 1���� 10������ ���� ����ϴ� �ڵ带 �ۼ��ϼ���.*/
//		int i = 0;
//		int sum = 0;
//		for(i = 1; i<=10; i++){
//			sum = sum+i;
//		}System.out.println("1���� 10������ �� : "+sum);

		/* ���� �ѹ��� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���.*/
		/* �ݺ��� ���� : i , ���� : num 
		 * i�� 1���� num���� �ϳ��� �����Ͽ� �ݺ����� �����ϴµ�,
		 * num�� i�� �������� ��, �������� 0�̸�(i�� num�� ����̸�)
		 * ����� ������ �ϳ��� �����Ѵ�. �ݺ����� �� ������ ����
		 * ����� ������ 2���̸� �Ҽ�, �ƴϸ� �ռ����� ���*/
		
//		int cnt = 0;
//		int num = 10;
//		for(int i = 1; i<=num;i++){
//			if(num %i == 0)
//				cnt++;
//		}
//		if(cnt == 2){
//		System.out.println(num+"�� �Ҽ��Դϴ�.");
//		}else{
//			System.out.println(num+"�� �ռ����Դϴ�.");
//		}
		
		/* �Ҽ��� ���ϴ� �ٸ� ���
		 * �Ҽ��� ����� ���� �����Ѵٸ� 1�̴�.
		 * ���� ������ ��� �� ���� ū ���� 1*/		
//		int i, num = 13, div = 0;
//		for(i=num-1; i>0; i--){
//			if(num % i == 0){
//				div = i;
//				break;
//			}
//		}
//		if(div == 1){
//			System.out.println(num+"�� �Ҽ�");
//		}else{
//			System.out.println(num+"�� �ռ���");
//		}
	
		/* �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���. */
		/*�� �� num1, num2, �ݺ��� ���� i, ����� gcd
		 * i�� 1���� num1���� �ݺ��ϰ� i�� num1�� num2�� ����̸� ����� ������ i�� ����.
		 * �ݺ����� �� ����� �� ������� ����ϸ� �װ� �ִ� ������̴�.*/
		
//		int num1 = 12, num2 = 8;
//		int gcd = 1; // ��� �ִ� ������̵� 1���� ũ�ų� ���� �����̴�.
//		int i = 1;
//		for(i = 2; i<=num1; i++){
//			if(num1%i == 0 && num2%i == 0){ //i�� num1�� ����̰� i�� num2�� ����̸�
//				gcd = i;
//			}
//		}System.out.println(gcd+"��"+num1+"��"+num2+"�� �ִ�����");
		
		/* �ٸ� ��� */
//		for(i=num1; i>=2; i--){
//			if(num1%i == 0 && num2%i == 0){
//				gcd = i;
//				break;
//			}
//		}System.out.println(gcd+"�� "+num1+"�� "+num2+"�� �ִ�����");
		
		/* ���� ���� �ڵ带 ���� ���� �� �ݺ�Ƚ���� �ݺ��� ���� �� i�� ����?
		 *  �������� ���� ����� �����ϼ���*/
//		int i = 0;
//		int cnt = 0;
//		for(i = 0; i<10;i+=2){
//			cnt++;
//		}// �� ���� = 4�� �ݺ�, ���� �� i�� �� : 8
//		System.out.println("�ݺ�Ƚ�� : "+cnt);
//		System.out.println("���� �� i : "+i);
//		//�� : �ݺ�Ƚ�� : 5, ���� �� i�� 10
		
		
		/* �ּ� ������� ���ϴ� �ڵ带 �ۼ��غ�����. */
//		num1�� ������ num2�� ����� �߿��� ����� ����� �߿��� ���� ���� ���.
//		�׷����� num1�� ���� �־���ϰڰ�, num2�� ���� �־���ϰ���.
//		�׸��� for���� ������ i�� ���� �־�� �ϰڰ�.
//		�ּ� ������� �ƹ��� ���ص� num1�� num2�� ���� �����װ�.
		
		/* �� �� : num1, num2
		 * �ݺ��� ���� : i
		 * �ּ� ����� : lcm
		 * i�� num1���� num1*num2���� num1�� �����ϸ鼭 �ݺ�
		 * �ݺ����ȿ��� i�� num1�� ����̰�, i�� num2�� ����̸�
		 * lcm�� i�� �����ϰ� �ݺ����� ���� �����Ѵ�.
		 * �ݺ����� ����ǰ� lcm�� ����ϸ� �ּҰ������ ��µȴ�.*/
		
//		int i = 1, num1 = 3, num2 = 9, lcm = 0;
//		for(i=num1;i<=num1*num2;i+=num1){
//			if(i%num1==0&&i%num2==0){ //i�� num1�Ƿ� �������� �� 0�̸�, i(���)�� num1(3)���� �������� �� �������� 0�̸� i�� num1�� ���
//			lcm = i;
//			break;}
//		}System.out.println(lcm);

		/*
		 * ****
		 * ****
		 * ****
		 * ****
		 * */
		

//		for(int i=1;i<=4;i++){
//			for(int j=1;j<=4;j++){
//				System.out.print("*");
//			}System.out.println();
//		}
		

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print("*");
			}System.out.println();
		}

		System.out.println();
		
		
		/*
		 * *     i: 1, *�� ����: 1
		 * **    i: 2, *�� ����: 2
		 * ***   i: 3, *�� ����: 3
		 * ****  i: 4, *�� ����: 4
		 *       *�� ������ i�� ��ŭ�� ������ �ȴ�.*/
		/* ���� for���� ����, ���� for���� ����
		 * ���� for���� *���, *�� ����� �������� �ٹٲٱ⸦ �ؾ���*/
		
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println();

		
		/* i + ���� ���� = 6 = 6-1
		 * *****  i : 1   ���鰹��: 0   ���� ����: 5
		 *  ****  i : 2   ���鰹��: 1   ���� ����: 4
		 *   ***  i : 3   ���鰹��: 2   ���� ����: 3
		 *    **  i : 4   ���鰹��: 3   ���� ����: 2
		 *     *  i : 5   ���鰹��: 4   ���� ����: 1
		 * */
		
		for(int i=1;i<=5;i++){
			for(int j=0;j<=i-1;j++){
				System.out.print(" ");
			}for(int j=1;j<=6-i;j++){
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println();
		

		for(int i=1;i<=num;i++){
			for(int j=0;j<=i-1;j++){
				System.out.print(" ");
			}for(int j=1;j<=num+1-i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println();
		
		/* i + ���� ���� = 6 = 6-1
		 * *****  i : 5   ���鰹��: 0   ���� ����: 5
		 *  ****  i : 4   ���鰹��: 1   ���� ����: 4
		 *   ***  i : 3   ���鰹��: 2   ���� ����: 3
		 *    **  i : 2   ���鰹��: 3   ���� ����: 2
		 *     *  i : 1   ���鰹��: 4   ���� ����: 1
		 *                    5(num)-i             i
		 * */

		for(int i=num;i>=1;i--){
			for(int j=0;j<=num-i;j++){
				System.out.print(" ");
			}for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		

		System.out.println();
		
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){ // �̹��� ����� ���� ���ļ� num�� ��ŭ�� ��⶧����, ����� ���� if�� ��
				if(j<=i-1){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}System.out.println();
		}
		
		System.out.println();
		
		/*
		 *   *  1              ������ ����: 2   ���� ����: 1
		 *  **  2              ������ ����: 1   ���� ����: 2
		 * ***  3              ������ ����: 0   ���� ����: 3
		 *  **  4              ������ ����: 1   ���� ����: 2
		 *   *  5              ������ ����: 2   ���� ����: 1
		 * num= 5  (num+1)/2    Math.abs(3-i)    3-Math.abs(3-i)
		 * */

		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=(num+1)/2;j++){
				if(j<=Math.abs((num+1)/2-i)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		/*
		 *   *  1  ������ ����: 2   ���� ����: 1
		 *  **  2  ������ ����: 1   ���� ����: 2
		 * ***  3  ������ ����: 0   ���� ����: 3
		 * ***  4  ������ ����: 0   ���� ����: 3
		 *  **  5  ������ ����: 1   ���� ����: 2
		 *   *  6  ������ ����: 2   ���� ����: 1
		 * */
		
	}
}
