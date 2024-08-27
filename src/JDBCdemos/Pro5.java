package JDBCdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Pro5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/quastech";
			String user="root";
			String pass="admin369";
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			String sql="Update emp set sal=35000 where EmpNo=2";
			int i=st.executeUpdate(sql);
			System.out.println(i+" row updated");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
