//Integer to Roman
public class leetCode12 {
    public static void main(String[] args) {
        int num = 3749;
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] ch = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();
        for(int i=0;i<val.length;i++){
           while(num>=val[i]){
               num -= val[i];
               result.append(ch[i]);
           }
        }

        System.out.println(result.toString());
    }
}
