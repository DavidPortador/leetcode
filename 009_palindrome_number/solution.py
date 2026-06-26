import math

class Solution:
    def isPalindrome(self, x: int) -> bool:
        n = x
        r = 0
        d = 10
        if n >= 0 and n < d:
            return True
        while n > 0:
            mod = n % d
            n = math.floor(n / d)
            r = r * d + mod
        return x == r

def main():
    obj = Solution()
    print(obj.isPalindrome(1001))

if __name__ == "__main__":
    main()