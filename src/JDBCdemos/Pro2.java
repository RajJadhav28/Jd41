package JDBCdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Pro2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/quastech";
			String user="root";
			String pass="admin369";
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			String sql="insert into emp(EmpNo,Ename,sal)values(5,'Mukesh',30000)";
			int i=st.executeUpdate(sql);
			System.out.println(i+" row inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
