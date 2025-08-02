class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = n-1 ;
        int j = m-1;
        int arr = m+n-1;
        for (int p = m+n-1; p>=0 ; p--)
            if (i <0) break;
            if(nums2[i] <= nums1[j] && j>=0){
            nums1[p] = nums1[j];
            j--;
            }
            else
            nums1[p] = nums2[i];
            i--;
    }
}
