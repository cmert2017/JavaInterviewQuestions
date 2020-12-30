package CommonQuestions;

public class PrimeNumbers {

    public static boolean isPrime(int num){
        boolean isPrime= true;

        for(int i = 2; i < num/2  ; i++ ){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println("isPrime(5) = " + isPrime(5));
        System.out.println("isPrime(19) = " + isPrime(19));
        System.out.println("isPrime(35) = " + isPrime(35));


    }

}
