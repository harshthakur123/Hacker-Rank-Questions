
public class PrintPrimeTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrime(65);

	}
	public static void printPrime(int n) {
		if(n<=1)
			System.out.println(n+" is not a prime number!!!");
		
		for(int i=2;i<=n;i++) {
			boolean flag=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=false;
				}
			}
			if(flag) {
				System.out.print(i+" ");
			}
		}
		
	}

}
