package Day3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* �迭�� �̿��Ͽ� �л� 5���� ������ Ű���带 ���� �ް�,
		 * Ű���带 ���� �Է¹��� ������ ����ϴ� �ڵ带 �ۼ��ϼ���*/
/*		1. �迭����
		2. Scanner�� �̿��� scan����
		3. �ݺ����� �̿��Ͽ� �л� ������ Ű����� ����
		4. �ݺ����� �̿��Ͽ� �Է¹��� �л��� ������ ���*/
		int score[] = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < score.length; i++){//���⼭�� ������ i�� 0���� �������־���Ѵ�. �ֳ��ϸ� �迭�� 0���� ����־��� ������
			System.out.println("�л� "+(i+1)+"�� ������ �Է��ϼ��� : ");
			score[i] = scan.nextInt();
		}
		for(int i = 0; i < score.length;i++){
			System.out.println("�л� "+(i+1)+"�� ���� : "+score[i]);
		}
		
		
		/* �л����� ����� ���ϴ� �ڵ带 �ۼ��ϼ��� */
		int sum = 0;
		double avg = 0.0;
		for(int i = 0; i < score.length; i++){ //score1.length = score1�迭�� ���� �ִ� ����
			sum = sum + score[i];  // sum += score[i]; ���� �ٿ� �� �� �ִ�.
			avg = avg + (double)score[i]/score.length; //avg += (double)score[i]/score.length; ���� �ٿ��� �� �ִ�.
		}
			System.out.println("�л����� ��� ���� : " + sum/5.0);
			System.out.println("�л����� ��� ���� : " + (double)sum/score.length);
			System.out.println("�л����� ��� ���� : " + avg);
	}
	
		
		
}


