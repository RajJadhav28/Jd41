package JDBCdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pro6 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/quastech";
			String user="root";
			String pass="admin369";
			con=DriverManager.getConnection(url,user,pass);
			st=con.createStatement();
			String sql="Select * from emp";
			rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.print("Id:"+rs.getInt(1)+" ");
				System.out.print("Name:"+rs.getString(2)+" ");
				System.out.print("Salary:"+rs.getDouble(3));
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
