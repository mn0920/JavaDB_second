package Day5;

import java.util.Scanner;

public class MethodEx1 {
		// �޼ҵ�� class�ȿ��� ������ �ȴ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �޼ҵ� : Ư�� ����� �ϵ��� ��Ƴ��� �ڵ� 
		 * �޼ҵ� �Է�(�Ű�����)�� ���(����Ÿ��)�� �ʿ��ϴ�.
		 * �׷��� ��Ȳ�� ���� �Է°� ����� �ʿ� ���� �� �� �ִ�.
		 * �޼ҵ��� �⺻ ����
		 * public static void main(String[] args)
		 * [����������(public)] [static] ���(void) �޼ҵ��̸�(main)(�Ű�������(String[] args)){
		 * 		����;
		 * }
		 * ���Ǳ�� ����
		 * ���(�޼ҵ�)   : ���� ���Ǳ�
		 * �Է�(�Ű�����) : ��, ���ø޴�
		 * ���(����Ÿ��) : ���õ� �����
		 * */
//		 System.out.println("Hello world"); //�Է��� ������ ����� ����
//		 Scanner scan = new Scanner(System.in);  //����� ������ �Է��� ����. 
//		 int num = scan.nextInt();
		 
		 /* �� ���� �����ڰ� �־����� �� ��������� �ϴ� �ڵ带 �ۼ��ϼ���. */

		 
		 int num1 = 3, num2 = 5;
		 char op = '/';
		 double res = 0.0;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("num1�� �Է����ּ���");
		 num1 = scan.nextInt();
		 System.out.println("num2�� �Է����ּ���");
		 num2 = scan.nextInt();
		 System.out.println("�����ڸ� �Է��ϼ���");
		 op = scan.next().charAt(0);
		 /* op�� +��� 
		  * num1�� num2�� ���� �� �� ����� res�� �����Ѵ�.
		  * op�� +�� �ƴ϶� - ��� 
		  * num1�� num2�� �� �� �� ����� res�� �����Ѵ�.
		  * op�� +, -�� �ƴϰ� * ��� 
		  * num1�� num2�� ���� �� �� ����� res�� �����Ѵ�.
		  * op�� +, -, *�� �ƴϰ� %���
		  * num1�� num2 ���� �������� res�� �����Ѵ�.
		  * op�� +, -, *�� �ƴϰ� /���
		  * num1�� num2 ���� ���� �� res�� �����Ѵ�.*/
//		 if(op == '+'){
//			 res = num1 + num2;			 
//		 }else if(op == '-'){
//			 res = num1 - num2;
//		 }else if(op == '*'){
//			 res = num1 * num2;
//		 }else if(op == '%'){
//			 res = num1 % num2;
//		 }else if(op == '/'){
//			 res = (double)num1 / num2;
//		 }else{
//			 System.out.println("�����ڸ� �߸��Է��Ͽ����ϴ�.");
//		 }
//		���� �ִ� ���� �����µ� �۵��� �ȴٴ� ���� �츮�� ���� �޼ҵ尡 ���� �Ѵٴ� ������!
		 res = calculate(num1, num2, op);
		 //num1, num2, op(�Ű�����)
		 //res (����Ÿ��)
		 System.out.println(""+num1+op+num2+"="+res);	 
	}
		 
		 // ���������� �޼ҵ��̸�(�Ű�������){
		 //     ����
		 //  }
		 public static double calculate(int num1, int num2, char op){
			 double res = 0.0;
			 if(op == '+'){
				 res = num1 + num2;			 
			 }else if(op == '-'){
				 res = num1 - num2;
			 }else if(op == '*'){
				 res = num1 * num2;
			 }else if(op == '%'){
				 res = num1 % num2;
			 }else if(op == '/'){
				 res = (double)num1 / num2;
			 }else{
				 System.out.println("�����ڸ� �߸��Է��Ͽ����ϴ�.");
			 }			 
			 return res;
		 }
}
