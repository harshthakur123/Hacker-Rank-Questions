
public class Utopian_tree {

	public static void main(String[] args) {
		System.out.println("Resutl="+utopianTree(5));

	}
	public static int utopianTree(int n) {
	    // Write your code here
	   
	    int height=1;
	    if(n==0){
	        return height;
	    }
	    
	    for(int cycle=1;cycle<=n;cycle++){
	        if(cycle%2==0){
	            height++;
	           
	        }else{
	            height*=2;
	           
	        }
	    }
	    return height;

	    }

}
