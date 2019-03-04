import java.util.Scanner;

public class KthLargestNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]<arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		System.out.println(arr[k-1]);
		sc.close();
	}
}
