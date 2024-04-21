import java.util.HashMap;
import java.util.Map;

public class countDistinctElements {

	public static void main(String[] args) {
		String str="Kyo nahi Ho Rahi padHai";
		Map<Character, Integer> count=new HashMap<Character, Integer>();
		for(char ch:str.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(count);
		
	}

}
