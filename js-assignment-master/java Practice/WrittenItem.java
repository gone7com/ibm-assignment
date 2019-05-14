package book;
abstract class WrittenItem extends Item{
private int id_num;
private String title;
private int price;
 static WrittenItem[] itemarr;
private static int index;
// public int getid(){
// return this.id_num;
// }
public void setname(String name){
this.title=name;
}
public void Item(){
System.out.println("");
}
public void setPrice(int price){
  this.price=price;
}
public String getid(){
  System.out.println("asdsad"+this.title);
return this.title;
}
public int getprice(){
  System.out.println("asdsad"+this.title);
return this.price;
}
public  void setid(int id){
   this.id_num=id;
}

public void addItem(String title,int price ,Book book ){
// Book wi= new Book();
// wi.setname(title);
// wi.setPrice(price);
  // WrittenItem.itemarr[index]=wi;
  // index++;
}
public String toString(){
return this.title;
}
}
