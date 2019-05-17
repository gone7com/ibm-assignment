import  java.util.*;
class Excercise11{
     	public static void main(String[] args) {
     		Scanner scan = new Scanner(System.in);
			String str= scan.nextLine();
			String[] strarr=str.split("");

 			int[] intarr=new int[strarr.length];
			Excercise11 ex= new Excercise11();
			ex.checkNumber(intarr,strarr);
// 				for(int k=0;k<strarr.length;k++){
// 					intarr[k]=Integer.parseInt(strarr[k]);
// 				}
// 		for(int i=0;i<intarr.length-1;i++){
// if(intarr[i]<=intarr[i+1]){
// 	continue;
// }
// else if(intarr[i]>intarr[i+1]){
// 	System.out.println("Its not increasing");
// 	break;
// }
//
//
//


			}


			public void checkNumber(int[] intarr,String[] strarr){
				boolean flag=false;
			 intarr=new int[strarr.length];
					for(int k=0;k<strarr.length;k++){
						intarr[k]=Integer.parseInt(strarr[k]);
					}
			for(int i=0;i<intarr.length-1;i++){
	if(intarr[i]<=intarr[i+1]){
		flag=true;
		continue;
	}
	else if(intarr[i]>intarr[i+1]){
		System.out.println("Its not increasing");
		break;
	}

	}
	if(flag){
		System.out.println("Its Increasing");
	}



			}

}
