import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindMedianSortedArraysExample {

    public void findMedianSortedArrays(int[] nums1, int[] nums2) {

        double sum=0;

        int[] nums3 = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
        for (int i = 0; i < nums3.length; i++) {
            sum = nums3[i] + 1 / 2;

        }

        System.out.println(sum);

//        return 0.0;
    }


    public static void main(String[] args) {

        FindMedianSortedArraysExample findMedianSortedArraysExample = new FindMedianSortedArraysExample();
        findMedianSortedArraysExample.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4});
    }
}
