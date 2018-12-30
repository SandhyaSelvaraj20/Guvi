import java.util.Scanner;

public class ElemetIsPresent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		for(int i=0;i<n;i++) {
    			if(arr[i]==k) {
				flag=true;
				break;
			}
			else
				continue;
		}
		if(flag==true) System.out.println("yes");
		else System.out.println("no");
		sc.close();
	}

}
