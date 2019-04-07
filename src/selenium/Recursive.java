package selenium;

  class demo6{
	  int a;
	  
	  int fact0(int a) {
		  if(a==1) return 1;
		  int result = fact0(a-1)+a;
		  System.out.println(result);
		  return result;
	  }
  }
  
public class Recursive {

	public static void main(String[] args) {
		demo6 obj = new demo6();
		System.out.println(obj.fact0(10));

	}

}
