class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int firstlarg =-1;
        int secondlarg =0;
        for(int num:arr){
            if(num>firstlarg){
                secondlarg=firstlarg;
                firstlarg=num;
            }else if(num>secondlarg && num<firstlarg){
                secondlarg =num;
            }
        }
        return secondlarg;
    }
}