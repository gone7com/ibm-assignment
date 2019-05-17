import  java.util.*;
class Excercise12{
     	public static void main(String[] args) {
			while(true){
				System.out.println("Enter the number to check");
			Scanner scan = new Scanner(System.in);
			int numb=scan.nextInt();
			Excercise12 ex= new Excercise12();
			ex.checkNumber(numb);
	
			}
}
public void checkNumber(int numb){
	boolean flag=false;
	while(numb>1){
		if(numb%2==0){
		numb=numb/2;
		flag=true;
			}
		else{
			flag=false;
			System.out.println("Number is not power of 2");
			break;
		}

	}
	if(flag){
		System.out.println("Power of two!");
	}


}

}
