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
try{
un.Check(first,last);
}
catch(Exception e){
System.out.println(e.getMessage());
}
}



public void Check(String fn,String ln)throws MyException{


if(fn.equals(""))
throw new MyException("First Name not Entered");



if(ln.equals(""))
throw new MyException("Last Name not Entered");
}


}
