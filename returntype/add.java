package returntype;

public class add{
        public int addition(int a, int b)
    {
         int c = a+b;
        return c;
    }   
    public static void main(String[] args) {
        add obj = new add();
        int k = obj.addition(12,34);
        System.out.println(k);
    }
        
    }

