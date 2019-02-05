import java.util.Scanner;

public class RepeatingFirst {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		  for(int i=0;i<n;i++) {
			  arr[i]=sc.nextInt();
		  }
		     int c=0,ans=0;
		   for(int i=0;i<n-1;i++) {
			  for(int j=i+1;j<n;j++) {
				  if(arr[i]==arr[j]) {
					  ans=arr[i];
					  c++;
					  break;
				  }
			  }
			  if(c!=0) break;
		   }
		   if(c==0) System.out.println("Unique");
		   else System.out.println(ans);
		   
		   sc.close();
	}

}
