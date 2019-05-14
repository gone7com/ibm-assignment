package book;
class Book extends WrittenItem{
  private int id_num;
  private String title;
  private int price;
   static Book[] itemarr=new Book[100];
  private static int index=0;

  public void addItem(String title,int price,Book book){
  book.setname(title);
  book.setPrice(price);
Book.itemarr[index]=book;
  }
}
