import java.util.Arrays;
public class homework1_2 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        removeElement(nums,val);
    }
    public static void removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

}
