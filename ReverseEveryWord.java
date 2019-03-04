import java.util.Scanner;

public class ReverseEveryWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			StringBuffer sb = new StringBuffer(arr[i]);
			System.out.print(sb.reverse().toString()+" ");
		}
		sc.close();
	}

}
