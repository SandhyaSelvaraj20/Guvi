import java.util.Scanner;

public class EqualIndex {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      int arr[] = new int[n];
	      for(int i=0;i<n;i++) {
	    	  arr[i] =sc.nextInt();  
	      }
	      String res="";
	      boolean flag=false;
	      for(int i=0;i<n;i++) {
	    	  if(arr[i]==i) {
	    		  res+= i+" ";
	    		  flag=true;
	      }
	      }
	      if(flag==true) System.out.println(res);
	      else
	    	  System.out.println("-1");
	      sc.close();
	}

}
