package M3_ass3;

/**
 * Given an array of Integers, return an array of the square
 * of each values in the array. 
 * 
 * Input : {1, 2, 3}
 * Output : {1, 4, 9}
 * 
 * @author Siva Sankar
 * @author Mayank
 */

public class Squares {

    /**
     * This method returns the array of ints that are squares of each element
     * in the input array.
     * 
     * @param nums, the input array.
     * 
     * @return the array of ints that are squares of each element
     * in the input array.
     * 
     */
    public static int[] squared(int[] nums) {
        //  Your code goes here.
       for (int i=0; i<nums.length; i++) {
           nums[i] = nums[i] * nums[i];
       }
           return nums;

    }
}