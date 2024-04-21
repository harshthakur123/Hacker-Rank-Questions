import java.util.Scanner;

public class CheckForPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println(isPrime(1));
		int n=1;
		while(true) {
			System.out.println("Enter number : -");
			
			if(n==0 || !sc.hasNextInt() )
				break;
			n=sc.nextInt();
			System.out.println(isPrime(n));
		}

	}
	
	public static boolean isPrime(int n) {
		
		if(n<=1)
			return false;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			
			if(n%i==0) {
				
				return false;
			}
		}
		return true;
	}

}
