package JDBCdemos3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Pro2 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/quastech";
		String user="root";
		String pass="admin369";
		Connection con=DriverManager.getConnection(url, user, pass);
		Statement st=con.createStatement();
		String sql="delete from emp where EmpNo=3";
		int i=st.executeUpdate(sql);
		System.out.println(i+" row deleted");
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
