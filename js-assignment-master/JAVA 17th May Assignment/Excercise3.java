import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;
// import java.time.format.SimpleDateFormatter;
class Excercise3{
	public static void main(String[] args) {
			while(true){
				try{
					System.out.println("Enter Date in dd-mm-yyyy Pattern");
					Scanner scan = new Scanner(System.in);
					Date d1=null;
					String userdate=scan.nextLine();
					SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");

					Excercise3 ex= new Excercise3();
					ex.Difference(formatter.parse(userdate));
}
catch (Exception e) {

}






				}
	}

	void Difference(Date date1){
		try{
		String timeStamp = new SimpleDateFormat("dd-mm-yyyy").format(new Date());
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
		Date d3=formatter.parse(timeStamp);
		long diff=d3.getTime()-date1.getTime();
		System.out.println(date1.getTime());
		System.out.println(d3.getTime());
        long days = (diff / (60 * 60 *24*1000));
		int months = (int)(diff / (24*60*60*1000*12));
		int years = (int)(diff / (24*60*60*1000*12*30.41));
		System.out.println("Days:"+days);
		System.out.println("months:"+months);
		System.out.println("years:"+years);
}
catch (Exception e) {

}


	}








}
