package M3_ass6; /**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 * 
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 * 
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 * 
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 * 
 * @author Siva Sankar
 */

import java.util.*;

public class Stats {

    /**
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr, the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(int[] arr) {
        //  Your code goes here....
        int mean=0;
        if(arr.length==0)
            return 0.0;
        else {
            for (int i = 0; i < arr.length; i++) {
                mean = mean + arr[i];
            }
            int s=arr.length;
            double e = (mean/s);
            return e;
        }
    }

    /**
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     * 
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     * 
     * @param arr, the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(int[] arr) {
        //  Your code goes here...
        int l= arr.length;
        double med= (l/2);
        if(l==0)
            return 0.0;
        else{
            if (l%2==1){
                int n=l/2;
                Arrays.sort(arr);
                double k= arr[n];
                return k;
            }else{
                int n =l/2;
                 Arrays.sort(arr);
                double w = (arr[n-1] + arr[n]) / 2.0;
                return w;
            }
        }
    }

    /**
     * This method returns the mode of the array. If there is no mode, then it returns
     * 0 as the mode.
     * 
     * @param arr, the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(int[] arr) {
        //  Your code goes here....
        double r=arr.length;
        int a=0;
        int count=0;
        for (int i=0; i<r; i++){
            int b=arr[i];
            int count1=0;
            for (int j=0; j<r; j++){
                if(arr[j]==b){
                    count1++;
                    int max=count1;
                    if(max==1){
                        a=0;}
                    else if(max==4) {
                        a = arr[j - 3];
                    }
                    else{
                        a=arr[i];}
                    }

                }
            }
        return a;
    }

    /**
     * This method returns the variance of the input array.
     * Make use of the mean functon which has already written.
     * 
     * @param arr, the input array
     * @return the variance of the array.
     */
    public static double variance(int[] arr) {
        //  Your code goes here....
        double mean=0;
        if(arr.length==0)
            return 0.0;
        else{
            for(int i=0;i<arr.length;i++){
                mean=mean+arr[i];
            }
            int l=arr.length;
            double m=(mean/l);
            double p=0;
            for(int i=0;i<arr.length;i++){
                double q=0;
                q=m-arr[i];
                p=p+(q*q);
            }
            return (p/l);
        }
    }


    /**
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr, the input array
     * @return the standard deviation of the input array.
     */

    public static double standardDeviation(int[] arr) {
        //  Your code goes here....
        double mean=0;
        if(arr.length==0)
            return 0.0;
        else {
            for (int i = 0; i < arr.length; i++) {
                mean = mean + arr[i];
            }
            int k = arr.length;
            double m = (mean / k);
            double p = 0;
            for (int i = 0; i < arr.length; i++) {
                double q = 0;
                q = m - arr[i];
                p = p + (q * q);
            }
            double m1 = (p / k);
            double l = Math.sqrt(m1);
            return l;
        }
    }
}