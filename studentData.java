package studentDetailsByJDBC;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class studentData {
	public static void main (String args[]) throws Exception
	{           
		String query ="select * from data";
		String url = "jdbc:mysql://localhost:3306/Student_Db";
		String username ="root";
		String password ="bindhu123";
		 Class.forName("com.mysql.jdbc.Driver"); //registering driver
			Connection con = DriverManager.getConnection(url,username,password);
			// establishing connection
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query); //rs holds the resultant table along with table headings
		    while(rs.next())
		    {
			String dataData= rs.getInt(1)+"	: "+rs.getString(2);//fetching data in form of table
			System.out.println(dataData);	
		    }
		    st.close();
			con.close();
		}

}
