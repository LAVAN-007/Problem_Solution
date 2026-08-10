import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
	    for(int i = 1; i<=n; i++){
	         int temp = 5;
	        for(int j = 1 ; j<=i; j++){
	            System.out.print(temp+" ");
	            temp--;
	        }
	        System.out.println();
	    }
	    sc.close();
	}
}