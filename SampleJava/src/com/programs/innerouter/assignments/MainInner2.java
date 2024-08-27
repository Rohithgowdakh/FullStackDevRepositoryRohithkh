package com.programs.innerouter.assignments;
class Outer2Inn
{
	private String lastName="MANU";
	int age;
	
	void getName()
	{
		Inner1 ob1=new Inner1();
		System.out.println("First Name :"+ob1.firstName);
		ob1.getInner1();
	}
	void getAgeStream()
	{
		Inner2 ob2=new Inner2();
		ob2.setStream("CSE");
		System.out.println("Stream :"+ob2.getStream());
		age=30;
		System.out.println("age is :"+age);
	}
	private class Inner1
	{
		private String firstName="Rohith";
		void getInner1()
		{
			System.out.println("Last Name :"+lastName);
		}
		
	}
	private class Inner2
	{
		private String stream;

		public String getStream() {
			return stream;
		}

		public void setStream(String stream) {
			this.stream = stream;
		}
		
	}
}
public class MainInner2 {

	public static void main(String[] args) {
		Outer2Inn res=new Outer2Inn();
		res.getName();
		res.getAgeStream();
	}

}
