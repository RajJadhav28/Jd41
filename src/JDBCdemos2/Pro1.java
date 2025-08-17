package JDBCdemos2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Pro1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/quastech";
			String user="root";
			String pass="admin369";
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			String sql="insert into emp(EmpNo,Ename,sal) values(4,'Ramesh',5000)";
			int i=st.executeUpdate(sql);
			System.out.println(i+" row inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
