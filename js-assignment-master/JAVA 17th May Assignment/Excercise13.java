import java.util.*;
class Excercise13{
 public static void main(String args[]){
   HashMap<Integer,String> hm=new HashMap<Integer,String>();
	  hm.put(100,"Amit");
	  hm.put(101,"Vijay");
	  hm.put(102,"Rahul");
	  Excercise13 ex= new Excercise13();
	  ex.getValues(hm);

  }
public void getValues(HashMap<Integer,String> mp){
	  ArrayList<String> al= new ArrayList<String>();
	  for(Map.Entry m:mp.entrySet()){
	       al.add((String)m.getValue());
	 }
	 Collections.sort(al);
Iterator iterator= al.iterator();
while(iterator.hasNext()){
System.out.println("ans:"+iterator.next());
}
 }
}
