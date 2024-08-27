package p1.polymorphism;

public class IndependentClassInP1Package {
	
	public IndependentClassInP1Package()
	{
		Protection p=new Protection();
		System.out.println("It is IndependentClassInP1Package class constructor");
	//	System.out.println("private_a :"+p.private_a);
		System.out.println("protected_b :"+p.protected_b);
		System.out.println("default_c :"+p.default_c);
		System.out.println("public_d :"+p.public_d);
		System.out.println("+++++++++++++++++");
	}
	public static void main(String[]args) {
		IndependentClassInP1Package o=new IndependentClassInP1Package();
	}
}

