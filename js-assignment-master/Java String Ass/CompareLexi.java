
import java.util.Scanner;
class CompareLexi{
public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
String str1= scan.nextLine();
String str2=scan.nextLine();
int ans=str1.compareToIgnoreCase(str2);
if(ans<0||ans>1){
  System.out.println("not equal");
}
else
System.out.println("EQUAL");
}
}
