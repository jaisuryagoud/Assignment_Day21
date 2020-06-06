public class Daily_Part_Full_Time_EmpWage{
	private static final int IS_PART_TIME=1;
	private static final int IS_FULL_TIME=2;
	private static final int EMP_WAGE_PER_HOUR=20;

	public static void main(String[] args){ 
		int empHrs = 0;
		int empWage = 0;

		int emp_Check = (int)((Math.random()*10)%3);

		if(IS_FULL_TIME == emp_Check)
		{
			empHrs=16;
		}
		else if(IS_PART_TIME == emp_Check)
		{
			empHrs=8;
		}
		else
		{
			empHrs=0;
		}
		empWage=(EMP_WAGE_PER_HOUR*empHrs);
		System.out.println("Total salary: "+empWage);
	}
}
