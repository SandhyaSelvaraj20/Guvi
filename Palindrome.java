import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int res=n;
	       int r,rev = 0;
	       while(n>0) {
	    	   r=n%10;
	    	   rev=rev*10+r;
	    	   n=n/10;
	       }
	       if(res==rev)
	    	   System.out.println("yes");
	       else
	    	   System.out.println("no");
	}

}
