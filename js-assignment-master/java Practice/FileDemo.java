import java.io.*;
class FileDemo{
   	public static void main(String[] args) {
      try{
		 FileWriter fw= new FileWriter(new File("dheeraj.txt"));
		 fw.write("hey\nthis\nis\ndheeraj joshi");
		 fw.flush();
		 fw.close();
		 BufferedReader br= new BufferedReader(new FileReader(new File("dheeraj.txt")));
		 		String str="";
				while((str=br.readLine())!=null){

					System.out.println(str);
				}
		 // PrintWriter pw = new PrintWriter("dheeraj.txt");
		 // pw.append("hey yaaa dheeraj");
		 // pw.flush();
		 // pw.close();


         }
catch(Exception e){
}
   	}
}
