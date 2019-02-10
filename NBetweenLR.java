import java.util.Scanner;

public class NBetweenLR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		if(num>l && num<r)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}
}
