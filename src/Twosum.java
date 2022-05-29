import java.util.*;

public class Twosum {
    public static void main(String[] args){
        Twosum ts = new Twosum();
        int[] input = new int[] {3,3};
        int[] results = ts.twoSum(input, 6);
        System.out.println(results[0] + ", " + results[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] resultsIndicies = new int[2];
        Map<Integer, Integer> reverse = new TreeMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            reverse.put(nums[i],i);
        }
        for(int j = 0; j<nums.length; j++){
           if(reverse.containsKey(target - nums[j]) && reverse.get(target - nums[j])!=j)
           {
               resultsIndicies[0] = j;
               resultsIndicies[1] = reverse.get(target - nums[j]);
               return resultsIndicies;
           }
        }
        return resultsIndicies;
    }
}