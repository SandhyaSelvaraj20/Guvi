import java.util.Scanner;

public class GnRepetitions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int a[] = new int[n];
		int c=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]==x) c++;
		}
		System.out.println(c);
		sc.close();		
	}

}
