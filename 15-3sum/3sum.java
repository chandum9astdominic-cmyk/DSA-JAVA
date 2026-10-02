class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
//finds the length
        int n = nums.length;
// list inside list 
        List<List<Integer>> ans = new ArrayList<>();
// set list
        HashSet<List<Integer>> uniqueTriplets = new HashSet<>();
// loop for a 
        for (int i = 0; i < n; i++) {
// taking a with -
            int target = -nums[i];
// new set for every elemt 
            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int third = target - nums[j];

                if (set.contains(third)) {

                    List<Integer> trip = new ArrayList<>();

                    trip.add(nums[i]);
                    trip.add(nums[j]);
                    trip.add(third);

                    Collections.sort(trip);

                    uniqueTriplets.add(trip);
                }

                set.add(nums[j]);
            }
        }

        ans.addAll(uniqueTriplets);

        return ans;
    }
}