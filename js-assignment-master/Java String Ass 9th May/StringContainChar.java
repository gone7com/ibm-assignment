import java.util.Scanner;
class StringContainChar{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String str= scan.nextLine();
String cr= scan.nextLine();
int length=cr.length();
boolean flag=false;
for(int i=0;i<str.length()-(length-1);i++){
  String newstr=str.substring(i,i+length);
  if(newstr.equals(cr)){
    System.out.println("Match");
flag=true;
break;
  }
}
  if(flag==false){
    System.out.println("False");
  }
}
}
