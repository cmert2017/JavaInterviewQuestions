package CommonQuestions;

public class PalindromeNumber {

    public static boolean isNumberPalindrome(long number){

        //without using string
        long reverse = 0;
        long temp = number;

        while(temp!=0){

            reverse = reverse * 10 + (temp % 10) ;
            temp = temp / 10 ;
        }


        return reverse == number ;
    }


    public static void main(String[] args) {

        System.out.println(isNumberPalindrome(123));
        System.out.println(isNumberPalindrome(123321));

    }


}
