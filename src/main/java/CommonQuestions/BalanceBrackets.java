package CommonQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBrackets {

    public static void main(String[] args) {
        String str = "{[()]}";
        String str2 = "{[()]}]";
        String str3 = "{([])";
        String str4 = "{([";
        System.out.println("isBalanced(str) = " + isBalanced(str));
        System.out.println("isBalanced(str2) = " + isBalanced(str2));
        System.out.println("isBalanced(str3) = " + isBalanced(str3));
        System.out.println("isBalanced(str4) = " + isBalanced(str4));
    }

    public static boolean isBalanced(String str){

        String open ="{[(";
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

//        if(str.length()%2!=0){
//            return false;
//        }
        //or we can use return stack.isEmpty()

        for (int i = 0; i < str.length(); i++) {
            if(open.contains(""+str.charAt(i))){
                stack.push(str.charAt(i));
            }else {

                if( stack.isEmpty() || str.charAt(i)!=map.get(stack.pop())){
                    return false;
                }
            }
        }
       return stack.isEmpty();
    }

}
