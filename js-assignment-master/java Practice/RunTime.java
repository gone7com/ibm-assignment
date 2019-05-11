interface Car{
void Company();
void color();
}

class Audi implements Car{

public void Company(){
  System.out.println("This is Audi");
}

public void color(){
  System.out.println("Color is grey");
}

}

class BMW implements Car{

public void Company(){
  System.out.println("This is BMW");
}

public void color(){
  System.out.println("Color is Blue");
}

}

 class RunTime{
public static void main(String[] args) {
Car [] c= new Car[2];
  c[0]= new BMW();
  c[1]=new Audi();
for (Car car :c ) {
  car.Company();
}
}
}
