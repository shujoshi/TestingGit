package selenium;


class demo{
	
	int srNO;
	int RollNo;
	int vol;
	void volume() {
		vol =  srNO * RollNo;
		System.out.println("Value is " + vol);
		
	}
}
		
		
public class ClassDemo {
   public static void main(String[] args) {
	   
	   demo mydemo1 = new demo();
	   mydemo1.srNO = 50;
	   mydemo1.RollNo = 68;
	   mydemo1.volume();
	   //System.out.println("My name is " + mydemo.srNO + " and my roll number is " + mydemo.RollNo);
	   demo mydemo2 = new demo();
	   mydemo2.srNO = 10;
	   mydemo2.RollNo = 20;
	   mydemo2.volume();
   }
}
