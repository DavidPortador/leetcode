from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in num_map:
                return [num_map[complement], i]
            num_map[num] = i
        return [-1, -1]

def main():
    aux = [2, 7, 11, 15]
    obj = Solution()
    result = obj.twoSum(aux, 9)
    for i in range(len(result)):
        print(result[i])

if __name__ == "__main__":
    main()