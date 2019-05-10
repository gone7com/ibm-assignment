class MyInheritance{
protected void myFirst(){
System.out.println("Its my first method");
}

 void mySecond(){
System.out.println("Its my second method");

}
}

class Dheeraj extends MyInheritance{
public void myFirst(){
  System.out.println("Dheeraj my first method");

}






}
public class FirstInheritance{
public static void main(String[] args){
MyInheritance mydheeraj= new Dheeraj();
mydheeraj.myFirst();
  mydheeraj.mySecond();
}


}
