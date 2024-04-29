
public class Beautiful_Days_at_the_Movies {

	public static void main(String[] args) {
		System.out.println(beautifulDays(20, 23, 6));

	}
	public static int beautifulDays(int i, int j, int k) {
	    // Write your code here
	    int beautifulDays=0;
	    for(int a=i;a<=j;a++){
	        int temp=a;
	    	String reverse=new StringBuilder(String.valueOf(a)).reverse().toString();
	    	int rev=Integer.parseInt(reverse);
	    	if((temp-rev)%k==0) {
	    		beautifulDays++;}
	    	}
	        return beautifulDays;
	    }

}
