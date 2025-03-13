package dynamic_calculation;

import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Choose any option");
        System.out.println("option1:addition \n option2: substraction \n option3:multiplication \n option4 : division");
        int choose = input.nextInt();
       
        if(choose == 1){
            System.out.println("input two number");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int x = num1+num2;
            System.out.println("sum is"+x);
        }
        else if(choose == 2){
            System.out.println("input two number");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int x = num1-num2;
            System.out.println("substract is "+x);
        }
        else if(choose == 3){
            System.out.println("input two number");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int x = num1*num2;
            System.out.println("multiplication is "+x);
        }
        else if(choose == 4){
            System.out.println("input two number");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int x = num1/num2;
            System.out.println("divisiion is "+x);
        }
        else{
            System.out.println("wrong choose");
        }
    }
}
