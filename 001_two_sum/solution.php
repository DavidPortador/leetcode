<?php

class Solution {
    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($nums, $target) {
        $numMap = array();
        for ($i = 0; $i < count($nums); $i++) {
            $complement = $target - $nums[$i];
            if (array_key_exists($complement, $numMap)) {
                return array($numMap[$complement], $i);
            }
            $numMap[$nums[$i]] = $i;
        }
        return array(-1, -1);
    }
}

$obj = new Solution();
$aux = array(2, 7, 11, 15);
$result = $obj->twoSum($aux, 9);
for ($i = 0; $i < count($result); $i++) {
    echo $result[$i] . "\n";
}

?>