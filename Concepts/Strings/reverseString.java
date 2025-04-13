public class reverseString{
    public static void main(String[] args) {
        String str = "TadaGeeks";
        String strRev="";

        // for(int i=str.length()-1;i>=0;i--){
        //     strRev = strRev + str.charAt(i);
        // }
        // System.out.println(strRev);

        //2. Using character array:
        // char a[] = str.toCharArray();
        // for(int i=a.length-1;i>=0;i--){
        //     strRev = strRev+a[i];
        // }
        // System.out.println(strRev);

        //3.String Buffer Class
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }    
}
