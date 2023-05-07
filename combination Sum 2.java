class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(candidates, target, res, nums, 0);
        return res;
    }

    public void combinationSum(int[] candidates, int target, List<List<Integer>> res, List<Integer> nums, int start) {
        if(target<0)  {
            return;
        }

        if(target==0) {
            res.add(new ArrayList<>(nums));
            return;
        }

        for(int i=start;i<candidates.length;i++) {
            if(i > start && candidates[i] == candidates[i-1]) continue;
            nums.add(candidates[i]);
            combinationSum(candidates, target-candidates[i], res, nums, i+1);
            nums.remove(nums.size()-1);
        }
    }
}
