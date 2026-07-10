class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> nums3=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                nums3.add(nums1[i]);
                i++;
            }
            else
            {
                nums3.add(nums2[j]);
                j++;
            }
        }
        for(;i<m;i++)
        {
            nums3.add(nums1[i]);
        }
        for(;j<n;j++)
        {
            nums3.add(nums2[j]);
        }
        for (int k = 0; k < nums3.size(); k++) {
            nums1[k] = nums3.get(k);
             }
    }
}