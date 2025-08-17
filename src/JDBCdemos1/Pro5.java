package JDBCdemos1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
			String sql="select * from emp";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.print("Id:"+rs.getInt(1)+" ");
				System.out.print("Name:"+rs.getString(2)+" ");
				System.out.print("Salary:"+rs.getDouble(3));
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
