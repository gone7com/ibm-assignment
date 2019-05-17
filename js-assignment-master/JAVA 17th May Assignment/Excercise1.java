import java.util.*;
class Excercise1{
			public static void main(String[] args) {
				while(true){
							try{
								System.out.println("Enter a String");
							Scanner scan= new Scanner(System.in);

							StringTokenizer st1= new StringTokenizer(scan.nextLine()," ");
							int ans=0;
							String s="";

									while(st1.hasMoreTokens()){
								 	s=st1.nextToken();
									System.out.println(s);
									ans+=Integer.parseInt(s);
									}
							System.out.println("Addition is:"+ans);

						}
				catch (Exception e) {
					System.out.println("Enter numb only");
					main(new String[]{"sad","dasd"});
				}

		}
	}
}
