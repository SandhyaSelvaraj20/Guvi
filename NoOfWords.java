import java.util.Scanner;

public class NoOfWords {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   String str = sc.nextLine();
		   String arr[] = str.split(" ");
		   int c=0;
		  for(String a:arr) {
			  c++;
		  }
		  System.out.println(c);
		    
	}

}
