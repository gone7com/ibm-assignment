import java.util.Scanner;
class Vowels{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String str= scan.nextLine();
int count=0;
for(int i=0;i<str.length();i++){
switch (str.charAt(i)){

case 'a':
count++;
break;

case 'e':
count++;
break;

case 'i':
count++;
break;

case 'o':
count++;
break;

case 'u':
count++;
break;



}


}

System.out.println(count);





}









}
