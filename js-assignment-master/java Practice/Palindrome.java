import java.util.Scanner;
class Palindrome{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String str= scan.nextLine();
String[] arr=str.split("");
int length=str.length()-1;
int start=0;
int middle=(start+length)/2;
boolean flag=true;
for(int i =start;i<=middle;i++){
  if(str.charAt(start)==str.charAt(length)){
    start++;
    length--;
  }


  else
  flag=false;
  break;
}

System.out.println(flag);
}
}
