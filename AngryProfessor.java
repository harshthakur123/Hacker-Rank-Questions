import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class AngryProfessor {

	public static void main(String[] args) {
		
		List<Integer>l1=new ArrayList<Integer>(Arrays.asList(-3,-1,3,4));
		System.out.println(angryProfessor(3,l1));
		
		System.out.println(angryProfessor(2,l1));

	}
	public static String angryProfessor(int k, List<Integer> a) {
	    // Write your code here
	        int studentsOnTime=0;
	        for(int i:a){
	            if(i<=0){
	                studentsOnTime++;
	                System.out.println(studentsOnTime);
	            }
	        }
	        if(studentsOnTime<=k){
	            return "YES";
	        }
	        return "NO";
	    }

}
