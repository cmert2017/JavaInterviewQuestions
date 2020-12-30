package CommonQuestions;

public class SecondMaxNumber {

    public static int secondMax(int ... arr){ //... means var args : variable arguments

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(secondMax<arr[i] && arr[i] < max){
                secondMax = arr[i];
            }
        }

        return secondMax;
    }





    public static void main(String[] args) {

        System.out.println("secondMax(1,2,3,4,5,6,7) = " + secondMax(1, 7,2, 3, 4, 7,5, 16, 7));
    }
}
