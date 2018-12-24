import java.util.Arrays;
import java.util.Scanner;

public class MedianElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n =sc.nextInt();
	    int arr[] = new int[n];
	    int m = n/2;
	    
	    for(int i=0;i<n;i++) {
	        arr[i]=sc.nextInt();	
	    }
	    Arrays.sort(arr);
	    System.out.println(arr[m]); 
	}
}
