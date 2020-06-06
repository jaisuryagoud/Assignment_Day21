public class EmpStatus{
	public static final int is_Full_Time = 1;

	public static void main(String[] args){
		//int is_Full_Time = 1;
		int emp_Status = (int)((Math.random() * 10)%2);
		if(is_Full_Time == emp_Status)
		{
			System.out.println("Employee is Present");
			System.out.println(emp_Status);
		}
		else
		{
			System.out.println("Employee is Abscent");
		}
	}
}
