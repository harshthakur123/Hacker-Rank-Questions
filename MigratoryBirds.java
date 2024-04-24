import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,1,2,2,3));
		
		System.out.println(migratoryBirds(arr));

	}
	
	public static int migratoryBirds(List<Integer> arr) {
	    // Write your code here
	        Collections.sort(arr);
	        Map<Integer,Integer>type=new HashMap<>();
	        for(Integer i:arr){
	            type.put(i,type.getOrDefault(i, 0)+1);
	        }
	        int max=0;
	        
	       for(int i:type.values()) {
	    	   if(i>max) {
	    		   max=i;
	    	   }
	       }
	       int typeId = 0;
	       for(Map.Entry<Integer, Integer> entry:type.entrySet()) {
	    	   if(entry.getValue()==max) {
	    		   typeId=entry.getKey();
	    	   }
	       }
	        
	        return typeId;
	    }

}
