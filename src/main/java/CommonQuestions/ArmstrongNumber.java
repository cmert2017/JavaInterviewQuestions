package CommonQuestions;

public class ArmstrongNumber {

    //153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 +27 = 153

    public static boolean isArmstrong(int num){
        boolean isArmstrong = false;

        String value = String.valueOf(num);
        int power = value.length();
        int sum = 0;

        for (int i = 0; i < power; i++) {
            sum+=Math.pow(Integer.valueOf(""+value.charAt(i)),power);
            System.out.println("sum = " + sum);
        }


        if(sum==num){
            isArmstrong=true;
        }


        return isArmstrong;
    }


    public static void main(String[] args) {

        System.out.println("isArmstrong(153) = " + isArmstrong(153));


    }

}
