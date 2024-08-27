package com.programs.innerouter.assignments;
class OuterStat2
{
	String empName;
	void getDetails()
	{
		empName="john";
		System.out.println("employee name :"+empName);
		Static1.getEmpId();
		Static2.getJobName();
	}
	static class Static1
	{
		static int empId;
		static void getEmpId()
		{
			empId=10;
			System.out.println("Employeee Id :"+empId);
		}
	}
	static class Static2
	{
		String jobName;
		static void getJobName()
		{
			Static2 ob3=new Static2();
			ob3.jobName="Full Stack Developer";
			System.out.println("Job Name :"+ob3.jobName);
		}
	}
}
public class MainStatic2 {

	public static void main(String[] args) {
		OuterStat2 res=new OuterStat2();
		res.getDetails();

	}

}
