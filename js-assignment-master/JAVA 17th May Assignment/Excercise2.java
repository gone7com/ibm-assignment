import java.util.*;
class Excercise2{
		public static void main(String[] args) {
			while(true){
				try{
					System.out.println("Enter a String");
					Scanner scan = new Scanner(System.in);
					String str=scan.nextLine();
					String[] splitstring=str.split("");
					Excercise2 ex= new Excercise2();
					if(ex.PositiveString(splitstring)){
						System.out.println("Its positive");
					}
					else{
						System.out.println("Its negative");
					}
				}
				catch (Exception e) {
					System.out.println("Enter string only");
				}


			}
		}
		public boolean PositiveString(String[] str ){
			boolean flag=false;
					for(int i=0;i<str.length-1;i++){
							if((str[i].compareToIgnoreCase(str[i+1])<0)){
									flag=true;
							}
							else{
									flag=false;
									break;
							}
					}
					return flag;


		}

}
