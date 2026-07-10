class Solution {
    public boolean isFascinating(int n) {
        int [] arr = new int[10];

        int sqr = 2*n;
        int cube = 3*n;

        String s1 ="" + n + sqr + cube;
        for(int i = 0; i < s1.length(); i ++){

            int digit = s1.charAt(i) - '0' ;   
            arr[digit]++;
            
        }
        if(arr[0] >0 )return false;

        for(int i = 1; i <= 9; i++){
            if(arr[i] != 1)return false;
        }
        return true;
        
    }
}