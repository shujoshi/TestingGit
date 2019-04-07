package selenium;
   
  class Overload{
	  int  val;
	  double val1;
	   void test() {
		   
		   System.out.println("Without Attribute");
	   }
	   
	   int test(int a) {
		   
		    val = a * a;
		    
		    return  val;
	   }
	   
	   double test(double a, int b) {
	   
	   val1 = a + b;
	   return val1;
   }
  }
public class MethodOverload {

	public static void main(String args[]) {
		int x;
		double result;
		Overload obj = new Overload();
    obj.test();
   
    x = obj.test(5); 
    System.out.println(x);
    
    
    result = obj.test(13.05, 12);
    System.out.println(result);
    
		
	}
}
