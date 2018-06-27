package Day1;

public class Variable {
	public static void main(String[] args) {
       // 변수 규칙
	   //int 1num; // 변수명 처음에는 숫자가 올 수 없기 떄문에 숫자밑에 빨간 줄.
       //int num%; // 특수문자는 $와 _만 가능
       //int int; // 키워드 사용불가
       //int num 1 // 공백 사용불가
       int num; 
       //int num; // 동일한 변수는 선언 불가
       int Num; // 대소문자 구별하여 다른 변수로 취급
       
       // 변수관례
       int studentScore;
       /* 2단어 이상으로 변수명을 만들 경우 두번째 단어부터는 첫글자를 대문자로 한다.
        *  : 카멜표기법*/
       // 변수명을 조금 귀찮더라도 변수명을 보고 해당하는 역할을 알 수 있어야한다.
       
       num = 10;
       // 문장을 먼들떄 꼭 ;을 찍어주어야한다.
       // 10 = num; (X)
       // 오른쪽에는 변수가 나와야하고 오른쪽에는 값이 나와야한다.
      
       
       System.out.println("num = 10 : "+num);
       //""문자열 ''문자
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
       ch = '한';
       System.out.println("ch = '한' : " + ch);
       //ch는 2bite라서 한글도 표기가 가능하다.
       
       //boolean : 변수확인예제
       boolean isTrue = false;
       System.out.println("isTrune = False :" + isTrue);
       isTrue = true;
       System.out.println("isTrue = true : " + isTrue);
       
	}

}
