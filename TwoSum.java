public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
        
    }

    public static void printArray(int array[]){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(" " + i + " ");
            
        }
        System.out.print("]");
    }

    public static void main(String[] args){
        int nums[] = {2,7, 11, 15};

        printArray(twoSum(nums, 9));



    }
}