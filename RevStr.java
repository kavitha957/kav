
public class RevStr {
	 
	public static class NumberReverse {
	 
	    public int reverseNumber(int number){
	         
	        int rev = 0;
	        while(number != 0){
	            rev = (rev*10)+(number%10);
	            number = number/10;
	        }
	        return rev;
	    }
	     
	    public static void main(String a[]){
	        NumberReverse nr1 = new NumberReverse();
	        System.out.println("Result: "+nr1.reverseNumber(345678));
	    }
	}
}
