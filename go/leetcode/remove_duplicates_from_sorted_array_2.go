package leetcode

func removeDuplicates2(nums []int) int {
	duplicates := 0
	for i := 1; i < len(nums)-2; i++ {
		if i+1+duplicates == len(nums) {
			break
		}

		if nums[i-1] == nums[i] && nums[i] == nums[i+1] {
			makeLastShifting(nums, i)
			duplicates++
			i--
		}
	}

	return len(nums) - duplicates
}

func makeLastShifting(arr []int, i int) {
	if i == len(arr)-1 {
		return
	}

	value := arr[i]
	for ; i < len(arr)-1; i++ {
		arr[i] = arr[i+1]
	}

	arr[len(arr)-1] = value
}
