package Day5;

import java.util.Scanner;

public class MathMethod {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* main�޼ҵ忡 �ִ� num1, num2��
		 * GCD�޼ҵ忡 �ִ� num1�� num2�� ���� �ٸ� �����̴�.*/
		
		/* �޼ҵ带 ����ϴ� ����
		 * 1. �ڵ� �ߺ��� �ּ�ȭ
		 * 2. �޼ҵ带 ����
		 * */
		
		/* �ִ������� ���ϴ� �ڵ带 �ۼ��ϼ���. */
		/* 1. �� ���� ����� ���Ѵ�.
		 * 2. ����� ����� �������� 0�� �Ǵ� ���̴�.
		 * 3. �� ���� ����� �������� ���̸鼭 ���� ū ��=�ִ�����*/
		int num1, num2;
		int gcd = 1;
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("num1�� ���� �Է����ּ���");
		num1 = scan.nextInt();
		System.out.print("num2�� ���� �Է����ּ���");
		num2 = scan.nextInt();
		
//		for(i=1;i<=num1;i++){
//			if(num1%i == 0 && num2 % i == 0){
//				gcd = i;
//			}
//		}
		gcd = GCD(num1, num2);
		System.out.println(num1+"�� "+num2+"�� �ִ������� "+gcd);
		
//		int lcm = LCM(num1, num2);
//		System.out.println(num1+"�� "+num2+"�� �ּҰ������ "+lcm);
		
		int lcm = LCM2(num1, num2);
		System.out.println(num1+"�� "+num2+"�� �ּҰ������ "+lcm);
		
	}
	
	/* 1. �޼ҵ�� : theGreatestCommonDenominator(GCD)
	 * 2. �Ű����� : num1, num2
	 * 3. ����Ÿ�� : int gcd
	 * */
	public static int GCD(int num1, int num2){
		int i;
		int gcd =1;
		for(i=1;i<=num1;i++){
			if(num1%i == 0 && num2 % i == 0){
				gcd = i;
			}
		}
		return gcd;
		}
		
		/* 1. �޼ҵ�� : theLeastCommonMultiple(LCM)
		 * 2. �Ű����� : int num1, int num2
		 * 3. ����Ÿ�� : int
		 * �ּҰ���� : lcm = A*B/gcd */		
	public static int LCM(int num1, int num2){
		int i = 0;
		for(i=num1; i<= num1*num2;i+=num1){
			if(i%num2==0){
				return i;
			}
		}
		return 1;
	}
	
	public static int LCM2(int num1, int num2){
		return num1*num2/GCD(num1,num2);
	}
	
}
