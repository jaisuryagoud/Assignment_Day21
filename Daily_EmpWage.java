public class Daily_EmpWage{

	public static void main(String[] args){
		int is_Full_Time = 1;
		int emp_Wage_Per_Hour = 20;
		int emp_Hr = 0;
		int emp_Check = (int)((Math.random() * 10)%2);

			if(is_Full_Time == emp_Check)
			{
				emp_Hr = 8;
			}

		int emp_Wage = (emp_Hr * emp_Wage_Per_Hour);
		System.out.println("Daily Emploee Wage is: "+emp_Wage);
	}

}
