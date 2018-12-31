import java.util.Arrays;
import java.util.Scanner;

public class CheckSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		int dup[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();	
			dup[i] = arr[i];
		}
		Arrays.sort(dup);
		int c=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==dup[i])
				c++;
			else
				break;
		}
		if(c==n)
 		 System.out.println("yes");
		else System.out.println("no");
        sc.close();
	}

}
