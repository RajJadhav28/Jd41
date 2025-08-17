package JDBCdemos1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Pro8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PreparedStatement ps=null;
		Statement st=null;
		Connection con=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/quastech";
			String user="root";
			String pass="admin369";
			con=DriverManager.getConnection(url,user,pass);
			st=con.createStatement();
			String sql="select * from emp where EmpNo=?";
			ps=con.prepareStatement(sql);
			System.out.println("Enter the EmpNo:");
			ps.setInt(1, sc.nextInt());
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				rs.close();
				st.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}
}
