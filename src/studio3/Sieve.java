import java.util.Scanner;
public class Sieve {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("n:");
    int n = input.nextInt();
            int[] array = new int[n+1];

    for (int i = 0; i < n+1; i++) {
        array[i] = i;
        System.out.print(array[i]);
    }
        boolean [] isPrime = new boolean [n+1];
        for(int i = 2; i<=n; i++) {
            isPrime[i] = true; 
            if(A[i] = true) {
                for(int j = 1; j<n; j++)
                    j =  i^2 + n * i;
                    A[j] = false;
            }
        
    }
}
