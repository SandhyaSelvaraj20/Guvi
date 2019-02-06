import java.util.Scanner;

public class GnRepeatExists {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int a[] = new int[n];
		boolean flag=false;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]==x) flag=true;
		}
		if(flag==true)
		System.out.println("yes");
		else
			System.out.println("no");
		sc.close();		
	}

}
