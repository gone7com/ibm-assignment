import java.util.Scanner;
import java.io.*;
class ReplaceWord{

     public static void main(String[] args) {
     int line=1;
	 Scanner scan= new Scanner(System.in);
	  String str=scan.next();
	 String str1=scan.next();
	 String str2="";
	 String str3="";
	 try{
	 FileReader file= new FileReader("replace.txt");
	 BufferedReader br= new BufferedReader(file);
     while((str2=br.readLine())!=null){

		str2=str2.replaceAll(str,str1);
		str3+=str2+"\n";

	 }
	 br.close();
	 // BufferedWriter fw= new BufferedWriter(new FileReader(new File("replace.txt")));
	 BufferedWriter bw= new BufferedWriter(new FileWriter(new File("replace.txt")));
	 bw.write(str3);
	 bw.flush();
	 bw.close();
     }
	 catch(Exception e){

	 }

}
}
