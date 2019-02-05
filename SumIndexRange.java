import java.util.Scanner;

public class SumIndexRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int q = sc.nextInt();
	     int arr[] = new int[n];
		     for(int i=0;i<n;i++) {
		    	 arr[i] = sc.nextInt();
		     }
		   for(int i=1;i<=q;i++) {
			     int sum=0;
			   int sind=sc.nextInt();
			   int eind=sc.nextInt();
			   for(int j=sind-1;j<eind;j++) {
				   sum+=arr[j];
			   }
			   System.out.println(sum);
		   }
		   sc.close();
	}

}
