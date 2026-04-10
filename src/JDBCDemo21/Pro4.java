package JDBCDemo21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pro4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/quastech";
		String user="root";
		String pass="admin369";
		Connection con=DriverManager.getConnection(url, user, pass);
		Statement st=con.createStatement();
		String sql="select * from emp";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getDouble(3));
		}
	}
}
