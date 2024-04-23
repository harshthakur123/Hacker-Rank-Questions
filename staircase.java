import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class staircase {

	public static void main(String[] args) {
		staircase(5);
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		//miniMaxSum(list);
	}
	
	
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
	    Collections.sort(arr);
	    int min=0,max=0;
	    for(int i=0;i<arr.size()-1;i++){
	        min+=arr.get(i);
	    }
	    for(int i=1;i<arr.size();i++){
	        max+=arr.get(i);
	    }
	    System.out.println(min+" "+max);

	    }
	
		public static void staircase(int n) {
//			StringBuilder builder = new StringBuilder();
//		    for (int i = 0; i <n ; i++) 
//		        builder.append(" ");
//		    int j = 0;
//
//		    for (int i = 1; i <=n; i++) {
//		        builder.replace(builder.length()-i,          
//		        builder.length() - j, "#");
//		        System.out.println(builder);
//		        j++;
//			
//		}
			
			for(int i=1;i<=n;i++) {
				for(int j=n-i;j>0;j--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("#");
				}
				System.out.println();
			}

	}
}



