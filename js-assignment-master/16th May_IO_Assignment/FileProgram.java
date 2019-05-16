import java.io.*;
class CopyDataThread extends Thread{
FileOutputStream fos;
FileInputStream fis;
// char c;
int inputData;
public CopyDataThread(FileInputStream fis,FileOutputStream fos){
	this.fis=fis;
	this.fos=fos;
}
		public void run(){
try{
			int count=0;
			while ((inputData= fis.read()) != -1) {
		             // System.out.println((char) inputData);


			count++;
			if(count==10){
				fos.write(inputData);
				fos.flush();
				// System.out.println(inputData);
				System.out.println("10 char copied");

				count=0;
				this.sleep(5000);
			}
		}

		fis.close();

fos.close();
}
catch (Exception e) {

}


}
}

class FileProgram{
public static void main(String[] args) {
try{
	FileInputStream fis= new FileInputStream("source.txt");
	FileOutputStream fos= new FileOutputStream("target.txt");
	CopyDataThread cdt= new CopyDataThread(fis,fos);
	cdt.start();


}
catch (Exception e) {

}
}


}
