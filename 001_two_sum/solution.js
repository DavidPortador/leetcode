/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const numMap = new Map();
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (numMap.has(complement)) {
            return [numMap.get(complement), i];
        }
        numMap.set(nums[i], i);
    }
    return [-1, -1];
};

function main() {
    const aux = [2, 7, 11, 15];
    const result = twoSum(aux, 9);
    for (let i = 0; i < result.length; i++) {
        console.log(result[i]);
    }
}

main();