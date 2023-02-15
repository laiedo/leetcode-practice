import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // Arrays类包含了chan[] String[]这些
        String result = "";
        List<char[]> temp = new ArrayList<char[]>();
        //相当于charAt
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i]);
            temp.add(strs[i].toCharArray());
        }
        if (strs.length <= 1) {
            result = strs[0];
        } else {
            out: for (int k = 0; k < strs[0].length(); k++) {
                for (int j = 0; j < strs.length - 1; j++) {
                    // 防止访问下表越界

                    //System.out.println((temp.get(j).getClass()));
                     if (k==temp.get(j+1).length||temp.get(j)[k] != temp.get(j + 1)[k]) {
                        result = strs[0].substring(0, k);
                        break out;
                        /*
                         * if (!rs.contains(temp.get(j + 1)[k])) {
                         * rs.add(temp.get(j + 1)[k]);
                         * }
                         */
                    } else {
                        result = strs[0].substring(0, k+1);
                        /* if (result.length() == 0) {
                            ;
                        } else {
                            result.codePointBefore(result.length() - 1);
                        } */
                        // rs.remove(rs.size()-1);
                        //break out;
                    } 
                }
            }
        }
        // result=String.valueOf(rs);
        return result;
    }

    public static void main(String args[]) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] source = {"ab", "a"};
        // "flower","flow","flight"
        // "dog","racecar","car"
        // "ab", "a"
        String rs = lcp.longestCommonPrefix(source);
        System.out.print(rs);
    }
}
