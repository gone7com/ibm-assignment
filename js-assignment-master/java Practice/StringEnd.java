import java.util.Scanner;
class StringEnd{
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    String original=scan.nextLine();
    String checkstr=scan.nextLine();
    int originallength=original.length();
    int length=checkstr.length();
    boolean flag=false;
String substr=original.substring(originallength-length,originallength);
if(substr.equals(checkstr)){
  System.out.println("It Ends");
}
else
System.out.println("It Does Not");
    // for (int i=originallength-1;i<originallength-length-1 ;i++ ) {
    //   if(original.charAt(i))
    //
    // }
  }
}
