public class leetCode2 {
    
    public static void main(String[] args) {
       int[] arr = {8,2,5,15,1};
       int target = 13;

       bubbleSort(arr);
       
       int[] result = twoSumWithBinarySearch(arr, target);
        if(result.length == 2){
            System.out.println("Pair found: "+result[0]+" and "+result[1]);
        }
        else{
            System.out.println("No pair found");
        }
    }

    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static int[] twoSumWithBinarySearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            int index = binarySearch(arr, complement, i+1, arr.length-1);
            if(index != -1){
                return new int[]{arr[i], arr[index]};
            }
        }
        return new int[0];
    }

    static int binarySearch(int[] arr, int target, int start, int end){
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }   
    }


