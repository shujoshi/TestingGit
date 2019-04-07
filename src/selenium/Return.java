package selenium;


class demo1{
	
	int srNO;
	int RollNo;
	int vol;
	double volume() {
		vol = srNO * RollNo;
		return vol;
		//System.out.println("Value is " + vol);
		
	}
}
		
		
public class Return {
   public static void main(String[] args) {
	   double result;
	   demo1 mydemo1 = new demo1();
	   mydemo1.srNO = 50;
	   mydemo1.RollNo = 68;
	   mydemo1.volume();
	   result = mydemo1.volume();
	   System.out.println("Result is " + result);
	   demo1 mydemo2 = new demo1();
	   mydemo2.srNO = 10;
	   mydemo2.RollNo = 20;
	   mydemo2.volume();
	   result = mydemo2.volume();
	   System.out.println("Result 2 is " + result);
   }
}
