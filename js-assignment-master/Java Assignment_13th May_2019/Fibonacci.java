import java.util.Scanner;
class Fibonacci{
 static int n1=1;
 static int n2=1;
 static int n3=0;
 public static void main(String args[]){
  Scanner scan= new Scanner(System.in);
  int count= scan.nextInt();
  System.out.print(n1+" "+n2);
  MyFibonacci(count-2);
}

static void MyFibonacci(int count){
   if(count>0){
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.print(" "+n3);
        MyFibonacci(count-1);
    }
}


}
