package Day2;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���� ch�� a �Ǵ� A�� A�Դϴٶ�� �ֿܼ� ����ϰ�,
		 * ���� ch�� b �Ǵ� B�� B�Դϴٶ�� �ֿܼ� ����ϰ�,
		 * ���� ch�� a, b, A, B�� �ƴϸ� A�� B�� �ƴմϴ�.
		 * ��� �ֿܼ� Ǯ���ϴ� ������ switch case������ �ۼ��ϼ���.*/
		
		/* 1. ������ ���� ch ���� �� �ʱ�ȭ
		 * 2. switch���� �����ڸ��� ch�Է�
		 * 3. ch���� a�̸� A�Դϴ�. ����� switch case�� ��������
		 * 4. ch���� a�̸� A�Դϴ�. ����� switch case�� ��������
		 * 5. ch���� b�̸� B�Դϴ�. ����� switch case�� ��������
		 * 6. ch���� b�̸� B�Դϴ�. ����� switch case�� ��������
		 * 7. ch���� a, A, b, B�� �ƴϸ� A�� B�� �ƴմϴ� ����� ��������*/

		
		char ch = 'a';  //���������� ������ '����' 
		                //���ڶ��� ���ڸ� �ۼ��Ѵٸ� �ƽ�Ű �ڵ�ǥ�� �����ִ� ���ڰ� ���ɴϴ�.
		                //���ڷ� �ۼ��Ҷ��� ���� ����ǥ�� �ۼ����� �ʾƵ� �˴ϴ�.
		switch(ch){
		case 'a' : // ch���� a�̸�
		     System.out.println(ch+"�� A�Դϴ�.");
		     break;
		case 'A':  //case���� ������ �� �� ����.
		     System.out.println(ch+"�� A�Դϴ�.");
		     break;
		case 'b':
			System.out.println(ch+"�� B�Դϴ�.");
			break;
		case 'B':
			System.out.println(ch+"�� B�Դϴ�.");
			break;
		default:
			System.out.println(ch+"�� A�� B�� �ƴմϴ�.");
		}
		
		char ch2 = 'A';  //���������� ������ '����' 
        //���ڶ��� ���ڸ� �ۼ��Ѵٸ� �ƽ�Ű �ڵ�ǥ�� �����ִ� ���ڰ� ���ɴϴ�.
        //���ڷ� �ۼ��Ҷ��� ���� ����ǥ�� �ۼ����� �ʾƵ� �˴ϴ�.
		switch(ch2){
		case 'a': // ch���� a�̸�
		case 'A':
			System.out.println(ch2+"�� A�Դϴ�.");
			break;
		case 'b':
		case 'B':
			System.out.println(ch2+"�� B�Դϴ�.");
			break;
		default:
			System.out.println(ch2+"�� A�� B�� �ƴմϴ�.");
		}
	}

}
