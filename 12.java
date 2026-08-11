import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i = 1; i<n; i++){
            for(int k = n-1; k>=i; k--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

Examples:
Input: 5
Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* 


  Input: 3
Output:
* 
* * 
* * * 
* *
*
