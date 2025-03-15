import java.util.*;

public class simple {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter how many number do you want to addition");
        int n = obj.nextInt();
        int sum = 0;
        System.out.println("Enter the number");
        int num[] = new int[n+1];
        int i = 1;
        while (i<=n) {
            num[i] = obj.nextInt();
           i++;
        } 
        int j = 1;
        while (j<=n) {
           sum = sum + num[i-1];
            j++;
       
        }
      System.out.println("The total of sum of "+n+" number is " + sum);
     
}


}
 