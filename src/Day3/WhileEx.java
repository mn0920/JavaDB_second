package Day3;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		while�� ����
		�ʱ�ȭ;
		While(���ǽ�){
		 	���๮;
			��������;
		}*/
		
		int i = 1; //�ʱ�ȭ
		while(i<=5){ // ���ǽ�
			System.out.println("Hello World"); //���๮
			i++; //��������
		}

		// while���� for������ �ٲٱ�
		//�ʱ�ȭ �κ��� ���ǽ� �տ� �����ٰ� ���̱�
		for(i = 1;i<=5;i++){ // ���ǽ�
			System.out.println("Hello World"); //���๮
			//�������� �κ��� ���ǽ� �ڷ� ���̱�
		}
		
/*		ǥ���Է�
		ǥ���Է��� ����Ϸ��� Scanner��� ���� �������Ѵ�.
		-> Scanner scan = new Scanner(System.in)
		Scanner�� �ۼ��ϸ� �ؿ� ������ ���� �����µ�,
		Scanner�� ���콺�� �����ٰ� �뼭 "java.util"�� Ŭ���Ѵ�.*/
		
/*		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("num = "+num);
		double num2 = scan.nextDouble();
		System.out.println("num2 = "+num2);
		char ch = scan.next().charAt(0);
		System.out.println("ch = "+ch);
		scan.close(); // Scanner�� ���� ������ �Ѵ�.
*/		
		//next��� ���� ���ڿ��� �Է¹޴� �ִ�.
		
		Scanner scan = new Scanner(System.in);
		char mode = 'a';
		while(!(mode == 'q' || mode == 'Q')){
				System.out.print("���α׷��� �����Ϸ��� q �Ǵ� Q�� �����ּ���. : ");
				mode = scan.next().charAt(0);
			}
			System.out.println("���α׷��� �����մϴ�.");
			scan.close();
		
	}

}
