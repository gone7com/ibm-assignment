import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJdbc {

	public static void main(String[] args) {

		new FirstJdbc().GetConnection();




}


	private void GetConnection() {

		Connection dbCon=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbCon= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");


			if(dbCon!=null) {
				System.out.println("Working");
				}
		}
		catch (Exception e) {
			System.out.println("Not working"+e.getMessage());
			// TODO: handle exception
		}





	}



}
