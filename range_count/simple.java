public class simple {
    public static void main(String[] args) {
        int total =0;
        for(int i = 2020;i<=2030;i++){
            if(i%4==0){
                total = total +1;
            }
        }
        System.out.println(total + " is total no. of leap year");
    }
}
