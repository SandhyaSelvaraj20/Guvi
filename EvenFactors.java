import java.util.Scanner;

public class EvenFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
          for(int i=2;i<=n;i+=2) {
        	  if(n%i==0)
        		  System.out.print(i +" ");
          }
          System.out.println();
          sc.close();
	}

}
