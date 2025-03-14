import java.util.*;

public class simple {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the character");
        String let = obj.nextLine();
        String vol[] = {"a","e","i","o","u"};
        int dect = 0;
        int i = 0;
       while (i <=4)
        {
            if(let.equals(vol[i])){
               
                dect = 1;
            }
            i++;
        }
       
      
        
       if(dect == 1){
            System.out.println("it is vowel");
        } 
        else{
              System.out.println("it is not vowel");
        }
        }
      
    }

