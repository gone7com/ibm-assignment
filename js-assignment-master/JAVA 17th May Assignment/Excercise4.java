import java.util.Scanner;
class Excercise4{
	public static void main(String[] args) {
				while(true){
					try{
					System.out.println("Enter a username");
						Scanner scan= new Scanner(System.in);
						String str= scan.nextLine();
						String[] strarr=str.split("_");
						if(str.length()>12){
							if(Character.isDigit(str.charAt(0))){
								System.out.println("First char cant be a number");
								main(new String[]{"sad","dasd"});

							}
							if(strarr[1].equals("job")){
								System.out.println("Passed!");

							}
							else{
								System.out.println("Failed! Enter _job at the end of username");
							}
						}
						else{
							System.out.println("Enter username of length greater than 8");
							main(new String[]{"sad","dasd"});
						}
}
catch (Exception e) {
	System.out.println("Enter valid username with _job at end");
}
				}
	}

}
