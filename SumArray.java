import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int sum=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}

}
