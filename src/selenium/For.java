package selenium;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x;
       char i = 'H';
       double y = 20.875;
       System.out.println(i);
       for (x=2;x<=10;x++) {
   System.out.println("Value of x is " +x ); 
   System.out.println("Value of y is " +y );
   if (y==x) {
	   System.out.println("both values are equal");
       //break;
   }    
   y=y-2;
       
       }
	}

}
