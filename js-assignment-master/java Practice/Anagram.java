import java.util.Arrays;
import java.util.Scanner;
class Anagram{
public static void main(String[] args) {
  Scanner scan= new Scanner(System.in);
  String str=scan.nextLine();
  String str2=scan.nextLine();
  str=str.replace(" ","");
  str2=str2.replace(" ","");
  boolean flag=false;
  String[] strarr1=str.split("");
  String[] strarr2=str2.split("");
  Arrays.sort(strarr1);
  Arrays.sort(strarr2);
  if(strarr1.length==strarr2.length){
  for(int i=0;i<str.length();i++){
if(strarr1[i]==strarr2[i])
flag=true;
else
flag=false;

  }
  if(flag=true)
  System.out.println("Anagram");
  else
  System.out.println("no");



}
else
System.out.println("no");
}









}
