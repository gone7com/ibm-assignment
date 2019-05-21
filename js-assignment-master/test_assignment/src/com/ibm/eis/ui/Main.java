package com.ibm.eis.ui;
	import java.util.Scanner;
// import java.util.HashMap;
	import com.ibm.eis.bean.Employee;
	import com.ibm.eis.service.EmployeeService;
	import com.ibm.eis.service.ServiceClass;

	public class Main {
		
		public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
		
			EmployeeService service=
					new ServiceClass();
while(true) {
			System.out.println("Press 1:To Enter Employee Details ");
			System.out.println("Press 2:To Find ");
			System.out.println("Press 3:To Display All Details Of an Employee ");
System.out.println("Press 4:TO Exit");
			int choice=scan.nextInt();
			scan.hasNextLine();
			String salary;
			String designation;
			String name;
			String id;
			if(choice==1) {
				scan.nextLine();
				System.out.println("enter id");
				 id=scan.nextLine();
				 boolean idvalid=service.checkId(Integer.parseInt(id));	
				 if(idvalid) {
						System.out.println("Id Already exist");
//						main(new String[] {"asd"});
					continue;
					}
				 System.out.println("enter name");
			 name=scan.nextLine();
			System.out.println("enter Salary ");
			 salary=scan.nextLine();
			
			System.out.println("enter Designation ");
			 designation=scan.nextLine();
			
			
			Employee employee = new Employee();
			employee.setSalary(Integer.parseInt(salary));
			employee.setId(Integer.parseInt(id));
			
			
			 
				employee.setDesignation(designation);
				employee.setName(name);
				int newsal=Integer.parseInt(salary);
				service.setScheme(newsal,designation,employee);
				
				service.storeIntoMap(Integer.parseInt(id),employee);
				
				
				System.out.println("__________________________");
				System.out.println(service.displayEmployee());
				System.out.println("__________________________");
				
			
			}
			else if(choice==2) {
			System.out.println("Enter 1. To Find Scheme Through Salary and Designation");
		
			
			
				String salary3=scan.next();
				String designation2=scan.next();
				service.getScheme(Integer.parseInt(salary3),designation2);
			}
			
			
			else if(choice==3) {
				System.out.println("Enter the id of an Employee");
				int id2=scan.nextInt();
				System.out.println("---------------------------------");
				System.out.println(service.displayEmployee().get(id2));
				System.out.println("-------------------------------");
				
				
			}
			else if(choice==4) {
				System.exit(0);
			}
}
	}

}
