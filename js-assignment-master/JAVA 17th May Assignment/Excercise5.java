import java.util.Scanner;;
class Excercise5{
public static void main(String[] args) {
	while(true){
		try{
		System.out.println("Enetr the int to find sum of cube of the int digits");
Scanner scan= new Scanner(System.in);
int number=scan.nextInt();
int sum=0;
			while(number>0){
		int sum2=number%10;
		sum+=sum2*sum2*sum2;
		number=number/10;
			}
			System.out.println(sum);
}
catch (Exception e) {
	System.out.println("Enter int only");
	main(new String[]{"sad","dasd"});
}
}
}



}
