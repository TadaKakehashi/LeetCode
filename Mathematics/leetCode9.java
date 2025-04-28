public class leetCode9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1211));
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x){
        if(x<0) return false;
        int number = x;
        int rev = 0;
        while(number>0){
            int digit = number%10;
            rev =  (rev*10)+digit;
            number = number/10;
        }
        return x == rev;
    }
}
