package MethodOverflow;

public class simple {
    public void add(int a,int b ){
        System.out.println("answer is "+(a+b));
    }
    void add(int a , int b, int c){
        System.out.println("answer is " +( a+b+c));
    
    }
    public static void main(String[] args) {
        simple obj = new simple();
    obj.add(12,32);
    obj.add(23,343,54);
    }

}
