import java.util.Scanner;
class RemovingDuplicates{
public static void main(String[] args) {
RemovingDuplicates fr= new RemovingDuplicates();
fr.Remove();
      }


int Remove(){
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
    }
    else{
      flag=false;
String rep=String.valueOf(str.charAt(i));
  str=str.replace(rep,"");
      count=0;

    }


}
if(flag==true){

}
}
if(flag==true){
System.out.println("Ansewer:"+str);
return 0;
}

else{
return 0;
}
}
}
