package integer_to_roman;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
        public int[] twoSum(int[] nums, int target) {

            //iterate thru the array
            //check for the indices that will add up to the target

            for (int i : nums){
                System.out.println("actual values: " + i);
            }

            for (int i=0; i< nums.length; i++) {
                System.out.println("index: " + i);
            }
                System.out.println("sum: " + Arrays.stream(nums).sum());
            int sum = nums[0] + nums[2];
            System.out.println("indices sum: " + sum);


            return null;
        }

    public static void main(String[] args) {
            String name = "   dennis nderitu mazindere   ";
        System.out.println(name);
        String petName = name.trim();
        System.out.println(petName);
    }
}



