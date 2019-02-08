package ZmeevHome;

import java.util.Arrays;

public class Circle {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i])
                return new int[] {i, j};
            }
        } throw new IllegalArgumentException("There is no two arguments");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Circle.twoSum(new int[]{1, 2, 3, 4}, 4)));
    }
}
