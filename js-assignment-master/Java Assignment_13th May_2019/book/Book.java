package book;
public class Book extends WrittenItem{
  private int id_num;
  private String title;
  private int price;
  public static Book[] itemarr = new Book[10];
  private static int index=0;

  public void addItem(String title,int price,Object book){
  ((Book)book).setname(title);
  ((Book)book).setPrice(price);
  Book.itemarr[index]=(Book)book;
  }
}
