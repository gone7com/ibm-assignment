class NewConstructor{

 NewConstructor(){
this(7);
  System.out.println("New Constructor");

 }
NewConstructor(int number){
System.out.println(number);

}
void NewMethod(){
  System.out.println("new method");
}

}

class OldConstructor extends NewConstructor{

OldConstructor(){
  this(21);
  System.out.println("Old Constructor");
}
OldConstructor(int number){
  this();
System.out.println("Old Constructor2");

}
void NewMethod(){

  System.out.println("New method 2");
}


}

class MyConstructor{
public static void main(String[] args){
  OldConstructor oc = new OldConstructor();

}


}
