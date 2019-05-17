import java.util.Scanner;
class Excercise10{
		public static void main(String[] args) {
				while(true){
					Scanner scan= new Scanner(System.in);
					int numb=scan.nextInt();
					Excercise10 ex= new Excercise10();
					ex.CalculateDifference(numb);
				}
			}
				public void CalculateDifference(int numb){
					int ans=0;
					int ans2=0;
					int ans3=0;
							while(numb!=0){
										ans+=1;
										ans2+=ans;
										ans3+=ans*ans;
										numb--;

								}
								ans2=ans2*ans2;
									System.out.println("Answer:"+(ans2-ans3));







							}




				}
