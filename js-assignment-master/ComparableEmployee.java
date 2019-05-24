import java.lang.String;
import java.util.*;

class ComparableEmployee{
	public static void main(String[] args) {
	ArrayList<Employee> al= new ArrayList<Employee>();
  while(true){
	System.out.println("Press 1.To add Employe ");
	System.out.println("Press 2.To short Employes list ");
	Scanner scan= new Scanner(System.in);
	int choice= scan.nextInt();
	scan.nextLine();
	if(choice==1){
	System.out.println("Enter Employee Name:");
	String name= scan.nextLine();
	System.out.println("Enter Employee age:");
	int age=scan.nextInt();
	System.out.println("Enter Employee id:");
	int id=scan.nextInt();
	System.out.println("Enter Employee Adress:");
scan.nextLine();
	String Address=scan.nextLine();
	al.add(new Employee(name,id,age,Address));
	}
				if(choice==2){
	System.out.println("Press 1.To short by FirstName:");
	System.out.println("Press 2.To short by LastName:");
	System.out.println("Press 3.To short by Id:");
	int byname=scan.nextInt();
						if(byname==1){
						Collections.sort(al,new shortbyFirstName());
				         Iterator iterator=al.iterator();
					     while(iterator.hasNext())
						 System.out.println(iterator.next());

						}
						if(byname==2){
						Collections.sort(al,new shortbyLastName());
				         Iterator iterator=al.iterator();
					     while(iterator.hasNext())
						 System.out.println(iterator.next());

						}
						if(byname==3){
						Collections.sort(al,new shortbyId());
				         Iterator iterator=al.iterator();
					     while(iterator.hasNext())
						 System.out.println(iterator.next());

						}
                }
  }
  }
				}






class Employee{
	String Name;
	int Id;
	int Age;
	String Address;

	public Employee(String name,int id,int Age,String Address){
	this.Name=name;
	this.Id=id;
	this.Age=Age;
	this.Address=Address;
	}


	@Override
	public String toString(){
		return this.Name+" "+this.Age+" "+this.Id+" "+this.Address;
	}




}

class shortbyFirstName implements Comparator<Employee>{
	@Override
	public int compare(Employee a,Employee b){
		return a.Name.split(" ")[0].compareToIgnoreCase(b.Name.split(" ")[0]);
	}
}
class shortbyLastName implements Comparator<Employee>{
	@Override
	public int compare(Employee a,Employee b){
String[] arr=a.Name.split(" ");
String[] arr2=b.Name.split(" ");
		if(arr.length==1||arr2.length==1){
		return a.Name.split(" ")[0].compareToIgnoreCase(b.Name.split(" ")[0]);
	}
	else{
		return a.Name.split(" ")[1].compareToIgnoreCase(b.Name.split(" ")[1]);
	}
	}
}
class shortbyId implements Comparator<Employee>{
	@Override
	public int compare(Employee a,Employee b){
		return a.Id-b.Id;
	}
}
