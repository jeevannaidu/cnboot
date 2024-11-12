package SearchingAndSorting;

public class ClosestIndex {

    public static int closestIndex(int[] nums, int target) {
        int leftIndex = 0, rightIndex = nums.length - 1;

        // Edge cases
        if (nums.length == 0) return -1; // Empty array
        if (target <= nums[leftIndex]) return leftIndex; // Target less than the smallest element
        if (target >= nums[rightIndex]) return rightIndex; // Target more than the largest element

        // Binary Search
        while (leftIndex <= rightIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;

            // If target is found, return its index
            if (nums[mid] == target) return mid;

            if (nums[mid] < target) {
                leftIndex = mid + 1;
            } else {
                rightIndex = mid - 1;
            }
        }

        // After binary search, 'left' and 'right' are the closest elements
        // We need to find which one is closer to the target
        if (leftIndex >= nums.length) return rightIndex;
        if (rightIndex < 0) return leftIndex;

        // Return the index with the smallest absolute difference
        return (Math.abs(nums[leftIndex] - target) < Math.abs(nums[rightIndex] - target)) ? leftIndex : rightIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 9, 11, 12, 45};
        int target = 4;
        int result = closestIndex(nums, target);
        System.out.println(result); // Output should be 1
    }
}
