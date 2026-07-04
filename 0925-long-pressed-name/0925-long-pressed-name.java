class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int np=0;
        int tp=0;
        while(np < name.length() && tp < typed.length()){
            if(name.charAt(np) == typed.charAt(tp)){
                np++;tp++;
            }else if (tp > 0 && typed.charAt(tp) == typed.charAt(tp - 1)) {
                tp++;
            } else {
                return false;
            }
        }
        while (tp < typed.length()) {
            if (typed.charAt(tp) != typed.charAt(tp - 1))
                return false;
            tp++;
        }

        return np == name.length();
    }
}