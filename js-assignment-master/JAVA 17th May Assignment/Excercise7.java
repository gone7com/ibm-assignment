import  java.util.*;
class Excercise7{
     	public static void main(String[] args) {
     		Scanner scan = new Scanner(System.in);
			String str= scan.nextLine();
			String[] strarr=str.split(" ");
			int reverse=0;
			int[] intarr=new int[strarr.length];
				for(int k=0;k<strarr.length;k++){
					intarr[k]=Integer.parseInt(strarr[k]);
				}
				Excercise7 ex= new Excercise7();
				ex.getSorted(intarr);
// 			for(int i=0;i<intarr.length;i++){
// 				int rev_num=0;
// 				while(intarr[i]>0){
// 				rev_num = rev_num*10 + intarr[i]%10;
// 	   intarr[i] = intarr[i]/10;
//    }
//    intarr[i]=rev_num;
// }
//
// 		Arrays.sort(intarr);
// for(int j=0;j<intarr.length;j++){
// 	System.out.println(intarr[j]);
// }
			}
			public void getSorted(int[] intarr){
				for(int i=0;i<intarr.length;i++){
					int rev_num=0;
					while(intarr[i]>0){
					rev_num = rev_num*10 + intarr[i]%10;
		   intarr[i] = intarr[i]/10;
	   }
	   intarr[i]=rev_num;
	}

			Arrays.sort(intarr);
	for(int j=0;j<intarr.length;j++){
		System.out.println(intarr[j]);
	}
			}
}
