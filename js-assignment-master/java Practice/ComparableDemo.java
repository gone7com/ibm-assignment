import java.util.*;
class ComparableDemo{
        public static void main(String[] args) {
        ArrayList<Car> al= new ArrayList<Car>();
        al.add(new Car("BMW",2000));
		al.add(new Car("MERCEDES",3000));
		al.add(new Car("AUDI",1000));
        }
		Collections.sort(al,new shortByCC() )
        Iterator iterator=al.iterator();
		while(iterator.hasNext){
			System.out.println(iterator.next());
		}





}


class Car{
       String name;
       int cc;

       public Car(String name,String cc){
       this.name=name;
       this.cc=cc;
       }

       public String toString(){
       return this.cc+" "+this.name;

       }
}

class shortByCC implements Comperator<Car>{
         public int compare(Car a,Car b){
           return a.cc-b.cc;
         }
}
