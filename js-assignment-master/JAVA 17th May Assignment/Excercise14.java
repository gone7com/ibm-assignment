import java.util.*;
class Excercise14{
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String str= scan.nextLine();
			char[] c= str.toCharArray();
			Excercise14 ex= new Excercise14();
			ex.charCounter(c);


		}

 		public void charCounter(char[] carr){
			HashMap<Character, Integer> CountMap = new HashMap<Character, Integer>();

			for (char c : carr) {
		   if (CountMap.containsKey(c)) {
			   CountMap.put(c, CountMap.get(c) + 1);
		   }
		   else {
			   CountMap.put(c, 1);
		   }
	   }

	   for (Map.Entry entry : CountMap.entrySet()) {
		   System.out.println(entry.getKey() + " " + entry.getValue());
	   }
   }





}
