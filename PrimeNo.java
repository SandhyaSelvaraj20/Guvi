import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n =sc.nextInt();
	    int count=0;
	    for(int i=1;i<=n;i++) {
	    	if(n%i==0)
	    		count++;
	    }
	    if(count==2)
	    	System.out.println("yes");
	    else 
	    	System.out.println("no");
	    sc.close();
	}

}
