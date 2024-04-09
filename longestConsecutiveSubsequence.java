import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestConsecutiveSubsequence {

	public static void main(String[] args) {
		
	int[] arr= {1,2,4,6,5,4,3,8,9,10};	
	System.out.println(longestSubSeq(arr, arr.length));	
	
	}
	
	public static int longestSubSeq(int[] arr,int n) {
		int count=0;
		Arrays.sort(arr);
		List<Integer> aL=new ArrayList<Integer>();
		aL.add(arr[0]);
		
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]) {
				aL.add(i);
			}
		}
		
		for(int i=1;i<n;i++) {
			if(aL.get(i)==aL.get(i-1)+1) {
				count++;
			}else {
				count=1;
			}
		}
		
		
		
		return count;
		
		
		
	}
	
	
	
}



