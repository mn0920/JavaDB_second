package Day1;

public class ScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 정수로 된 성적을 학점으로 출력하세요.
		 * 0~59 : F
		 * 60~69 : D
		 * 70~79 : C
		 * 80~89 : B
		 * 90~100 : A
		 * 그 외  : 성적을 잘 못 입력했습니다.
		 * */
		
		int num = -100;
		// 88점을 학점으로 출력하라.
		
		/*
		 * 만약에 성적이 100보다 작거나 같고, 90보다 크거나 같으면 콘솔에 A를 찍으세요.
		 * 만약에 성적이 100보다 작거나 같고, 90보다 크거나 같으면 콘솔에 B 찍으세요.
		 * 만약에 성적이 100보다 작거나 같고, 90보다 크거나 같으면 콘솔에 C를 찍으세요.
		 * 만약에 성적이 100보다 작거나 같고, 90보다 크거나 같으면 콘솔에 D를 찍으세요.
		 * 만약에 성적이 100보다 작거나 같고, 90보다 크거나 같으면 콘솔에 F를 찍으세요.
		 * 만약에 성적이 0보다 작거나, 100보다 크면 콘솔에 "성적을 잘 못 입력했습니다."를 찍으세요.
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
			System.out.println(num+"성적을 잘 못 입력했습니다,");
		}
		
		
		// 아래는 쌤 답
		
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
			System.out.println(score+"성적을 잘 못 입력했습니다.");
		}
		
		
	}

}
