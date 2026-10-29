package lab3;

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


    public static void main(String[] args){
        CodingBat codingBat = new CodingBat();
        codingBat.doubleX("axxx");
        codingBat.array123(new int[]{11231});
        codingBat.countEvens(new int[]{135});
    }
}
