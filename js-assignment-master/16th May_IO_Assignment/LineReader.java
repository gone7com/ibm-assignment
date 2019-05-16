import java.io.*;
class LineReader{
		public static void main(String[] args) {
		int charlength=0;
		int value=0;
		int linekanumber=0;
		String str="";
		int word=0;
		boolean wasLastline=false;
		boolean wasSpace=false;
		try{
		File file= new File("myfile.txt");
		FileInputStream fi= new FileInputStream(file);
		while((value = fi.read())!=-1)
		   {
            char c=(char)value;
			if(c==' '||c=='\n'){
             		// if(c=='\n'){
					// 		if(wasSpace){
					// 			continue;
					// 		}
					// }
					if(wasSpace){
					continue;
					}
					wasSpace=true;
  					word++;
			}
			else{
				wasSpace=false;

			}
			charlength++;

		   }
		   BufferedReader br= new BufferedReader(new FileReader(file));
		   while((str=br.readLine())!=null){
		   linekanumber++;

		}
		   System.out.println(charlength);
		   System.out.println("Line no-:"+linekanumber);
		   System.out.println("word no-:"+word);
		   fi.close();

	   	}
			catch (Exception e) {

			}



		}






}
