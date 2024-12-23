package leetcode

func removeDuplicates(nums []int) int {
	duplicates := 0
	for i := 0; i < len(nums)-1; i++ {
		if i+1+duplicates == len(nums) {
			break
		}

		if nums[i] == nums[i+1] {
			makeLastShifting(nums, i)
			duplicates++
			i--
		}
	}

	return len(nums) - duplicates
}
