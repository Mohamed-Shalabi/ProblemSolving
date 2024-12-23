package leetcode

import "slices"

func majorityElement(nums []int) int {
	slices.Sort(nums)
	maxVal := 0
	maxValRep := 0

	val := nums[0]
	valRep := 0

	for _, n := range nums {
		if n != val {
			val = n
			valRep = 0
		}

		valRep++
		if valRep > maxValRep {
			maxValRep = valRep
			maxVal = val
		}
	}

	return maxVal
}
