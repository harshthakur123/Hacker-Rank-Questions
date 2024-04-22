import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class compareTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>a=new ArrayList<Integer>(Arrays.asList(1,22,3));
		List<Integer>b=new ArrayList<Integer>(Arrays.asList(3,2,1));
		System.out.println(compare(a, b));
		
		//System.out.println(a+" "+b.toString());

	}
	
	public static List<Integer> compare(List<Integer>a,List<Integer>b){
		
		
		Map<String, Integer>result=new HashMap<String, Integer>();
		
		for(int i=0;i<a.size() && i<b.size();i++) {
			if(a.get(i)<b.get(i)) {
				result.put("Alice", result.getOrDefault("Alice", 0)+1);
			}else if(a.get(i)==b.get(i)){
				continue;
			}
			else {
				result.put("Bob", result.getOrDefault("Bob", 0)+1);
			}
		}
		List<Integer> resultF=new ArrayList<>(result.values());
		return resultF;
		
	}

}
