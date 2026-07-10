class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for (char ch : sentence.toCharArray()) {
            arr[ch - 'a'] = 1;
        }
        for (int arr1 : arr) {
            if(arr1 != 1) return false;
        }return true;
    }
}