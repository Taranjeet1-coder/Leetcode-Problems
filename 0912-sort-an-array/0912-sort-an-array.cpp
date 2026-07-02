class Solution {
public:
    int medianOfThree(vector<int>& nums, int low, int high) {
        int mid = low + (high - low) / 2;
        if (nums[low] > nums[mid]) swap(nums[low], nums[mid]);
        if (nums[low] > nums[high]) swap(nums[low], nums[high]);
        if (nums[mid] > nums[high]) swap(nums[mid], nums[high]);
        return nums[mid];
    }
    int partition(vector<int>& nums, int low, int high) {
        int pivot = medianOfThree(nums, low, high);
        int i = low, j = high;
        while (i <= j) {
            while (nums[i] < pivot) i++;
            while (nums[j] > pivot) j--;
            if (i <= j) {
                swap(nums[i], nums[j]);
                i++;
                j--;
            }
        }
        return i;
    }
    void quickSort(vector<int>& nums, int low, int high) {
        while (low < high) {
            int index = partition(nums, low, high);
            if (index - low < high - index) {
                quickSort(nums, low, index - 1);
                low = index;
            } else {
                quickSort(nums, index, high);
                high = index - 1;
            }
        }
    }
    vector<int> sortArray(vector<int>& nums) {
        quickSort(nums, 0, nums.size() - 1);
        return nums;
    }
};