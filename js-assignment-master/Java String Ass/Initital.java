import java.util.Scanner;
class Initital{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String str= scan.nextLine();
String[] strarr=str.split(" ");
for (int i=0;i<strarr.length ; i++) {

  System.out.print(strarr[i].charAt(0));

}
}
}
