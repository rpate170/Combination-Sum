class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findCombination(result, list, candidates, target, 0);
        return result;
    }
    public void findCombination (List<List<Integer>> result, List<Integer> list, int[] candidate, int target, int current) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList(list));
            return;
        }
        for (int i = current; i < candidate.length; i++) {
            list.add(candidate[i]);
            findCombination(result, list, candidate, target-candidate[i], i);
            list.remove(list.size()-1);
        }
    }
}