package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class Pro3 {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/quastech";
		String user="root";
		String pass="admin369";
		Connection con=DriverManager.getConnection(url, user, pass);
		Statement st=con.createStatement();
		String sql="select * from emp";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println("Id:"+rs.getInt(1)+" ");
			System.out.println("Name:"+rs.getString(2));
			System.out.println("Salary:"+rs.getDouble(3));
			System.out.println();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
