package JDBCdemos1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Pro7 {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		PreparedStatement ps=null;
		Statement st=null;
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/quastech";
			String user="root";
			String pass="admin369";
			con=DriverManager.getConnection(url,user,pass);
			st=con.createStatement();
			String sql="insert into emp (EmpNo,Ename,sal)values(?,?,?)";
			ps=con.prepareStatement(sql);
			System.out.println("Enter the EmpNo:");
			ps.setInt(1, sc.nextInt());
			System.out.println("Enter Ename:");
			ps.setString(2, sc.next());
			System.out.println("Enter sal:");
			ps.setDouble(3, sc.nextDouble());
			int i=ps.executeUpdate(sql);
			System.out.println(i+" row inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			con.close();
			ps.close();
			st.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
