package Day3;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		do while ���� Ư¡
		do{
				���๮;
				��������;
		}while(���ǽ�);
		
		- ���ǽ��� ���̵� �����̵� ������� ������ �� ���� �����Ѵ�.
*/		
		/* ������ �� ���� �����ؾ��� �ʿ䰡 ���� �� ����ϰ�, �� ������� �ʴ°� ����. */
		
		char mode = 'q';
		Scanner scan = new Scanner(System.in); //ctrl+shife+o - �����ϰ� ����Ʈ �ϴ� ���
		do{
			System.out.println("�޴�");
			System.out.println("1. �л� ���� �߰�");
			System.out.println("2. �л� ���� ���");
			System.out.println("q. ���α׷� ����");
			System.out.println("�޴��� �����ϼ���");
			mode = scan.next().charAt(0);
		}while(mode != 'q');
		

	}

}
