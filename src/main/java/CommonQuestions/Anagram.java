package CommonQuestions;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        String[] arrStr1 = str1.toLowerCase().split("");
        System.out.println("arrStr1 = " + Arrays.toString(arrStr1));
        String[] arrStr2 = str2.toLowerCase().split("");
        System.out.println("arrStr2 = " + Arrays.toString(arrStr2));

        Arrays.sort(arrStr1);
        System.out.println("After sorting arrStr1 = " + Arrays.toString(arrStr1));
        Arrays.sort(arrStr2);
        System.out.println("After sorting arrStr2 = " + Arrays.toString(arrStr2));

        System.out.println("arrStr1.length = " + arrStr1.length);

        return Arrays.equals(arrStr1, arrStr2);
    }


    //alternative way
    public static boolean isAnagram2(String a, String b) {

        a = a.replaceAll(" ", "").toLowerCase();
        b = b.replaceAll(" ", "").toLowerCase();
        if (a.length() == b.length()) {
            for (int i = 0; i <= a.length() - 1; i++) {
                if (b.contains("" + a.charAt(i))) {
                    b = b.replaceFirst("" + a.charAt(i), "");
                }
            }
        }

        if (b.length() == 0) {
            return true;
        }
        return false;
    }



    //another alternative way
    public static boolean isAnagram3(String one, String two) {

        if(one.length() != two.length()) return false;

        one = one.toLowerCase();
        two = two.toLowerCase();

        int [] counter = new int[26];
        // a -> 0
        // b -> 1
        // z -> 25

        for(int i= 0; i < one.length(); i++) {

            char oneLetter = one.charAt(i);
            char twoLetter = two.charAt(i);

            // apple
            //counter[0] = counter[0] + 1;
            // a -> 97 ascii value
            // b -> 98

            counter[oneLetter - 97] = counter[oneLetter - 97] + 1;
            counter[twoLetter - 97] = counter[twoLetter - 97] - 1;

        }

        return Arrays.equals(counter, new int[26]);

    }


    public static void main(String[] args) {

        System.out.println("isAnagram(\"care\",\"race\") = " + isAnagram("care", "race"));

        System.out.println("isAnagram2(\"care\", \"race\") = " + isAnagram2("care", "race"));

    }

}

