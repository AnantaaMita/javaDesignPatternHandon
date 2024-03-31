public class LeetLargestPalindromicSubString {
    public static void main(String[] args) {
        String s = "twbiqwtafgjbtolwprpdnymaatlbuacrmzzwhkpvuwdtyfjsbsqxrlxxtqkjlpkvpxmlajdmnyepsmczmmfdtjfbyybotpoebilayqzvqztqgddpcgpelwmriwmoeeilpetbxoyktizwcqeeivzgxacuotnlzutdowiudwuqnghjgoeyojikjhlmcsrctvnahnoapmkcrqmwixpbtirkasbyajenknuccojooxfwdeflmxoueasvuovcayisflogtpxtbvcxfmydjupwihnxlpuxxcclbhvutvvshcaikuedhyuksbwwjsnssizoedjkbybwndxpkwcdxaexagazztuiuxphxcedqstahmevkwlayktrubjypzpaiwexkwbxcrqhkpqevhxbyipkmlqmmmogrnexsztsbkvebjgybrolttvnidnntpgvsawgaobycfaaviljsvyuaanguhohsepbthgjyqkicyaxkytshqmtxhilcjxdpcbmvnpippdrpggyohwyswuydyrhczlxyyzregpvxyfwpzvmjuukswcgpenygmnfwdlryobeginxwqjhxtmbpnccwdaylhvtkgjpeyydkxcqarkwvrmwbxeetmhyoudfuuwxcviabkqyhrvxbjmqcqgjjepmalyppymatylhdrazxytixtwwqqqlrcusxyxzymrnryyernrxbgrphsioxrxhmxwzsytmhnosnrpwtphaunprdtbpwapgjjqcnykgspjsxslxztfsuflijbeebwyyowjzpsbjcdabxmxhtweppffglvhfloprfavduzbgkw";
        LeetLargestPalindromicSubString.checkPalindrome(s);
        System.out.println(LeetLargestPalindromicSubString.checkPalindrome(s));
    }

    public static String checkPalindrome(String s) {
        if (!s.isEmpty()) {
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
                            if (subString.toString().equals(subString.reverse().toString()) && subString.length() > temp.length()) {
                                temp = subString;
                            }
                        }
                    }
                }
            }
            return temp.toString();
        } else {
            return "no Result";
        }
    }
}
