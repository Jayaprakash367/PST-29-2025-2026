package OOPs_Concept;

public class Polymorphism_Example4 {

	public static void main(String[] args) {
      B obj=new B();
        obj.Example5();
	}
}
class classA{
	public static void Example1() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("A + B is :"+sum);
		System.out.println(floating(a,b));
		
	}
	public static float  floating(int a, int b) {
		return a+b;
	}
}
class B extends classA{
	public static void Example5() {
		int c=80;
		int d=90;
		System.out.println("The value of C:"+c);
		System.out.println("The value of C:"+d);
	}
}


