import  java.util.*;
class Excercise15{
     	public static void main(String[] args) {
     		Scanner scan = new Scanner(System.in);
			String str= scan.nextLine();
			String[] strarr=str.split(" ");
			int reverse=0;
			int[] intarr=new int[strarr.length];
				for(int k=0;k<strarr.length;k++){
					intarr[k]=Integer.parseInt(strarr[k]);
				}
		Excercise15 ex= new Excercise15();
		ex.getSquares(intarr);
	}

	public void getSquares(int[] intarr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	       for (int n: intarr) {
	         map.put( n, n*n);
	       }
		   Iterator<Integer> it = map.keySet().iterator();
   while(it.hasNext()){
   Integer key = it.next();
	 System.out.println(key + " : " + map.get(key));
   }
	     }


}
