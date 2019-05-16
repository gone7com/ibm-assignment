import java.util.Scanner;
import java.io.*;
class FileInfo{
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			boolean fileexist=false;
			boolean readable=false;
			boolean writable=false;
			String filename= scan.next();
			File fr= new File(filename);
			fileexist=fr.exists();
			readable=fr.canRead();
			writable=fr.canWrite();
			if(fileexist){
				System.out.println("Exist");
			}
			else{
				System.out.println("No Such file");
			}

			if(readable){
				System.out.println("Can Read");
			}
			else{
				System.out.println("Cant Read");
			}

			if(writable){
				System.out.println("Can Write");
			}
			else{
				System.out.println("Cant write");
			}

			String name=fr.getName();
			String[] str= name.split("\\.");
		// System.out.println(name);
			System.out.println(str[1]);

			System.out.println(fr.length()+bytes);







}



}
