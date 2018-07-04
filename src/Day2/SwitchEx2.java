package Day2;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문자 ch가 a 또는 A면 A입니다라고 콘솔에 출력하고,
		 * 문자 ch가 b 또는 B면 B입니다라고 콘솔에 출력하고,
		 * 문자 ch가 a, b, A, B가 아니면 A와 B가 아닙니다.
		 * 라고 콘솔에 풀력하는 예제를 switch case문으로 작성하세요.*/
		
		/* 1. 문자형 변수 ch 선언 및 초기화
		 * 2. switch문에 변수자리에 ch입력
		 * 3. ch값이 a이면 A입니다. 출력후 switch case를 빠져나옴
		 * 4. ch값이 a이면 A입니다. 출력후 switch case를 빠져나옴
		 * 5. ch값이 b이면 B입니다. 출력후 switch case를 빠져나옴
		 * 6. ch값이 b이면 B입니다. 출력후 switch case를 빠져나옴
		 * 7. ch값이 a, A, b, B가 아니면 A와 B가 아닙니다 출력후 빠져나옴*/

		
		char ch = 'a';  //문자형변수 변수명 '문자' 
		                //문자란에 숫자를 작성한다면 아스키 코드표에 나와있는 문자가 나옵니다.
		                //숫자로 작성할때는 작은 따옴표를 작성하지 않아도 됩니다.
		switch(ch){
		case 'a' : // ch값이 a이면
		     System.out.println(ch+"는 A입니다.");
		     break;
		case 'A':  //case에는 변수가 들어갈 수 없다.
		     System.out.println(ch+"는 A입니다.");
		     break;
		case 'b':
			System.out.println(ch+"는 B입니다.");
			break;
		case 'B':
			System.out.println(ch+"는 B입니다.");
			break;
		default:
			System.out.println(ch+"는 A와 B가 아닙니다.");
		}
		
		char ch2 = 'A';  //문자형변수 변수명 '문자' 
        //문자란에 숫자를 작성한다면 아스키 코드표에 나와있는 문자가 나옵니다.
        //숫자로 작성할때는 작은 따옴표를 작성하지 않아도 됩니다.
		switch(ch2){
		case 'a': // ch값이 a이면
		case 'A':
			System.out.println(ch2+"는 A입니다.");
			break;
		case 'b':
		case 'B':
			System.out.println(ch2+"는 B입니다.");
			break;
		default:
			System.out.println(ch2+"는 A와 B가 아닙니다.");
		}
	}

}
