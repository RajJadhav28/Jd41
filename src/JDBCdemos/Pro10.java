package JDBCdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Pro10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		Statement st=null;
		PreparedStatement ps=null;
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
			Trainer t=null;
			if(rs.next()) {
				
				int EmpNo=rs.getInt(1);
				String Ename=rs.getString(2);
				double sal=rs.getDouble(3);
				
				t=new Trainer(EmpNo, Ename, sal);
				t.setEmpNo(EmpNo);
				t.setEname(Ename);
				t.setSal(sal);
			}
			System.out.println("Details of trainer:"+t);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
