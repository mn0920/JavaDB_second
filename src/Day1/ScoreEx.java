package Day1;

public class ScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ������ �� ������ �������� ����ϼ���.
		 * 0~59 : F
		 * 60~69 : D
		 * 70~79 : C
		 * 80~89 : B
		 * 90~100 : A
		 * �� ��  : ������ �� �� �Է��߽��ϴ�.
		 * */
		
		int num = -100;
		// 88���� �������� ����϶�.
		
		/*
		 * ���࿡ ������ 100���� �۰ų� ����, 90���� ũ�ų� ������ �ֿܼ� A�� ��������.
		 * ���࿡ ������ 100���� �۰ų� ����, 90���� ũ�ų� ������ �ֿܼ� B ��������.
		 * ���࿡ ������ 100���� �۰ų� ����, 90���� ũ�ų� ������ �ֿܼ� C�� ��������.
		 * ���࿡ ������ 100���� �۰ų� ����, 90���� ũ�ų� ������ �ֿܼ� D�� ��������.
		 * ���࿡ ������ 100���� �۰ų� ����, 90���� ũ�ų� ������ �ֿܼ� F�� ��������.
		 * ���࿡ ������ 0���� �۰ų�, 100���� ũ�� �ֿܼ� "������ �� �� �Է��߽��ϴ�."�� ��������.
		 * */
		
		if(num >= 0 && num <= 59) {
			System.out.println(num+"F");
		} else if(num >= 60 && num <= 69){
			System.out.println(num+"D");
		} else if(num >= 70 && num <= 79){
				System.out.println(num+"C");
		} else if(num >= 80 && num <= 89){
				System.out.println(num+"B");
		} else if(num >= 90 && num <= 100){
			System.out.println(num+"A");
		} else{
			System.out.println(num+"������ �� �� �Է��߽��ϴ�,");
		}
		
		
		// �Ʒ��� �� ��
		
		int score = 88;
		if(score <= 100 && score >= 90){
			System.out.println(score+"A");
		}
		else if(score <= 89 && score >= 80){
			System.out.println(score+"B");
		}
		else if(score <= 79 && score >= 70){
			System.out.println(score+"C");
		}
		else if(score <= 69 && score >= 60){
			System.out.println(score+"D");
		}
		else if(score <= 59 && score >= 0){
			System.out.println(score+"F");
		}
		else{
			System.out.println(score+"������ �� �� �Է��߽��ϴ�.");
		}
		
		
	}

}
