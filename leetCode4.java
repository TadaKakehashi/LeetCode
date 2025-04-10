//Length of Last Word
public class leetCode4 {
    public static void main(String[] args) {
        String s =" fly me to the moon ";
        System.out.println(lastEndNum(s));
    }

    public static int lastEndNum(String s){
        s = s.trim();
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}
