package Day2;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*정수가 홀수인지 짝수인지 판별하는 코드를 If문을 이용하여 작성*/
		//주의 : 비교할땐 == 이거 사용. 대화문은 ""사용.
		// =을 하나면 사용한다면, num 에다가 뒤에 있는 숫자를 넣는다는 뜻이다.
		
	int num1 = 11;
	if((num1 %2) == 0){
		System.out.println(num1+"는 짝수입니다..");
	}else{
		System.out.println(num1+"는 홀수입니다.");	
	}
	}
}


