package Day1;

public class Variable {
	public static void main(String[] args) {
       // ���� ��Ģ
	   //int 1num; // ������ ó������ ���ڰ� �� �� ���� ������ ���ڹؿ� ���� ��.
       //int num%; // Ư�����ڴ� $�� _�� ����
       //int int; // Ű���� ���Ұ�
       //int num 1 // ���� ���Ұ�
       int num; 
       //int num; // ������ ������ ���� �Ұ�
       int Num; // ��ҹ��� �����Ͽ� �ٸ� ������ ���
       
       // ��������
       int studentScore;
       /* 2�ܾ� �̻����� �������� ���� ��� �ι�° �ܾ���ʹ� ù���ڸ� �빮�ڷ� �Ѵ�.
        *  : ī��ǥ���*/
       // �������� ���� �������� �������� ���� �ش��ϴ� ������ �� �� �־���Ѵ�.
       
       num = 10;
       // ������ �յ鋚 �� ;�� ����־���Ѵ�.
       // 10 = num; (X)
       // �����ʿ��� ������ ���;��ϰ� �����ʿ��� ���� ���;��Ѵ�.
      
       
       System.out.println("num = 10 : "+num);
       //""���ڿ� ''����
       //10 : 10*1+1*0 = 10
       num = 0x11;
       System.out.println("num = 0x11 : "+num);
       //0x11 : 16*1+1*1+17
       num = 012;
       //012 : 8*1+1*2 = 10
       System.out.println("num = 012 : "+num);
       double num2 = 1.234;
       System.out.println("num2 = 1.234 : "+num2);
       num2 = 1.234e3;
       System.out.println("num2 = 1.234e3 : "+num2);
       
       
       char ch ='A';
       System.out.println("ch = A : " + ch);
       ch = '��';
       System.out.println("ch = '��' : " + ch);
       //ch�� 2bite�� �ѱ۵� ǥ�Ⱑ �����ϴ�.
       
       //boolean : ����Ȯ�ο���
       boolean isTrue = false;
       System.out.println("isTrune = False :" + isTrue);
       isTrue = true;
       System.out.println("isTrue = true : " + isTrue);
       
	}

}
