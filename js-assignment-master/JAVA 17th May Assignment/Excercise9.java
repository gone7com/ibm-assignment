import java.util.Scanner;
class Excercise9{
		public static void main(String[] args) {
				while(true){
					Scanner scan= new Scanner(System.in);
					int numb=scan.nextInt();
						Excercise9 ex= new Excercise9();
						ex.CalculateSum(numb);
				}

}
				public void CalculateSum(int numb){
					int ans=0;
							for(int i=1;i<=numb;i++){
									if((i%3==0)||(i%5==0)){
										ans+=i;
									}
								}
									System.out.println(ans);







							}




				}
