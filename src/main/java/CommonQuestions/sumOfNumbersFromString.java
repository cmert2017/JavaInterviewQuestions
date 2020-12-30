package CommonQuestions;

public class sumOfNumbersFromString {

    public static void main(String[] args) {

        System.out.println(getSumOfNumbers("jav45ai15sgre100at82"));
        System.out.println(getSumOfNumbers("abc12sd400sa9dnh83"));

    }
    public static int getSumOfNumbers(String str) {
        //jav45ai15sgre1at82

        int sum = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                num += str.charAt(i);
                if (i == str.length()-1 || !Character.isDigit(str.charAt(i + 1))){
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        return sum;


    }


}
