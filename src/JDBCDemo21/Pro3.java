package JDBCDemo21;

import java.sql.Connection;
import java.sql.DriverManager;
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
			String sql="delete from emp where EmpNo=1";
			int i=st.executeUpdate(sql);
			System.out.println("successfully deleted "+i);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
