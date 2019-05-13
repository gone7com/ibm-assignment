import java.util.Scanner;
class PrimeNumber{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int number=scan.nextInt();
PrimeNumber pn= new PrimeNumber();
pn.CountPrime(number);
}

public void CountPrime(int val){
System.out.println("Prime numbers till"+val+"are:");
boolean flag=false;
for(int i=2;i<=val;i++){
for(int j=1;j<=val/2;j++){
if(j==1)
continue;
if((i%j)!=0){
flag=true;
break;
}
else{
flag=false;
break;
}
}
if(flag){
  System.out.println(i);
  }
flag=false;
}

}













}
