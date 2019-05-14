package book;
import java.util.Scanner;
public abstract class Item{
private String id_num;
private String title;
private int numb_cop;

public abstract void Item();
public abstract String getid();
public abstract void setid(int id);
public abstract String toString();
public abstract void addItem(String title,int price,Object book);
}
