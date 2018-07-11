package Day3;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <=5; i++){
			for(int j = 1; j<=3; j++){
				System.out.print("*");
			}
			System.out.println();
		} //일단 위의 for문은 여기서 끝난다.
		
//		for문을 시작하는데, 위에 있는 for문은 안에 있는 for문이 끝난 후
//		엔터를 한 번 치는 것이라고 나와있다. 안에 있는 for문은 *을 찍는 것이다.
//		
// 		    j1  j2  j3
//		i1  *   *   *
//		i2  *   *   *
//		
//		이런식의 메커니즘이다.
		
		System.out.println();
		
		/* 쌤의 퀴즈 - 아래와 같은 삼각형을 중첩 반복문으로 만드세여*/
		
/*		*            i=1, 별의 갯수 : 1
		**           i=1, 별의 갯수 : 2
		***          i=1, 별의 갯수 : 3
		****         i=1, 별의 갯수 : 4
		*****        i=1, 별의 갯수 : 5 == i
		*/
		
		for (int i=1; i<=5; i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		/* 쌤의 퀴즈 - 아래와 같은 삼각형을 중첩 반복문으로 만드세여*/
		
/*		      *      i=1, 공백의 갯수 : 4, 별의 갯수 : 1
		     **      i=1, 공백의 갯수 : 3, 별의 갯수 : 2
		    ***      i=1, 공백의 갯수 : 2, 별의 갯수 : 3
	 	   ****      i=1, 공백의 갯수 : 1, 별의 갯수 : 4
		  *****      i=1, 공백의 갯수 : 0, 별의 갯수 : 5 
		                  공백 : 5 - i     별의 갯수 : i  */
		
		/* 방법 1 */
		
		for (int i=1; i<=5; i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/* 방법 2 */
		
		for (int i=1; i<=5; i++){
			for(int j=1;j<=5;j++){
				if(j<=5-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/* 쌤의 퀴즈 - 아래와 같은 삼각형을 중첩 반복문으로 만드세여*/
		
/*        *         추가된 별 : 0
	     ** *       추가된 별 : 1
	    *** **      추가된 별 : 2
 	   **** ***     추가된 별 : 3
	  ***** ****    추가된 별 : 4
 */		
		
		/* 방법 1 */
		
		for (int i=1; i<=5; i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j =1;j<=i-1;j++)			
			System.out.print("*");
			System.out.println();
		}
		
		System.out.println();


		/* 방법 2 */		
		
/*		      *      i=1, 공백의 갯수 : 4, 별의 갯수 : 1
		     ***     i=1, 공백의 갯수 : 3, 별의 갯수 : 3
		    *****    i=1, 공백의 갯수 : 2, 별의 갯수 : 5
	 	   *******   i=1, 공백의 갯수 : 1, 별의 갯수 : 7
		  *********  i=1, 공백의 갯수 : 0, 별의 갯수 : 9 
		                  공백 : 5 - i     별의 갯수 : 2*i-1  */

		for(int i =1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		/* 쌤의 퀴즈 - 아래와 같은 삼각형을 중첩 반복문으로 만드세여*/
		
		
		/* 방법 1 */
		
/*  *********  공백 : 0,   별 : 9
     *******   공백 : 1,   별 : 7
      *****    공백 : 2,   별 : 5
       ***     공백 : 3,   별 : 3
        *      공백 : 4,   별 : 1
               공백 : i-1  별 : 11-2*i
*/
		
		for(int i = 1;i<=5;i++){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*5+1-2*i;j++){ //11 = 2*5+1
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		
		/* 방법 2 */
		
/*      *********   공백 : 0,  공백+별 : 9
	     *******    공백 : 1,  공백+별 : 8
	      *****     공백 : 2,  공백+별 : 7
	       ***      공백 : 3,  공백+별 : 6
	        *       공백 : 4,  공백+별 : 5
	                공백 : i-1 공백+별 : 2*5-i
*/	

		for(int i=1; i<=5; i++){
			for(int j=1; j<=2*5-i; j++){
				if(j<= i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		/* 구구단 전체를 출력하세여 */
		/*꺄아각가ㅏ가각ㄱ 처음으로 혼자 했어!*/
		
		for (int i=1; i<10;i++){
			System.out.println(i+"단");
			for(int j=1; j<10; j++){
			System.out.println(i+"X"+ j + "=" +i * j);
			}
		}
		
		/* 2부터 100이하의 모든 소수를 출력하세요 */
		
		/* 소수판별식 */
		int cnt = 0;
		int num = 10;
		System.out.println("2부터 100이하의 소수");
		for(num=2;num<=100;num++){
			cnt = 0;
			for(int i=1;i<=num;i++){
				if(num%i==0){
					cnt++;
				}
			}
			if(cnt==2)
				System.out.println(num+" ");
			//System.out.println(cnt);
		}

		
	}

}
