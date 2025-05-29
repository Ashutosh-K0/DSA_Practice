class Leet_11_Container_Water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
// Explanation: The algorithm uses a two-pointer approach to find the maximum area of water that can be contained between two lines.
// The left pointer starts at the beginning of the array and the right pointer starts at the end.
// The area is calculated as the minimum height of the two lines multiplied by the distance between them.
// The pointers are moved inward based on the height of the lines to potentially find a larger area.
// The process continues until the two pointers meet, ensuring that all possible pairs of lines are considered.
// The maximum area found during the process is returned as the result.