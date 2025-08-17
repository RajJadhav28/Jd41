package JDBCdemos1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import JDBCdemos.Trainer;

public class Pro9 {
	public static void main(String[] args) throws SQLException {
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
			if(!rs.isBeforeFirst()) {
				System.out.println("User does not exist.");
			}else {
			while(rs.next()) {
				
				int EmpNo=rs.getInt(1);
				String Ename=rs.getString(2);
				Double sal=rs.getDouble(3);
				
				t=new Trainer();
				t.setEmpNo(EmpNo);
				t.setEname(Ename);
				t.setSal(sal);
				System.out.println(t);
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
			ps.close();
			st.close();
		}
		sc.close();
	}
}
