import java.util.Scanner;

class NewAdd{

public static void main(String args[]){
  int first;
  int second;
  String third;
NewAdd add= new NewAdd();
third=add.getUserOperand();
first=add.getUserInput();
second=add.getUserInput();
int answer=add.getAnswer(third,first,second);
System.out.println("answer is:"+answer);
}

int getUserInput(){
System.out.println("Enter Input to calculate");
Scanner scan= new Scanner(System.in);
  int first=scan.nextInt();
  return first;
}
String getUserOperand(){
System.out.println("Enter Operand to calculate");
Scanner scan= new Scanner(System.in);
  String first=scan.nextLine();
  return first;
}

int getAnswer(String operand,int first,int second){
  if(operand.equals("add")) {
    return first+second;
 }
if(operand.equals("sub")){
  return first-second;
}
else return 0;
}
}
