package Day2;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*    ������ ����� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * ������ 1���� �ڱ� �ڽű��� ����� ��������
		 * 0�� �Ǹ�, �� ���� ������ ����̴�.
		 * 
		 * 1. ������ ������ ���� num�� �ݺ������� ����� i�� �����Ѵ�.
		 * 2. i�� 1���� num���� �ϳ��� �����Ͽ� �ݺ��Ѵ�.
		 * 3. num�� i�� �������� �� �������� 0�̸� �ֿܼ� i�� ����Ѵ�.*/
		
		int num = 234, i = 0;
		System.out.print(num+"�� ��� : ");
		for(i=1; i<=num; i++){
			if(num % i == 0){
				System.out.print(i+" ");
				// println ���� ln�� ���ָ� ���ͱ���� ������� ���η� ���´�.
			}
		}
		System.out.println();
		
		/* �� ���� �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ִ����� : �� ���� ����� �� ���� ū ��
		 * ����� : �� ���� ����� ������ ���
		 * ��� : ������ �������� ���� 4�� ����� 1, 2, 4
		 * 8�� 12�� �ִ� �����
		 * 8 : 1, 2, 4, 8
		 * 12: 1, 2, 3, 4, 6, 12
		 * 8�� 12�� ����� : 1, 2, 4
		 * 8�� 12�� �ִ� ����� : 4
		 * 
		 * 1. �� ������ ������ ���� num1�� num2�� ����
		 * 2. i�� 1���� num1���� �ϳ��� �����ϸ� �ݺ�
		 * 3. num1�� i�� �������� �� �������� 0�̰�,
		 *    num2�� i�� �������� �� �������� 0�̸�
		 *    �ֿܼ� i�� ����Ѵ�.*/
		
		int num1 = 8;
		System.out.print(num1+"�� ��� : ");
		for(i=1; i<=num1; i++){
			if(num1 % i == 0){
				System.out.print(i+" ");
			}
		}
		
		System.out.println();

		int num2 = 12;
		System.out.print(num2+"�� ��� : ");
		for(i=1; i<=num2; i++){
			if(num2 % i == 0){
				System.out.print(i+" ");
			}
		}
		

		System.out.println();

		int gcd = 1; // gcd : �ִ�������� �ǹ�
		System.out.print(num1+"�� "+num2+"�� ����� : ");
		for(i=1; i<=num1; i++){
			if(num1 % i ==0 && num2 % i == 0){
				gcd = i;
			}
		}		
		System.out.print(gcd);
		//�ּҰ���� : lcm
		

		System.out.println();

		
		
	}

}
