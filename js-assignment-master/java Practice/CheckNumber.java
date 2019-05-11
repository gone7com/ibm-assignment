import java.util.Scanner;
class CheckNumber{
public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
 String fl= scan.nextLine();
 Double d1= Double.parseDouble(fl);
if (d1.isNaN()) {
  System.out.println("Its a not number");
}

else {
  System.out.println("Is a number");
}

scan.close();

}






}
