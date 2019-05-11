interface Car{
void run();
void color();
 void wheels();
 static void seat(){};
}

class Audi implements Car{

public void run(){
System.out.println("This is Audi");
}
public void color(){
  System.out.println("Color is grey");
}
public void wheels(){
  System.out.println("Abstract method");
}

}

public class MyInterface{
 public static void main(String[] args) {
  Audi ai= new Audi();
  ai.run();
  ai.color();
  ai.wheels();
}


}
