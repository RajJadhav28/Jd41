package JDBCDemo21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Pro5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/quastech";
		String user="root";
		String pass="admin369";
		Connection con=DriverManager.getConnection(url, user, pass);
		Statement st=con.createStatement();
		String sql="insert into emp(EmpNo, Ename, sal) values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("Enter EmpNo:");
		ps.setInt(1, sc.nextInt());
		System.out.println("Enter the name:");
		ps.setString(2, sc.next());
		System.out.println("Enter the salary:");
		ps.setDouble(3, sc.nextDouble());
		int i=ps.executeUpdate();
		System.out.println(i+" row inserted");
	}
	
}
