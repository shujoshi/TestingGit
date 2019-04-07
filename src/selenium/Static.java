package selenium;

public class Static {
  static int a = 40;
  static int b;
  static {
	  b= a*4;
  }
  static void meth(int x) {
	  System.out.println("Value of a is " + a);
	  System.out.println("Value of b is " + b);
	  System.out.println("Value of x is " + x);
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
meth(42);
	}

}
