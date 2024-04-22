import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class add_Set_Of_N_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>nums=new ArrayList<Integer>(Arrays.asList(2,3,42,5,35,43,34,67));
		add(nums,3);
		//nums.stream().sorted().collect(Collectors.toList());
		Collections.sort(nums,Collections.reverseOrder());
		System.out.println(nums);
		
	}
	
	public static void add(List<Integer>s,int set) {
		
		for(int i=0;i<s.size()-set;i++) {
			int sum=0; 
			for(int j=0;j<set;j++) {
				System.out.print(s.get(i+j)+" ");
				sum+=s.get(i+j);
			}
			
			System.out.println(" , Sum = "+sum);
		}
	}

}
