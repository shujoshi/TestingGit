package selenium;
class demo5{
	int a,b;
	demo5(int x, int y){
		a = x;
		b = y;
		}
	void math(demo5 obj) {
		obj.a *=2;
		obj.b /=2;
		
	}
}
public class CallbyReference {
  public static void main(String args[]) {
	demo5 obj = new demo5(10,20);
	System.out.println("Value before method exeution is " + obj.a + "," + obj.b);
	obj.math(obj);
	
	System.out.println("Value after method executin is " + obj.a + "," + obj.b);
}
}