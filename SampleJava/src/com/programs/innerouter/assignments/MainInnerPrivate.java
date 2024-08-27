package com.programs.innerouter.assignments;
class Employee
{
	String empName;
	int empAge;
	Inner1 ob1=new Inner1();
	void getName()
	{
		
		ob1.setEmpNo(10);
		empName="John";
		System.out.println("employee name :"+empName);
		System.out.println("employee number :"+ob1.getEmpNo());
		ob1.getInner();
	}
		class Inner1
		{
			private int empNo;
			

			public int getEmpNo() {
				return empNo;
			}


			public void setEmpNo(int empNo) {
				this.empNo = empNo;
			}


			void getInner()
			{
				empAge=30;
				System.out.println("employee age :"+empAge);
			}
		
		}
}
public class MainInnerPrivate {

	public static void main(String[] args) {
		Employee object=new Employee();
		object.getName();
		object.ob1.getInner();
		
	}

}
