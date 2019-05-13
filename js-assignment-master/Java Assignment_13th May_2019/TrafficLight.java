import java.util.Scanner;
class TrafficLight {
public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
System.out.println("ENTER RED GREEN OR YELLOW:");
while(true){
String signal=scan.nextLine();
if(signal.equals("red")){
System.out.println("STOP");
break;
}
else if(signal.equals("green")){
System.out.println("GO");
break;
}
else if(signal.equals("yellow")){
System.out.println("WAIT");
break;
}
else{
  System.out.println("Enter AGAIN FROM ABOVE OPTION");
}
}



}
}
