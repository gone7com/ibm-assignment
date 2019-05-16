import java.io.*;
class FileRead{

     public static void main(String[] args) {
     int line=1;
	 String str="";
	 try{
	 FileReader file= new FileReader("myfile.txt");
	 BufferedReader br= new BufferedReader(file);
     while((str=br.readLine())!=null){
		System.out.println(line+str);
		line++;

	 }

     }
	 catch(Exception e){

	 }

}
}
