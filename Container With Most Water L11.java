class Solution {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int res=0;
        while(l<=r) {
            int max = Math.min(arr[l], arr[r]) * (r-l);
            res= Math.max(max, res);
            if(arr[l]>arr[r]) {
                --r;
            } else {
                ++l;
            }
        }
        return res;
    }
}
