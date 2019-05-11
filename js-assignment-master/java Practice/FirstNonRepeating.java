import java.util.Scanner;
class FirstNonRepeating{
public static void main(String[] args) {
FirstNonRepeating fr= new FirstNonRepeating();
fr.NonRepeating();
      }


int NonRepeating(){
  Scanner scan= new Scanner(System.in);
  String str=scan.nextLine();
  boolean flag=false;
  int i=0;
  int j=0;
  int count=0;
  for (i=0;i<str.length()-1;i++ ){
for (j=0;j<str.length() ;j++ ) {
  if(i==j)
  continue;
    if(str.charAt(i)!=str.charAt(j)){
      flag=true;
      count=i;
  System.out.println(str.charAt(i)+" "+str.charAt(j));
    }
    else{
      flag=false;
      System.out.println("match"+str.charAt(i));
      count=0;
      break;
    }


}
if(flag==true){
  break;
}
}
if(flag==true){
System.out.println("Ansewer:"+str.charAt(count));
return 0;
}

else{
return 0;
}
}
}
