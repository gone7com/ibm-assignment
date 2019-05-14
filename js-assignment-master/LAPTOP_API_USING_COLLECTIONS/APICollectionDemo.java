import java.util.ArrayList;
import java.util.*;
class Laptop{
    private Integer ramSize, hddSize,id;
    private String brand;

    Laptop(int id,int ramSize, int hddSize, String brand ){
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.brand = brand;
        this.id=id;
    }

    //Creating the getters
    public Integer getRamSize(){
        return this.ramSize;
    }
    public Integer getid(){
        return this.id;
    }

    public Integer getHddSize(){
        return this.hddSize;
    }

    public String getBrand(){
        return this.brand;
    }

     public String toString(){
       return "ID is:"+this.id+" "+"Ram is :"+this.ramSize+" "+" HardDisk is:"+this.hddSize+" "+"Brand is:"+this.brand;
     }





}

class APICollectionDemo{


    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
ArrayList<Laptop> list = new ArrayList<Laptop>();
APICollectionDemo ap= new APICollectionDemo();
ap.Selection(list);
        // ArrayList list = new ArrayList();


    }

    public void Selection(ArrayList list){

    System.out.println("Press 1.To Enter a new Laptop");
    System.out.println("Press 2.To View all Laptop Details");
    System.out.println("Press 3.Search a laptop");
    System.out.println("Press 4.To Delete a laptop BY ID");
    System.out.println("Press 5.To UPDATE Laptop");
APICollectionDemo ap= new APICollectionDemo();
while(true){
    int choice=scan.nextInt();
    if(choice==1){
    System.out.println("Enter Laptop id,ram,disk and Name");
    ap.addNew(list,ap);
    System.out.println(new Laptop(7,12,232,"sdsd").getid());
  ap.Selection(list);
    }
else if(choice==2){
  ap.ShowAll(list);

  ap.Selection(list);
}
else if(choice==5){
  System.out.println("Enter id to update");
int id=scan.nextInt();
ap.Update(id,list);
  ap.Selection(list);
}

else if(choice==4){
System.out.println("Enter id of the laptop you want to search:");
int id= scan.nextInt();
ap.Searchit(id,list);
  ap.Selection(list);
}
// else if(choice==3){
//   ap.(list);
//
//   ap.Selection(list);
// }


  }

}

  public void ShowAll(ArrayList list){
Iterator iterator=list.iterator();
while(iterator.hasNext()){

System.out.println(iterator.next());
  }
}


    public void addNew(ArrayList<Laptop> list,APICollectionDemo ap){
boolean flag=true;
int id=scan.nextInt();
int ram=scan.nextInt();
int disk=scan.nextInt();
String name=scan.next();
Laptop laptop3 = new Laptop(id,ram,disk,name);

          for(int i=1;i<=list.size();i++){
          if(id==list.get(i-1).getid()){
            flag=false;
          }
        }
          System.out.println(flag);
if(flag){
  list.add(laptop3);
  System.out.println("GOOOO");
ap.Selection(list);
}

    else{
      System.out.println("ID already exist");
      ap.Selection(list);
          }

}
public void Searchit(int id,ArrayList<Laptop> list){

for(int i=0;i<=list.size();i++)
if(id==list.get(i).getid()){
// System.out.println(list.get(i).getid());
  list.remove(i);
  // System.out.println("qazqazqaz");
  System.out.println(list);
}

else{
  System.out.println("no");
}

}

public void Update(int id,ArrayList<Laptop> list){
boolean flag=false;
int ind=0;
for(int i=0;i<list.size();i++){
if(id==list.get(i).getid()){
flag=true;
ind=i;
break;
}

}
if(flag){
int index=list.indexOf(list.get(ind));
int id2=scan.nextInt();
int ram=scan.nextInt();
int disk=scan.nextInt();
String name=scan.next();
Laptop laptop3 = new Laptop(id2,ram,disk,name);

list.set(index,laptop3);
}
else{
  System.out.println("there is no laptop with that id");
}
}
}
