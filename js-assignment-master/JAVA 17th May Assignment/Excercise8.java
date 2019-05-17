import  java.util.*;
class Excercise8{
     	public static void main(String[] args) {
     		Scanner scan = new Scanner(System.in);
			String str= scan.nextLine();
			String[] strarr=str.split(" ");
			int reverse=0;
			int[] intarr=new int[strarr.length];
				for(int k=0;k<strarr.length;k++){
					intarr[k]=Integer.parseInt(strarr[k]);
				}
		Arrays.sort(intarr);
		Excercise8 ex= new Excercise8();
		ex.getSecondSmallest(intarr);
	}

// 		for(int i=0;i<intarr.length;i++){
// if(intarr[i]==intarr[i+1]){
// 	continue;
// }
// else{
// 	System.out.println(intarr[i+1]);
// 	break;
// }
//
//
//
//
// 		}
// 			}
			public void getSecondSmallest(int[] intarr){
				for(int i=0;i<intarr.length;i++){
		if(intarr[i]==intarr[i+1]){
			continue;
		}
		else{
			System.out.println(intarr[i+1]);
			break;
		}




				}

			}
}
