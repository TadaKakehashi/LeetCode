public class string2 {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        String s = haystack.trim();
        int hLen = s.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            if (s.charAt(i) == needle.charAt(0)) {
                int j = 0;
                while (j < nLen && s.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }
                if (j == nLen) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad")); // Output: 0
    }
}
