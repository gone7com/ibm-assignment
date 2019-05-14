package com.cg.eis.exception;
import java.util.Scanner;
class MyException extends Exception
{
    public MyException(String s)
    {

        super(s);
  }
}

class UserSalary{
public static void main(String... args) {
Scanner scan= new Scanner(System.in);
System.out.println("First Name:");
int first= scan.nextInt();

UserSalary un= new UserSalary();
try{
un.Check(first);
}
catch(Exception e){
  System.out.println(e.getMessage());
}

}

public void Check(int sal) throws MyException{

if(sal<3000)
throw new MyException("Salary is less then 3000");
}
}
