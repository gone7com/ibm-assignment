import java.util.Scanner;
class MyException extends Exception
{
    public MyException(String s)
    {

        super(s);
  }
}

public class UserName{
public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
System.out.println("First Name:");
String first= scan.nextLine();
System.out.println("Last Name:");
String last= scan.nextLine();
UserName un= new UserName();
un.Check(first,last);
}

public void Check(String fn,String ln){

try{
if(fn.equals(""))
throw new MyException("First Name not Entered");
}
catch (MyException e) {
  System.out.println(e.getMessage());
}
try{
if(ln.equals(""))
throw new MyException("Last Name not Entered");
}
catch (MyException e) {
  System.out.println(e.getMessage());
}
}
}
