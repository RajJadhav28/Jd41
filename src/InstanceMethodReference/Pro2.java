package InstanceMethodReference;

interface AverageCal{
	public int AvgCal();
}
public class Pro2 {
	public int calculateAvg() {
		int arr[]= {10,20,30,40,50,60};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Pro2 obj=new Pro2();
		AverageCal a1=obj::calculateAvg;
		System.out.println("Average:"+a1.AvgCal());
	}

}
