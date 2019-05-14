import java.util.Scanner;
public class Client{
Scanner scan= new Scanner(System.in);

public static void main(String[] args) {
Client c= new Client();
c.UseBook();
}
public void UseBook(){
Client client= new Client();
    System.out.println("Press 1.To search book");
  System.out.println("Press 2.To add book(BUT PLEASE PRESS 2)");

int choice=scan.nextInt();
if(choice==2){
  System.out.println("Enter the book name:");

String bookname=scan.next();
if(client.setbookname(bookname)!=true){
  client.UseBook();
}
else{
System.out.println("Enter the book price:");
int price=scan.nextInt();
Book cl= new Book();
cl.addItem(bookname,price,cl);
System.out.println(Book.itemarr[0].getprice());
}
}


}
public boolean setbookname(String name){
  if(name==""){
  System.out.println("please enter book name");
  return false;
  }
  else{
    return true;
  }



}

}
