import java.util.Scanner;

public class CapsFirstWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			String test = arr[i];
			System.out.print(test.substring(0,1).toUpperCase()+test.substring(1)+" ");
		}
		  System.out.println();
		  sc.close();
	}
}
