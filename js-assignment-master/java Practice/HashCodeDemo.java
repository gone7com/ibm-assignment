import java.util.HashMap;
class HashCodeDemo{
public static void main(String[] args) {


HashMap hm= new HashMap();
hm.put(new Fsd(1,"dheeraj"),"key1");
hm.put(new Fsd(2,"hello"),"key2");
hm.put(new Fsd(1,"akash"),"key3");
hm.put(new Fsd(2,"hello"),"key3");
for (Object fd1 :hm.keySet() ) {
Fsd fd= (Fsd) fd1;
	System.out.println(fd1);
}
}



}

class Fsd{
Integer id;
String name;
public Fsd(Integer id,String name){
this.id=id;
this.name=name;
}

//public String toString(){
//return this.name;
//}

public boolean equals(Fsd fsd){
return this.name.equals(fsd.name);
}

public int hashCode(){
	return this.id;
}



}
