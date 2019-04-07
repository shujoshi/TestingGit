package selenium;

public class Varargs {

	static void val(int ... v) {
		System.out.println("Length of argument pass " + v.length);
		for (int y:v) {
			
			System.out.println("Value of argument is "+ y);
		}
		
	}
	public static void main(String args[]) {
		// TODO Auto-generated method stub
      val(10);
      val(10,20,30,40);
      val();
	}

}
