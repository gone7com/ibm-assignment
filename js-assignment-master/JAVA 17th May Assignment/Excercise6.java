import java.util.*;
class Excercise6{
		public static void main(String[] args) {
			boolean flag=false;

			while(true){
				try{
						System.out.println("Enter a string to add to the array");
						Scanner scan= new Scanner(System.in);
						String str=scan.nextLine();
						String[] arr= str.split(" ");
						Excercise6 ex= new Excercise6();
						ex.SortandCapital(arr);
				}
				catch (Exception e) {
					System.out.println("Enter String only");
				}
}
}

			public void SortandCapital(String[] strarr){
				int length=strarr.length;
				Arrays.sort(strarr);
				if(length%2==0){
				for(int i=0;i<(length/2);i++){
					strarr[i]=strarr[i].toUpperCase();
				}
				for(int k=(length/2)+1;k<length;k++)
						strarr[k]=strarr[k].toLowerCase();
			}
				else{
					for(int m=0;m<=(length/2)+1;m++){
						strarr[m]=strarr[m].toUpperCase();
					}
					for(int l=(length/2)+1;l<length;l++)
							strarr[l]=strarr[l].toLowerCase();
				}

				for(int j=0;j<strarr.length;j++){
					System.out.println(strarr[j]);
				}

			}
}
