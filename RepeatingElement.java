import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		 ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			for(int i=1;i<n;i++) {
				if(arr[i-1]==arr[i])
					al.add(arr[i]);
			}
			int res=0;
			for(int i=1;i<al.size();i++) {
				if(al.get(i-1)==al.get(i))
					al.remove(i);
			}
			for(int i=0;i<al.size();i++) {
				System.out.print(al.get(i)+" ");
			}
			
			sc.close();
	}

}
