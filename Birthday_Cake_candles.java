import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birthday_Cake_candles {

	public static void main(String[] args) {
		List<Integer> candles=new ArrayList<Integer>(Arrays.asList(1,3,5,4,6,3,6,6));
		System.out.println(birthdayCakeCandles(candles));
		

	}
	
	public static int birthdayCakeCandles(List<Integer> candles) {
	    // Write your code here
	    int max=candles.get(0);
	    for(int i=1;i<candles.size();i++){
	        if(candles.get(i)>candles.get(i-1)){
	            max=candles.get(i);
	        }
	    }
	    int count=0;
	    for(Integer i:candles){
	        if(i==max){
	            count++;
	        }
	    }
	    return count;

	    }

}
