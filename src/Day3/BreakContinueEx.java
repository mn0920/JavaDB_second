package Day3;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("break�� ����");
		for(int j = 1;j<=5;j++){
			for(int i = 1;i<=5;i++){
				System.out.println("j="+j+", i"+i);
				if(i==4){
					break;//if+break�� �ٷ� �����ִ� �ݺ������� ����������.
				}
			}
		}
		
		System.out.println("�̸��� �ִ� for�� break�� ����2");
		Test:
		for(int j = 1;j<=5;j++){
			for(int i = 1;i<=5;i++){
				System.out.println("j="+j+", i"+i);
				if(i==4){
					break Test;//if+break�� �ٷ� �����ִ� �ݺ������� ����������.
				}
			}
		}
		
		System.out.println("continue�� ����");
		for(int j = 1;j<=5;j++){
			for(int i = 1;i<=5;i++){
				if(i==4){
					continue;//continue�� skip���� ���̴�
				}
				System.out.println("j="+j+", i"+i);
			}
		}
		
		/*1���� 100���� ¦���� ���� continue���� �̿��Ͽ� �ۼ��ϼ���*/
		
		System.out.println("1���� 100���� ¦���� ��");
		int sum = 0;
		for(int i = 1;i<=100;i++){
			if(i%2==0)
				sum += 1;
		}
		System.out.println("1���� 100������ ¦���� ��" + sum);
			
	
	
		System.out.println("continue 1���� 100���� ¦���� ��");
		sum = 0;
		for(int i = 1;i<=100;i++){
			if(i%2==1)
				continue;//continue�� skip���� ���̴�
			sum += 1;
		}
		System.out.println("1���� 100������ ¦���� ��" + sum);
	}
}
