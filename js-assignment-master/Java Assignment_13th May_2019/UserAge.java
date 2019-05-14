import java.util.Scanner;
class MyException extends Exception
{
    public MyException(String s)
    {

        super(s);
  }
}

public class UserAge{
public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
System.out.println("Enter Age:");
int first= scan.nextInt();
UserAge ug= new UserAge();
try{
ug.Check(first);
}
catch(Exception e){
  System.out.println(e.getMessage());
}
}
public void Check(int age) throws MyException{
  if(age<15){
  throw new MyException("Enter age grater than 15");

  }
  }

}
