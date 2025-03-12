public class calculate {

        void addition(int x, int y){
            int z = x + y;
            System.out.println(z);
        }
        void sub(int a, int b){
            int c = a + b;
            System.out.println(c);
        }
        void multi(int d, int e){
            int f = d*e;
            System.out.println(f);
        }
        void findremainder(int g, int h){
            int i = g%h;
            System.out.println(i);
        }
        void division(int j, int k){
            int l = j/k;
            System.out.println(l);
        }
        public static void main(String args[]){
            calculate obj=new calculate();
            obj.addition(23, 45);
            obj.sub(23, 34);
            obj.findremainder(34, 45);
            obj.division(34, 3);
        }
    }
