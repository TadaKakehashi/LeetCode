public class check {
    public static void main(String[] args) {
        String str = "{[(a)]}";
        System.out.println(isValid(str)); 
    }

    public static boolean isValid(String s) {
        String str = s.trim();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '[' && str.charAt(i + 1) == ']') ||
                    (str.charAt(i) == '{' && str.charAt(i + 1) == '}') ||
                    (str.charAt(i) == '(' && str.charAt(i + 1) == ')')) {
                      
                    str = str.substring(0, i) + str.substring(i +2);
                    i=-1;
            }
        }
        return str.isEmpty();
    }
}
