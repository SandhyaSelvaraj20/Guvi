import java.util.Scanner;

public class CompositeNum {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}
		sc.close();
	}

}
