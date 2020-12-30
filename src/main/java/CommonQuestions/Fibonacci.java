package CommonQuestions;

public class Fibonacci {


    public static void main(String[] args) {
      //  fib(5);
       // System.out.println();
        System.out.println("fib2(4) = " + fib2(4));
    }

    //0 1 1 2 3 5

    public static void fib(int num){

        int a = 0;
        int b = 1;
        int next;
        System.out.print(a);
        for (int i = 1 ; i < num ; i++) {
            System.out.print(" " + b);
             next = a + b;
             a = b ;
             b = next;
        }

    }

    public static int fib2(int num){

        if(num == 0){
            return 0;
        }
        if (num==1){
            return 1;
        }

        return fib2(num-1)  + fib2(num-2);
    }


}
