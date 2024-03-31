public class LeetLargestPalindromicSubStringWithoutInbulitMethod {
    public static void main(String[] args) {
        String s = "abcdf";
        LeetLargestPalindromicSubStringWithoutInbulitMethod.checkPalindrome(s);
        System.out.println(LeetLargestPalindromicSubStringWithoutInbulitMethod.checkPalindrome(s));
    }

    public static String checkPalindrome(String s) {
        if (s.length()>1) {
            StringBuilder subString;
            StringBuilder temp = new StringBuilder("");
            for (int i = 0; i < s.length(); i++) {
                if (temp.length() > s.length() - 1) {
                    break;
                } else {
                    for (int j = s.length(); j > i; j--) {
                        if (temp.length() > s.length() - 1) {
                            break;
                        } else {
                            subString = new StringBuilder(s.substring(i, j));
                            if (subString.length() > temp.length()) {
                                int count = 0;
                                for (int k = 0; k <= subString.length() / 2; k++) {
                                    if (subString.charAt(k) != subString.charAt(subString.length() - k-1)) {
                                        break;
                                    } else {
                                        count++;
                                        if (count == subString.length() / 2) {
                                            temp = subString;
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
            if(temp.isEmpty()){
                return Character.toString(s.charAt(0));
            }
            else{
                return temp.toString();
            }

        }
        else if(s.length()==1){
            return s;
        }
        else {
            return "no Result";
        }
    }
}
