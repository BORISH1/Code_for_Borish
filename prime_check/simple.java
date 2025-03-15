import java.util.*;

public class simple {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the value");
        int num = obj.nextInt();
       int i = 1;
       int count = 0;
       while(i<num){
            if(num%i ==0){
                count = count + 1;
            }
            i++;
       }
       if(count >2){
        System.out.println("it is not prime");
       }
        else {
        System.out.println("it is prime number");
        }

        
    }
}
