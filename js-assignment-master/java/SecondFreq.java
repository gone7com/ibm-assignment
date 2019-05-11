import java.util.Arrays;
import java.util.Scanner;
class SecondFreq{
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String str= scan.nextLine();

SecondFreq sf= new SecondFreq();
sf.Find(str);
}

void Find(String str){
String[] strarr= str.split("");
int max=0;
int count=0;
int index=0;
int sm=0;
int temp=0;
int indexm=0;
int si=0;
int tempi=0;
Arrays.sort(strarr);
for(int i=0;i<strarr.length;i++){
// count=0;
for(int j=i+1;j<strarr.length;j++){
if(i==j){
// System.out.println("ooooo");
continue;

}
if(strarr[i]!=strarr[j]){
System.out.println("0000000000000000000000");

}
// if(strarr[i].equals(strarr[j])){
else if(strarr[i].equals(strarr[j])){
System.out.println("111111111111111111111");
  count+=1;
}
}
System.out.println("this is count:"+count);
if(max==0){
max=count;
}
else if(sm<count){
sm=count;
si=i;
}

 if(sm>max){
temp=max;
max=sm;
sm=temp;
tempi=indexm;
indexm=si;
si=tempi;

}
System.out.println(strarr[i]);
}
System.out.println(indexm+" "+si);
System.out.println(strarr[indexm]);

}
}
