package agh.po.lab3;

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


    public static void main(String[] args){
        CodingBat codingBat = new CodingBat();
        codingBat.doubleX("axxx");
        codingBat.array123(new int[]{1,1,2,3,1});
        codingBat.countEvens(new int[]{1,3,5});
        codingBat.withouEnd2("Hello");
    }
}
