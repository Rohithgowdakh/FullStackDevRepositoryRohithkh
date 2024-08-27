package com.programs.innerouter.assignments;
class OuterClass
{
	private String stream="cse";
	int age;
	String firstName;

	void getOuter()
	{
		InnerClass inner=new InnerClass();
		firstName="Rohith";
		inner.setEmpNo(10);
		System.out.println("employee number :"+inner.getEmpNo());
		System.out.println(firstName);
		InnerClass.getAge();
	}
	static class InnerClass
	{
		private int empNo;
		static void getAge()
		{
			OuterClass outer=new OuterClass();
			System.out.println("stream :"+outer.stream);
			outer.age=10;
			System.out.println("age :"+outer.age);
		}
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
	}
}
public class MainStatic {

	public static void main(String[] args) {
		OuterClass res=new OuterClass();
		res.getOuter();
		System.out.println("++++++++++++++");	
		OuterClass.InnerClass.getAge();

	}

}
