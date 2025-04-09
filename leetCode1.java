
//Two Sum
public class leetCode1{
    public static void main(String args[]){
        int[] arr = {2,6,5,8,11};
        int target = 14;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[i]+arr[j]== target){
                    System.out.println(arr[i]+ "+"+ arr[j]+ "=" +target);
                }
            }
        }
    }
}