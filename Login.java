import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class Login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String sno="jdbc:mysql://localhost:3306/test_db";
		String sname="hima";
		String pass="root";
		String query = "select * from student where sno=1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(sno,sname,pass);
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			
		String name = rs.getString("sname");
		String pas=rs.getString("pass");
		System.out.println(name);
		System.out.println(pas);
		}
		st.close();
		con.close();
	}

}


	