package JDBCdemos;

public class Trainer {
	private int EmpNo;
	private String Ename;
	private double sal;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int empNo, String ename, double sal) {
		//super();
		EmpNo = empNo;
		Ename = ename;
		this.sal = sal;
	}
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Trainer [EmpNo=" + EmpNo + ", Ename=" + Ename + ", sal=" + sal + "]";
	}
	

}
