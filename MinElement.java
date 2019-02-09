import java.util.Arrays;
import java.util.Scanner;

public class MinElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[] = new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		sc.close();
	}

}
