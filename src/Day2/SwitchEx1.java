package Day2;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1�� 146������
		 * 
		 * switch(����){
		 * 		case ��1:   //if(���� == ��1)
		 *		���๮1;
		 * 		break;  //���๮1�� ������ �ǰ� ��1�� �´ٸ�, ����� �ٷ� ����ȴ�. �ƴ϶�� case2�� �Ѿ
		 *              -> break�� ������ �������� ��1�� ��, ���๮ 1�� �����ϰ�,
		 *                 ������ �������� 1�� �� ���๮1�� ���๮2�� ���� �����.
		 * case ��2:        //else if(���� == ��2)
		 * 		���๮2;
		 * 		break;
		 * default:         //else
		 * 		���๮3
		 * }
		 * */

		/* num�� ���� 0�̸� �ֿܼ� 0�Դϴٶ�� ����ϰ�,
		 * num�� ���� 1�̸� �ֿܼ� 1�Դϴٶ�� ����ϰ�,
		 * num�� ���� 0�� 1�� �ƴ϶�� �ֿܼ� 0�� 1�� �ƴմϴ�.
		 * ��� ����ϴ� ����
		 * */
		
		int num = 2;
		switch(num){
		case 0: //if(num == 0)
		     System.out.println(num+"�� 0�Դϴ�.");
		     break;
		case 1: //else if(num ==1)
			System.out.println(num+"�� 1�Դϴ�.");
			break;
		default: //else�� ���� ������ �� ���� ���� �׳� ������. ���� �ۼ����ص� ��
			System.out.println(num+"�� 0�� 1�� �ƴմϴ�.");;
		}
		
	}
}