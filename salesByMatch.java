import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class salesByMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>pairs=new ArrayList<Integer>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
		System.out.println(sockMerchant(pairs.size(), pairs));
	}

	public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
	    Map<Integer,Integer>pairs=new HashMap<>();
	    for(Integer i:ar){
	        pairs.put(i,pairs.getOrDefault(i, 0)+1);
	    }
	    int noOfPairs=0;
	    for(int i:pairs.values()){
	        noOfPairs+=i/2;
	    }
	    
	    return noOfPairs;
	    }
	
}
