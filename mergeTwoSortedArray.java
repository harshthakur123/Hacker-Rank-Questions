import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class mergeTwoSortedArray {

	public static void main(String[] args) {
		int[] a= {1,3,5};
		int [] b= {2,4,6};
		
		sortStaticArray(a, b);
		System.out.println();
		ArrayList<Integer> c=new ArrayList<>(Arrays.asList(1,3,5));
		ArrayList<Integer> d=new ArrayList<>(Arrays.asList(2,4,6));
		
		sortDynamicArray(c,d);
		
		
	}
	
	public static void sortStaticArray(int []a,int[] b) {
		
		int i=0,j=0,k=0;
		int [] mergedArray=new int[a.length+b.length];
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				mergedArray[k++]=a[i++];
			}else {
				mergedArray[k++]=b[j++];
			}
		}
		
		while(i<a.length) {
			mergedArray[k++]=a[i++];
		}
		
		while(j<b.length) {
			mergedArray[k++]=b[j++];
		}
		
		for(int n:mergedArray) {
			System.out.print(n+" ");
		}
		
	}
	
	public static void sortDynamicArray(ArrayList<Integer> l1,ArrayList<Integer>l2) {
		
		l1.addAll(l2);
		Collections.reverse(l1);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1.toString());
		
	}

}
