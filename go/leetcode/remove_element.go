package leetcode

import (
	"slices"
)

func removeElement(nums []int, val int) int {
	slices.SortFunc(
		nums,
		func(i, j int) int {
			if i == val {
				return 1
			}

			return -1
		},
	)

	index := findFirstIndex(nums, val)

	if index == -1 {
		return len(nums)
	}

	return index
}

func findFirstIndex(slice []int, item int) int {
	for i, v := range slice {
		if v == item {
			return i
		}
	}

	return -1
}
