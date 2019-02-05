import java.util.Scanner;

public class MinIndexRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int q = sc.nextInt();
	     int arr[] = new int[n];
		     for(int i=0;i<n;i++) {
		    	 arr[i] = sc.nextInt();
		     }
		   for(int i=1;i<=q;i++) {
			    
			   int sind=sc.nextInt();
			   int eind=sc.nextInt();
			   int min=arr[sind-1];
			   for(int j=sind-1;j<eind;j++) {
				   if(arr[j]<min)
					   min=arr[j];
			   }
			   System.out.println(min);
		   }
		   sc.close();
	}

}
