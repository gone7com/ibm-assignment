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
ug.Check(first);

}
public void Check(int age){

  try{
  if(age<15){
  throw new MyException("Enter age grater than 15");
  }
  }
  catch (MyException e) {
    System.out.println(e.getMessage());
  }
  }

}
