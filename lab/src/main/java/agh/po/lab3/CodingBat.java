package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    boolean doubleX(String str) {
        for (int i=0; i <str.length()-1; i++){
            if (str.charAt(i)=='x'){
                if(str.charAt(i+1)=='x'){
                    return true;
                }
                return false;
            }
        }
        return false;
    }
    boolean array123(int[] nums) {
        for (int i=0; i < nums.length-2; i++){
            if (nums[i]==1){
                if(nums[i+1]==2){
                    if(nums[i+2]==3){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    int countEvens(int[] nums) {
        int ilosc = 0;
        for(int i=0; i < nums.length; i++){
            if (nums[i]%2==0){
                ilosc = ilosc + 1;
            }
            else{
                ilosc = ilosc;
            }
        }
        return ilosc;
    }

    public String withouEnd2(String str) {
        if (str.length() < 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }


    public static void main(String[] args){
        CodingBat codingBat = new CodingBat();
        codingBat.doubleX("axxx");
        codingBat.array123(new int[]{1,1,2,3,1});
        codingBat.countEvens(new int[]{1,3,5});
        codingBat.withouEnd2("Hello");
        codingBat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake")));
    }
}
