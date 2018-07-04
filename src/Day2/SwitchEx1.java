package Day2;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1권 146페이지
		 * 
		 * switch(변수){
		 * 		case 값1:   //if(변수 == 값1)
		 *		실행문1;
		 * 		break;  //실행문1이 실행이 되고 값1과 맞다면, 결과가 바로 도출된다. 아니라면 case2로 넘어감
		 *              -> break가 있으면 변수값이 값1일 때, 실행문 1만 실행하고,
		 *                 없으면 변수값이 1일 때 실행문1과 실행문2가 같이 실행됨.
		 * case 값2:        //else if(변수 == 값2)
		 * 		실행문2;
		 * 		break;
		 * default:         //else
		 * 		실행문3
		 * }
		 * */

		/* num의 값이 0이면 콘솔에 0입니다라고 출력하고,
		 * num의 값이 1이면 콘솔에 1입니다라고 출력하고,
		 * num의 값이 0과 1이 아니라면 콘솔에 0과 1이 아닙니다.
		 * 라고 출력하는 예제
		 * */
		
		int num = 2;
		switch(num){
		case 0: //if(num == 0)
		     System.out.println(num+"는 0입니다.");
		     break;
		case 1: //else if(num ==1)
			System.out.println(num+"는 1입니다.");
			break;
		default: //else와 같기 때문에 이 말의 뜻은 그냥 나며지. 값을 작성안해도 됨
			System.out.println(num+"는 0과 1이 아닙니다.");;
		}
		
	}
}