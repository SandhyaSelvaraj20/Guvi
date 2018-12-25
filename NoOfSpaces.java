import java.util.Scanner;

public class NoOfSpaces {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   String str = sc.nextLine();
		   String arr[] = str.split(" ");
		   int c=0;
		  for(String a:arr) {
			  c++;
		  }
		  System.out.println(c-1);	    
	}

}
