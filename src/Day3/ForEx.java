package Day3;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <=5; i++){
			for(int j = 1; j<=3; j++){
				System.out.print("*");
			}
			System.out.println();
		} //�ϴ� ���� for���� ���⼭ ������.
		
//		for���� �����ϴµ�, ���� �ִ� for���� �ȿ� �ִ� for���� ���� ��
//		���͸� �� �� ġ�� ���̶�� �����ִ�. �ȿ� �ִ� for���� *�� ��� ���̴�.
//		
// 		    j1  j2  j3
//		i1  *   *   *
//		i2  *   *   *
//		
//		�̷����� ��Ŀ�����̴�.
		
		System.out.println();
		
		/* ���� ���� - �Ʒ��� ���� �ﰢ���� ��ø �ݺ������� ���弼��*/
		
/*		*            i=1, ���� ���� : 1
		**           i=1, ���� ���� : 2
		***          i=1, ���� ���� : 3
		****         i=1, ���� ���� : 4
		*****        i=1, ���� ���� : 5 == i
		*/
		
		for (int i=1; i<=5; i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		/* ���� ���� - �Ʒ��� ���� �ﰢ���� ��ø �ݺ������� ���弼��*/
		
/*		      *      i=1, ������ ���� : 4, ���� ���� : 1
		     **      i=1, ������ ���� : 3, ���� ���� : 2
		    ***      i=1, ������ ���� : 2, ���� ���� : 3
	 	   ****      i=1, ������ ���� : 1, ���� ���� : 4
		  *****      i=1, ������ ���� : 0, ���� ���� : 5 
		                  ���� : 5 - i     ���� ���� : i  */
		
		/* ��� 1 */
		
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
		
		/* ��� 2 */
		
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
		
		/* ���� ���� - �Ʒ��� ���� �ﰢ���� ��ø �ݺ������� ���弼��*/
		
/*        *         �߰��� �� : 0
	     ** *       �߰��� �� : 1
	    *** **      �߰��� �� : 2
 	   **** ***     �߰��� �� : 3
	  ***** ****    �߰��� �� : 4
 */		
		
		/* ��� 1 */
		
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


		/* ��� 2 */		
		
/*		      *      i=1, ������ ���� : 4, ���� ���� : 1
		     ***     i=1, ������ ���� : 3, ���� ���� : 3
		    *****    i=1, ������ ���� : 2, ���� ���� : 5
	 	   *******   i=1, ������ ���� : 1, ���� ���� : 7
		  *********  i=1, ������ ���� : 0, ���� ���� : 9 
		                  ���� : 5 - i     ���� ���� : 2*i-1  */

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
		
		
		
		/* ���� ���� - �Ʒ��� ���� �ﰢ���� ��ø �ݺ������� ���弼��*/
		
		
		/* ��� 1 */
		
/*  *********  ���� : 0,   �� : 9
     *******   ���� : 1,   �� : 7
      *****    ���� : 2,   �� : 5
       ***     ���� : 3,   �� : 3
        *      ���� : 4,   �� : 1
               ���� : i-1  �� : 11-2*i
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

		
		/* ��� 2 */
		
/*      *********   ���� : 0,  ����+�� : 9
	     *******    ���� : 1,  ����+�� : 8
	      *****     ���� : 2,  ����+�� : 7
	       ***      ���� : 3,  ����+�� : 6
	        *       ���� : 4,  ����+�� : 5
	                ���� : i-1 ����+�� : 2*5-i
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
		
		/* ������ ��ü�� ����ϼ��� */
		/*���ư����������� ó������ ȥ�� �߾�!*/
		
		for (int i=1; i<10;i++){
			System.out.println(i+"��");
			for(int j=1; j<10; j++){
			System.out.println(i+"X"+ j + "=" +i * j);
			}
		}
		
		/* 2���� 100������ ��� �Ҽ��� ����ϼ��� */
		
		/* �Ҽ��Ǻ��� */
		int cnt = 0;
		int num = 10;
		System.out.println("2���� 100������ �Ҽ�");
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
