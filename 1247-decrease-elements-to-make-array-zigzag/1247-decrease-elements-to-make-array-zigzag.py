class Solution:
    def movesToMakeZigzag(self, nums: List[int]) -> int:
        n = len(nums)
        def get_moves(start):
            res = 0
            for i in range(start, n, 2):
                left = nums[i - 1] if i - 1 >= 0 else float('inf')
                right = nums[i + 1] if i + 1 < n else float('inf')
                min_adj = min(left, right)
                if nums[i] >= min_adj:
                    res += nums[i] - min_adj + 1
            return res
        return min(get_moves(0), get_moves(1))      