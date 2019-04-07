package selenium;

public class ForEach {
    public static void main(String[] args) {
    	int numb[]= {1,2,3,4,5,6,7,8,9,10};
    	int sum = 0;
    	for (int i: numb) {
    		
    		sum +=numb[i];
    		System.out.println(sum);
    		
    	}
    	
    }
}
