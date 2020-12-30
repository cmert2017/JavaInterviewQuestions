package Amazon;

import java.util.LinkedHashMap;
import java.util.Map;

//Today-> Amazon interview question:
//String sent =“three three three two two”;
//Write a method to return “three”
public class JAVA_NOV27_2020 {
    public static void main(String[] args) {
        String sent = "three three three two two";

    }


    public static String repeatedThree(String str){
        String result="";
        String[] strArray = str.split(" ");
        int count = 0;
        Map<String,Integer> countMap = new LinkedHashMap<>();

        for (int i = 0; i < strArray.length; i++) {
            if(countMap.containsKey(strArray[i])){
                count++;
                
            }else{
                count++;
                countMap.put(strArray[i],count);
            }
        }






        return result;
    }


}
