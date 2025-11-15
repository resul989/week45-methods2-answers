class Exercise7 {
    public static void main(String[] args) {
        int[] nums = {3, 9, 2, 7, 1};
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        System.out.println("Max is: " + max);
    }
}