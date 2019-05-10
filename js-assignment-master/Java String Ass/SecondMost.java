import java.util.Scanner;
class SecondMost{

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String str= scan.nextLine();
int first=0;
int second=0;
int[] count=new int[str.length()];
int count1=0;
boolean flag=false;
for (int i =0;i<str.length()-1;i++ ) {
  for(int j=0;j<str.length();j++){
  if(str.charAt(i)==str.charAt(j)){
    count1++;
  }
}
count[i]=count1;
count1=0;
}
for(int k=0;k<count.length-2;k++){
for(int l=0;l<count.length-1;l++){
  if(k==l)
  continue;
if(count[k]>count[l]){
  first=k;
  second=k+1;
}
else if(count[k]<count[l]){
  first=k+1;
  second=k;
}


}
}
System.out.println(str.charAt(second));
//     if(i==j)
//     continue;
//
// if(str.charAt(i)==str.charAt(j)){
// if(i==1){
// count1++;
// }
// else{
// count2++;
//
//
// }
// if(count2>count1)
// int count3=0;
// count3=count1;
// count1=count2;
// count2=count3;
// }



  }

}
