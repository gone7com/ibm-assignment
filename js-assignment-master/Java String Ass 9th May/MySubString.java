import java.util.Scanner;
class MySubString{
public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
String str=scan.nextLine();
MySubString ms= new MySubString();
ms.SubIt(str,2,5);
}

void SubIt(String str,int start,int end){
String[] newstr=str.split("");
String str2="";
for (int i=start;i<end ;i++ ) {
str2+=str.charAt(i);

}

System.out.println(str2);





}

}
