/**
 * @author GuyCui
 * @date 2021/3/25
 * @apiNote
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 4, 7};
        int binarySearch = blueOrRed(array, 4);
        int a = binarySearch(array,3);
        System.out.println(binarySearch);
        System.out.println(a);
    }
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        // 思考为什么 right 的赋值是 nums.length - 1 而不是 nums.length
        int right = nums.length - 1;
        // 思考为什么 while 循环使用 <= 而不是 <
        while (left <= right) {
            // int mid = left + (right - left) / 2;
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int blueOrRed(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        while (left++ != right) {
            int mid = left + (right - left) / 2;
            boolean blue = isBlue(nums[mid],target);
            if (blue) {
                left = mid;
            } else {
                right = mid;
            }
            return Boolean.TRUE.equals(blue) ? left : right;
        }
        return -1;
    }

    public static boolean isBlue(int mid,int target) {
        boolean isStatus = Boolean.TRUE;
        if (mid >= target){
            isStatus = Boolean.FALSE;
        }
        return isStatus;
    }
}
