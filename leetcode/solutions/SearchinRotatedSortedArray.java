class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return -1;
        int len = nums.length;
        int start = 0, end = nums.length-1;

        while(start+1<end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target){
                if(nums[mid] > nums[len-1]){
                    if(target > nums[len-1])
                        end = mid;
                    else
                        start = mid;
                }else
                    end = mid;
            }else{
                if(nums[mid] > nums[len-1])
                    start = mid;
                else{
                    if(target > nums[len-1])
                        end = mid;
                    else
                        start = mid;
                }

            }
        }

        if(nums[start] == target)
            return start;

        if(nums[end] == target)
            return end;
        return -1;
    }
}
