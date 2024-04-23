
public class drawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pageCount(6, 3));
		System.out.println(pageCount(7, 3));
	}

	public static int pageCount(int n, int p) {
	    // Write your code here
	    int frontTurns=p/2;
	    int backTurns=(n/2)-(p/2);
	    return Math.min(frontTurns,backTurns);
	        
	    }
	
}
