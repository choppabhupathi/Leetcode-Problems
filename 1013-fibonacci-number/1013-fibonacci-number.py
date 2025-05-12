class Solution:
    def fib(self, n: int) -> int:
        if n == 0 or n == 1:
            return n
        prev = 0
        curr = 1
        for i in range(2, n + 1):
            prev, curr = curr, curr + prev
        return curr        

        